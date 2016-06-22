
import scala.Serializable;


/**
 *
 * @author Dennis
 */
public class Paramedico implements Serializable {

    String nombre, ranking;
    int ID, edad;
    ComplejosH asignado;

    public Paramedico(String nombre, String ranking, int ID, int edad, ComplejosH asignado) {
        this.nombre = nombre;
        this.ranking = ranking;
        this.ID = ID;
        this.edad = edad;
        this.asignado = asignado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRanking() {
        return ranking;
    }

    public void setRanking(String ranking) {
        this.ranking = ranking;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ComplejosH getAsignado() {
        return asignado;
    }

    public void setAsignado(ComplejosH asignado) {
        this.asignado = asignado;
    }

    @Override
    public String toString() {
        return "Paramedico{" + "nombre=" + nombre + '}';
    }

}
