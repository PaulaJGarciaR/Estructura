
import java.util.Calendar;
import java.util.Date;


public class Operaciones {
    Nodo inicio;
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
        System.out.println(años);
   
          if(inicio==null){
            inicio=nuevo;
        }else{
        nuevo.setEnlace(inicio);
        inicio=nuevo;
          }
          
          if(años>=65){
              nuevo.
          }
    }
    
    public void imprimir(){
        
    }
}
