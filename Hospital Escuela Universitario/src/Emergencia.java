
import java.io.Serializable;

public class Emergencia implements Serializable {

    private Ranking ranking;

    public Emergencia(Ranking ranking) {
        this.ranking = ranking;
    }

    public Ranking getRanking() {
        return ranking;
    }

    public void setRanking(Ranking ranking) {
        this.ranking = ranking;
    }

    @Override
    public String toString() {
        return ranking.toString();
    }
}
