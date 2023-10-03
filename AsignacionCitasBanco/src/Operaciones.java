
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;


public class Operaciones {
    Nodo inicio;
    
    private final int EDAD_REQUISITO=65;
    private final int SALDO_REQUISITO=10000000;
    
    
    Operaciones(){
        inicio=null;
    }
    
    public void crearLista(String documentoCliente,String nombres,Date fechaDenacimiento,double sueldo){
        Nodo nuevo = new Nodo();
        
        nuevo.setDocumento(documentoCliente);
        nuevo.setNombre(nombres);
        nuevo.setFechaNacimiento(fechaDenacimiento);
        nuevo.setSaldo(sueldo);
        nuevo.setEnlace(null);
        
        Calendar fechaNacimiento = Calendar.getInstance();
        Calendar fechaActual = Calendar.getInstance();
        
        fechaNacimiento.setTime(fechaDenacimiento);
        int años = fechaActual.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);
        int mes = fechaActual.get(Calendar.MONTH) - fechaNacimiento.get(Calendar.MONTH);
        int dias = fechaActual.get(Calendar.DATE) - fechaNacimiento.get(Calendar.DATE);
        
        if(mes<0 || (mes==0 && dias<0)){
            años--;
        }
        
        nuevo.setAños(años);
        
        nuevo.setMayores(años>EDAD_REQUISITO);
        nuevo.setSaldoMayor(sueldo>SALDO_REQUISITO);
        if(inicio==null){
            inicio=nuevo;
            return;
        }
        
        
        if(nuevo.isMayores()){
            Nodo temporal = inicio;
            if(!nuevo.isMayores()){
                nuevo.setEnlace(inicio);
                inicio=nuevo;
                return;
            }
            
            while(temporal.getEnlace().isMayores()){
                temporal = temporal.getEnlace();
            }
            nuevo.setEnlace(temporal.getEnlace());
            temporal.setEnlace(nuevo);
            
            return;
        }
        
        if(nuevo.isSaldoMayor()){
            Nodo temporal = inicio;
            if(!nuevo.isSaldoMayor() && !nuevo.isMayores()){
                nuevo.setEnlace(inicio);
                inicio=nuevo;
                return;
            }
            
            while(temporal.getEnlace().isSaldoMayor() || temporal.getEnlace().isMayores()){
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
    public void imprimir(){
        if(inicio==null){
            JOptionPane.showMessageDialog(null, "LISTA VACIA");
        }else{
            Nodo temporal = inicio;
            while(temporal!=null){
                JOptionPane.showMessageDialog(null,temporal.getDocumento()+";"+temporal.getNombre()+"; "+temporal.getSaldo());
                temporal = temporal.getEnlace();
            }
        }
    }
}
