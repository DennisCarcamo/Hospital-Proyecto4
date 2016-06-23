
import java.io.Serializable;

public class Emergencia implements Serializable {

    private Ranking ranking;
    private Domicilio domicilio;

    public Emergencia(Ranking ranking, Domicilio domicilio) {
        this.ranking = ranking;
        this.domicilio = domicilio;
    }

    public Ranking getRanking() {
        return ranking;
    }

    public void setRanking(Ranking ranking) {
        this.ranking = ranking;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return ranking.toString();
    }

}
