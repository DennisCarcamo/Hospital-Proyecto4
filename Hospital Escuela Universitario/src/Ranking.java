
import scala.Serializable;

public class Ranking implements Serializable {

    private String nombre;
    private int valor;

    public Ranking() {
    }

    public Ranking(String name) {
        this.nombre = name;
        if (name.equals("A")) {
            valor = 4;
        } else if (name.equals("B")) {
            valor = 3;
        } else if (name.equals("C")) {
            valor = 2;
        } else if (name.equals("D")) {
            valor = 1;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String name) {
        this.nombre = name;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int value) {
        this.valor = value;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
