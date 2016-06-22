
import java.util.ArrayList;
import scala.Serializable;

/**
 *
 * @author Dennis
 */
public class ComplejosH implements Serializable{

    //capa=capacidad
    String nombre, direccion, rankinDeEmergencias;
    int capaAmbulancias, capaParamedicos;
    ArrayList Ambulancias = new ArrayList(), Paramedicos = new ArrayList();

    public ComplejosH(String nombre, String direccion, String rankinDeEmergencias, int capaAmbulancias, int capaParamedicos) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.rankinDeEmergencias = rankinDeEmergencias;
        this.capaAmbulancias = capaAmbulancias;
        this.capaParamedicos = capaParamedicos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRankinDeEmergencias() {
        return rankinDeEmergencias;
    }

    public ArrayList getAmbulancias() {
        return Ambulancias;
    }

    public void setAmbulancias(ArrayList Ambulancias) {
        this.Ambulancias = Ambulancias;
    }

    public ArrayList getParamedicos() {
        return Paramedicos;
    }

    public void setParamedicos(ArrayList Paramedicos) {
        this.Paramedicos = Paramedicos;
    }

    public void setRankinDeEmergencias(String rankinDeEmergencias) {
        this.rankinDeEmergencias = rankinDeEmergencias;
    }

    public int getCapaAmbulancias() {
        return capaAmbulancias;
    }

    public void setCapaAmbulancias(int capaAmbulancias) {
        this.capaAmbulancias = capaAmbulancias;
    }

    public int getCapaParamedicos() {
        return capaParamedicos;
    }

    public void setCapaParamedicos(int capaParamedicos) {
        this.capaParamedicos = capaParamedicos;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
