
import java.util.ArrayList;
import scala.Serializable;

public class ObjetoGuardar implements Serializable {

    ArrayList<ComplejosH> complejos = new ArrayList();
    ArrayList<Ambulancia> ambulancias = new ArrayList();
    ArrayList<Paramedico> Paramedicos = new ArrayList();
    ArrayList<Emergencia> Emergencias = new ArrayList();
    //ArrayList<Areas> areas = new ArrayList();

    public void llenarcomplejos(ArrayList<ComplejosH> complejoscoming) {
        for (int i = 0; i < complejoscoming.size(); i++) {
            System.out.println("llenando complejos");
            complejos.add(complejoscoming.get(i));
        }
    }

    public void llenarambulancias(ArrayList<Ambulancia> ambulanciacoming) {
        for (int i = 0; i < ambulanciacoming.size(); i++) {
               System.out.println("llenando ambulancia");
            ambulancias.add(ambulanciacoming.get(i));
        }
    }

    public void llenarParamedicos(ArrayList<Paramedico> paramedicocoming) {
        for (int i = 0; i < paramedicocoming.size(); i++) {
               System.out.println("llenando paramedico");
            Paramedicos.add(paramedicocoming.get(i));
        }
    }

    public void llenarEmergencias(ArrayList<Emergencia> emergenciacoming) {
        for (int i = 0; i < emergenciacoming.size(); i++) {
               System.out.println("llenando complejos");
            Emergencias.add(emergenciacoming.get(i));
        }
    }

}
