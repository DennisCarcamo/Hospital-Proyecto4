
import java.util.ArrayDeque;
import scala.Serializable;

public class Domicilio implements Serializable {

    String nombre, direccion;
    ArrayDeque emergencias = new ArrayDeque();

    public Domicilio(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
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

    public ArrayDeque getEmergencias() {
        return emergencias;
    }

    public void setEmergencias(ArrayDeque emergencias) {
        this.emergencias = emergencias;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
