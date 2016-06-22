
import java.util.ArrayList;
import scala.Serializable;

public class ObjetoGuardar implements Serializable {

    ArrayList<ComplejosH> complejos = new ArrayList();
    ArrayList<Ambulancia> ambulancias = new ArrayList();
    ArrayList<Paramedico> Paramedicos = new ArrayList();
    ArrayList<Domicilio> Domicilio = new ArrayList();

    public void llenarcomplejos(ArrayList<ComplejosH> complejoscoming) {
        for (int i = 0; i < complejoscoming.size(); i++) {
            complejos.add(complejoscoming.get(i));
        }
    }

    public void llenarambulancias(ArrayList<Ambulancia> ambulanciacoming) {
        for (int i = 0; i < ambulanciacoming.size(); i++) {
            ambulancias.add(ambulanciacoming.get(i));
        }
    }

    public void llenarParamedicos(ArrayList<Paramedico> paramedicocoming) {
        for (int i = 0; i < paramedicocoming.size(); i++) {
            Paramedicos.add(paramedicocoming.get(i));
        }
    }

    public void llenarDomicilios(ArrayList<Domicilio> domiciliocoming) {
        for (int i = 0; i < domiciliocoming.size(); i++) {
            Domicilio.add(domiciliocoming.get(i));
        }
    }

}
