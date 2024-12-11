package acc.br.projetotres;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

public interface ScoreRepository extends CrudRepository <Score, Integer> {

    @Query("SELECT * FROM score LIMIT 1")
    Score findScore();
}
