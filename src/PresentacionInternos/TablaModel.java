
package PresentacionInternos;

import Logic.Paciente;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Israel Montiel
 */
public class TablaModel extends AbstractTableModel{
    private List<Paciente>row;
    private int[]col;
    private String[] colsName={"Nombre","Apellido Paterno","Apellido Materno",
        "Cedula","Patologia","Fecha de entrada"};

    public TablaModel(List<Paciente> row, int[] col) {
        this.row = row;
        this.col = col;
    }

    @Override
    public int getRowCount() {
       return row.size();
    }

    @Override
    public int getColumnCount() {
        return col.length;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        Paciente p= row.get(i);
        switch(i1){
            case 0:return p.getNombre();
            case 1: return p.getApelllido1();
            case 2: return p.getApelllido2();
            case 3: return p.getCedula();
            case 4: return p.getPatologia();
            case 5: return p.getFecha();
            default: return "";
        }
    }

    @Override
    public String getColumnName(int i) {
        return colsName[i];
    }
    
}
