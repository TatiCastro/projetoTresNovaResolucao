package acc.br.projetotres;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {
    @Autowired
    public ScoreRepository scoreRepo;

    @GetMapping("/")
    public String playGame(Model model) {
        Score score = scoreRepo.findScore();
        if (score == null) {
            score = new Score();
            scoreRepo.save(score);
        }
        model.addAttribute("score", score.getScore());
        return "game";
    }

    @PostMapping("/play")
    public String play(String choice, Model model) {
        // Lógica do jogo
        String[] options = {"pedra", "papel", "tesoura"};
        String computerChoice = options[(int) (Math.random() * 3)];

        String result = determineWinner(choice, computerChoice);
        Score score = scoreRepo.findScore();
        if ("ganhou".equals(result)) {
            score.setScore(score.getScore() + 1);
            scoreRepo.save(score);
        }

        model.addAttribute("result", result);
        model.addAttribute("computerChoice", computerChoice);
        model.addAttribute("score", score.getScore());
        return "game";
    }

    @PostMapping("/reset")
    public String resetScore(Model model) {
        Score score = scoreRepo.findScore();
        if (score != null) {
            score.setScore(0);
            scoreRepo.save(score);
        }
        model.addAttribute("score", 0);
        return "game";
    }

    private String determineWinner(String playerChoice, String computerChoice) {
        if (playerChoice.equals(computerChoice)) {
            return "empate";
        }
        if ((playerChoice.equals("pedra") && computerChoice.equals("tesoura")) ||
                (playerChoice.equals("papel") && computerChoice.equals("pedra")) ||
                (playerChoice.equals("tesoura") && computerChoice.equals("papel"))) {
            return "ganhou";
        } else {
            return "perdeu";
        }
    }
}
