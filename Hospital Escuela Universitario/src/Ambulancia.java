
import scala.Serializable;

/**
 *
 * @author Dennis
 */
public class Ambulancia implements Serializable {

    int placa, year, VelociMaxima;
    ComplejosH complejohAsignado;

    public Ambulancia(int placa, int year, int VelociMaxima, ComplejosH complejohAsignado) {
        this.placa = placa;
        this.year = year;
        this.VelociMaxima = VelociMaxima;
        this.complejohAsignado = complejohAsignado;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getVelociMaxima() {
        return VelociMaxima;
    }

    public void setVelociMaxima(int VelociMaxima) {
        this.VelociMaxima = VelociMaxima;
    }

    public ComplejosH getComplejohAsignado() {
        return complejohAsignado;
    }

    public void setComplejohAsignado(ComplejosH complejohAsignado) {
        this.complejohAsignado = complejohAsignado;
    }

    @Override
    public String toString() {
        return placa + "";
    }

}
