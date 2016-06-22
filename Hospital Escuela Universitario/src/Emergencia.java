
import scala.Serializable;


/**
 *
 * @author Dennis
 */
public class Emergencia implements Serializable {

    String Lugar, Ranking;

    public Emergencia(String Lugar, String Ranking) {
        this.Lugar = Lugar;
        this.Ranking = Ranking;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String Lugar) {
        this.Lugar = Lugar;
    }

    public String getRanking() {
        return Ranking;
    }

    public void setRanking(String Ranking) {
        this.Ranking = Ranking;
    }

}
