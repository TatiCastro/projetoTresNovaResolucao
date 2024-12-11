package acc.br.projetotres;

import org.springframework.data.annotation.Id;

public class Score {

        @Id
        private Long id;
        private int score;

        public Score() {
            this.score = 0; // Inicializa o score como 0
        }

        public Score(int score) {
            this.score = score;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }
}
