package Logic;
/**
 *
 * @author Israel Montiel
 */
public class Funcionario {
    private String nombre;
    private String apelllido1;
    private String apelllido2;
    private String cedula;
    private String clave;
    private int rol;

    public Funcionario(String nombre, String apelllido1, String apelllido2, String cedula, int run,String clave) {
        this.nombre = nombre;
        this.apelllido1 = apelllido1;
        this.apelllido2 = apelllido2;
        this.cedula = cedula;
        this.rol=rol;
        this.clave = clave;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public Funcionario() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelllido1() {
        return apelllido1;
    }

    public void setApelllido1(String apelllido1) {
        this.apelllido1 = apelllido1;
    }

    public String getApelllido2() {
        return apelllido2;
    }

    public void setApelllido2(String apelllido2) {
        this.apelllido2 = apelllido2;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    
    
}
