
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;


public class Operaciones {
    
    Nodo inicio;
    
    private final int REQUISITO_EDAD=65;
    private final int REQUISITO_SALDO=10000000;
    
    
    Operaciones(){
        inicio=null;
    }
    
    public void crearLista(String documentoCliente,String nombres,Date fechaDeNacimiento,double sueldo){
        Nodo nuevo = new Nodo();
        
        nuevo.setDocumento(documentoCliente);
        nuevo.setNombre(nombres);
        nuevo.setFechaDeNacimiento(fechaDeNacimiento);
        nuevo.setSaldo(sueldo);
        nuevo.setEnlace(null);
        
        Calendar fechaNacimiento = Calendar.getInstance();
        Calendar fechaActual = Calendar.getInstance();
        
        fechaNacimiento.setTime(fechaDeNacimiento);
        int años = fechaActual.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);
        int mes = fechaActual.get(Calendar.MONTH) - fechaNacimiento.get(Calendar.MONTH);
        int dias = fechaActual.get(Calendar.DATE) - fechaNacimiento.get(Calendar.DATE);
        
        if(mes<0 || (mes==0 && dias<0)){
            años--;
        }
        
        nuevo.setAños(años);
        
        nuevo.setMayorEdad(años>REQUISITO_EDAD);
        nuevo.setSaldoMayor(sueldo>REQUISITO_SALDO);
        
        if(inicio==null){
            inicio=nuevo;
            return;
        }
        
        
        if(nuevo.isMayorEdad()){
            Nodo temporal = inicio;
            if(!nuevo.isMayorEdad()){
                nuevo.setEnlace(inicio);
                inicio=nuevo;
                return;
            }
            
            while(temporal.getEnlace().isMayorEdad()){
                temporal = temporal.getEnlace();
            }
            nuevo.setEnlace(temporal.getEnlace());
            temporal.setEnlace(nuevo);
            
            return;
        }
        
        if(nuevo.isSaldoMayor()){
            Nodo temporal = inicio;
            if(!nuevo.isSaldoMayor()&& !nuevo.isSaldoMayor()){
                nuevo.setEnlace(inicio);
                inicio=nuevo;
                return;
            }
            
            while(temporal.getEnlace().isSaldoMayor()|| temporal.getEnlace().isMayorEdad()){
                temporal=temporal.getEnlace();
            }
            
            nuevo.setEnlace(temporal.getEnlace());
            temporal.setEnlace(nuevo);
            
        }
        
        Nodo temporal = inicio;
        while(temporal.getEnlace()!=null){
            temporal = temporal.getEnlace();
        }
        nuevo.setEnlace(temporal.getEnlace());
        temporal.setEnlace(nuevo);
       
        
    }
    
    public void imprimirLista(){
        if(inicio==null){
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
        }else{
            Nodo temporal = inicio;
            while(temporal!=null){
                JOptionPane.showMessageDialog(null,temporal.getDocumento()+";"+temporal.getNombre()+"; "+temporal.getSaldo());
                temporal = temporal.getEnlace();
            }
        }
    }
    
    public void Buscar(String documento){
        int posicion=0;
        if(inicio==null){
            JOptionPane.showMessageDialog(null, "Lista vacia");
        }else{
            Nodo temporal = inicio;
            while(temporal!=null){
                posicion++;
                if(documento.equals(temporal.getDocumento())){
                    JOptionPane.showMessageDialog(null, "Persona registrada en la lista "+posicion);
                    break;
                }
                
            }
        }
    }
}
