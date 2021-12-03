package Datos;

import Logic.Funcionario;
import Logic.Paciente;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Israel Montiel
 */
public class Hospital {
    private static Hospital instance=null;
    private Map<String, Paciente> pacientes;
    private Map<String, Funcionario> funcionarios;
    
    private Hospital(){
        pacientes=new HashMap<String, Paciente>();
        funcionarios=new HashMap<String, Funcionario>();
    }
    public static Hospital getInstance(){
        if(instance==null){
            instance=new Hospital();
        }
        return instance;
    }
    public void addPaciente(Paciente x) throws Exception{
        Paciente p=pacientes.get(x.getCedula());
        if(p==null){
        pacientes.put(x.getCedula(), x);
        }else{
            throw new Exception("Paciente ya existe");
        }  
    }
    public void addFuncionario(Funcionario x) throws Exception{
        Funcionario p=funcionarios.get(x.getCedula());
        if(p==null){
        funcionarios.put(x.getCedula(), x);
        }else{
            throw new Exception("Funcionario ya existe");
        }  
    }
    public List<Paciente> getPacientes(){
        List<Paciente> li=new ArrayList<>();
        for (Map.Entry<String, Paciente> entry : pacientes.entrySet()) {
            
            li.add(entry.getValue()); 
        }
        return li;
    }
       public List<Funcionario> getFuncionarios(){
        List<Funcionario> li=new ArrayList<>();
        for (Map.Entry<String, Funcionario> entry : funcionarios.entrySet()) {
            String key = entry.getKey();
            li.add(entry.getValue()); 
        }
        return li;
    }
    public List<Paciente> getPacientePorCedula(String ced) throws Exception{
        List<Paciente> li=new ArrayList<>();
        Paciente p=pacientes.get(ced);
        if(p!=null){
            li.add(p);
            return li;
        }else{
            throw new Exception("El paciente no existe");
        }
    }
    public List<Funcionario> getFuncionarioPorCedula(String ced) throws Exception{
        List<Funcionario> li=new ArrayList<>();
        Funcionario p=funcionarios.get(ced);
        if(p!=null){
            li.add(p);
            return li;
        }else{
            throw new Exception("El funcionario no existe");
        }
    }
}
