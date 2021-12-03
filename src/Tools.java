/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
/**
 * Created on 29/09/2020
 * @author Kevin Isai Martinez Ordoñez
 */
public class Tools {
    public static void imprimeMsje(String msje){
	JOptionPane.showMessageDialog(null, msje, "Salida", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static char leerChar(String msje) {
	return(JOptionPane.showInputDialog(null, msje).charAt(0));
    }

    public static String leerString(String msje){
	return(JOptionPane.showInputDialog(null, msje));
    }
    
    public static int leerInt(String msje){
	int num=0;
	boolean r=true;
	do{
            try{
		num=(Integer.parseInt(JOptionPane.showInputDialog(null,msje,"Dame un valor",JOptionPane.INFORMATION_MESSAGE)));
		r=false;
            }catch (NumberFormatException e){
		Tools.errorMsje("Error: Ingrese valor valido, no deje campos vacios ni use decimales o letras");	
            }
        }while(r);
	return num;
    }
    
    public static double leerDouble(String msje){
	double num=0;
	boolean r=true;
	do{
            try{
		num=(Double.parseDouble(JOptionPane.showInputDialog(null,msje,"Dame un valor",JOptionPane.INFORMATION_MESSAGE)));
		r=false;
            }catch (NumberFormatException e){
		Tools.errorMsje("Error: Ingrese valor valido, no deje campos vacios ni use letras");	
            }
	}while(r);
	return num;
    }
    
    public static Byte leerByte(String msje){
	byte num=0;
	boolean r=true;
	do{
            try{
		num=(Byte.parseByte(JOptionPane.showInputDialog(null,msje,"dame un valor",JOptionPane.INFORMATION_MESSAGE)));
		r=false;
            }catch (NumberFormatException e){
		Tools.errorMsje("Error: Ingrese valor valido, no deje campos vacios ni use decimales o letras");	
            }
	}while(r);
	return num;
    }
   
    public static Object leerObject(String msje){
	return(JOptionPane.showInputDialog(null, msje));
    }
    
    public static void errorMsje(String msje){
	JOptionPane.showMessageDialog(null, msje, "Intenta de nuevo", JOptionPane.ERROR_MESSAGE);
    }
    
    public static int SiNo(){
	return(JOptionPane.showConfirmDialog(null, "¿Deseas continuar?", "Capturando de objetos", JOptionPane.YES_NO_OPTION));
    }
    
    public static String Area(){
	Object valores[] = {"Ing. Sistemas","Ing. Quimica","Ing. Informatica"};
	String res=(String)JOptionPane.showInputDialog(null,"Area","Selecciona",JOptionPane.INFORMATION_MESSAGE,null, valores,valores[0]);
	return res;
    }
    
    public static int SeguirSioNo(){
	return JOptionPane.showConfirmDialog(null, "¿Deseas continuar?","Captura registros",JOptionPane.YES_NO_CANCEL_OPTION);
    }
    
    public static void imprimeAreaTexto(String cad){
	JTextArea areaSalida = new JTextArea(10,4);
	JScrollPane scroller = new JScrollPane(areaSalida);
	areaSalida.setText("\n"+cad);
	JOptionPane.showMessageDialog(null, scroller, "Salida", JOptionPane.INFORMATION_MESSAGE);
    }
}
