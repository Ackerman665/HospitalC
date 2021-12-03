package PresentacionInternos;

import Logic.Paciente;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Israel Montiel
 */
public class Control {
   private Vista vista;
   private Model model;

    public Control(Vista vista, Model model) {
        this.vista = vista;
        this.model = model;
        vista.setControl(this);
        vista.setModel(model);
        
    }

    public void agregar(boolean editar, String nom, String ape1, String ape2, String ced, String fe, String pa) {
    
        try{
            if(!editar){   
                Paciente x =new Paciente(nom, ape1, ape2, ced, fe, pa);
                Datos.Hospital.getInstance().addPaciente(x);
                List<Paciente> li=Datos.Hospital.getInstance().getPacientes();
                model.setLis(li);
            }else{
                
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        model.setP(new Paciente());
        model.setEditar(false);
        
    }

    void cancelar() {
       model.setP(new Paciente());
    }

   
   
   
    
}
