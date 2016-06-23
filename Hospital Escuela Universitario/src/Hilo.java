
import javax.swing.JOptionPane;

public class Hilo extends Thread{
    double Tiempo;
    String Casa;

    public Hilo(double Tiempo, String Casa) {
        this.Tiempo = Tiempo;
        this.Casa = Casa;
    }
    
    @Override
    public void run() {
        try {
            this.verificar(Tiempo);
            JOptionPane.showMessageDialog(null,"Emergencia terminada en " + Casa);
        } catch (Exception e) {
        }
    }

    private void verificar(double segundos) {
        try {
            Thread.sleep((long) (segundos * 1000));
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}