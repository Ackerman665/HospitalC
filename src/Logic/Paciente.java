package Logic;
/**
 *
 * @author Israel Montiel
 */
public class Paciente {
    private String nombre;
    private String apelllido1;
    private String apelllido2;
    private String cedula;
    private String fecha;
    private String patologia;

    public Paciente(String nombre, String apelllido1, String apelllido2, String cedula, String fecha, String patologia) {
        this.nombre = nombre;
        this.apelllido1 = apelllido1;
        this.apelllido2 = apelllido2;
        this.cedula = cedula;
        this.fecha = fecha;
        this.patologia = patologia;
    }

    public Paciente() {
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPatologia() {
        return patologia;
    }

    public void setPatologia(String patologia) {
        this.patologia = patologia;
    }
    
    
    
}
