package Aplicacion;
/**
 *
 * @author Israel Montiel
 */
public class App {
    public static void main(String[] args) {
        PresentacionInternos.Vista v1=new PresentacionInternos.Vista();
        PresentacionInternos.Model m1=new PresentacionInternos.Model();
        PresentacionInternos.Control c1= new PresentacionInternos.Control(v1,m1);
        
        v1.setVisible(true);
        v1.setLocationRelativeTo(null);
        v1.setTitle("HOSPITAL COVADONGA - REGISTRO");
    }
}
