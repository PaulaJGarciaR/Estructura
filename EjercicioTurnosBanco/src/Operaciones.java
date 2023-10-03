
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
public class Operaciones {
    Nodo inicio;
    private final int mayorEdad=65;
    private final int mayorSaldo=10000000;
    Operaciones(){
        inicio=null;
    }
    public void crearLista(String documento,String nombre,Date fechaDeNacimiento,double saldo){
         Nodo nuevo=new Nodo();
         nuevo.setDocumento(documento);
         nuevo.setNombre(nombre);
         nuevo.setFechaNacimiento(fechaDeNacimiento);
         nuevo.setSaldo(saldo);
         nuevo.setEnlace(null);
         
       Calendar fechaNacimiento = Calendar.getInstance();
       Calendar fechaActual = Calendar.getInstance();
       fechaNacimiento.setTime(fechaDeNacimiento);
       int años = fechaActual.get(Calendar.YEAR)- fechaNacimiento.get(Calendar.YEAR);
       int mes =fechaActual.get(Calendar.MONTH)- fechaNacimiento.get(Calendar.MONTH);
       int dias = fechaActual.get(Calendar.DATE)- fechaNacimiento.get(Calendar.DATE);
       if(mes<0 || (mes==0 && dias<0)){
           años--;
       }
       nuevo.setAños(años);
       nuevo.setMayores(años>=mayorEdad);
       nuevo.setSaldoMayor(saldo>=mayorSaldo);
       if(inicio==null){
           inicio=nuevo;
       }
       if(nuevo.isMayores()){
           Nodo temporal=inicio;
           if(!nuevo.isMayores()){
             nuevo.setEnlace(inicio);
             inicio=nuevo;
           }
           while(temporal.getEnlace().isMayores()){
               temporal=temporal.getEnlace();
           }
           nuevo.setEnlace(temporal.getEnlace());
           temporal.setEnlace(nuevo);
       }
       if(nuevo.isSaldoMayor()){
           Nodo temporal=inicio;
           if(!nuevo.isMayores() && !nuevo.isSaldoMayor()){
              nuevo.setEnlace(inicio);
             inicio=nuevo;     
           }
           while(temporal.getEnlace().isSaldoMayor() || temporal.getEnlace().isMayores()){
               temporal=temporal.getEnlace();
           }
            nuevo.setEnlace(temporal.getEnlace());
           temporal.setEnlace(nuevo);
       }
       Nodo temporal=inicio;
       while(temporal.getEnlace()!=null){
           temporal=temporal.getEnlace(); 
       }
        nuevo.setEnlace(temporal.getEnlace());
        temporal.setEnlace(nuevo);
         
    }
    
    public void imprimir(){
       if(inicio==null){
           JOptionPane.showMessageDialog(null, "LISTA VACIA");
       } else{
           Nodo temporal=inicio;
           while(temporal!=null){
            JOptionPane.showMessageDialog(null,temporal.getDocumento()+","+temporal.getNombre()+","+temporal.getAños()+","+temporal.getSaldo());
            temporal=temporal.getEnlace();
           }
       }
           
    }
}


