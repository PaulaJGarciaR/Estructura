
import javax.swing.JOptionPane;


public class NodoDobleCircular {
   NodoDC primero;
   NodoDC ultimo;
   
   NodoDobleCircular(){
       primero=null;
       ultimo=null;
   }
   public void inicio(int edad){
       NodoDC nuevo=new NodoDC();
       nuevo.setEdad(edad);
       nuevo.setAnterior(nuevo);
       nuevo.setSiguiente(nuevo);
       if(primero==null){
           primero=nuevo;
           ultimo=nuevo;
       }else{
           nuevo.setSiguiente(primero);
           primero.setAnterior(nuevo);
           primero=nuevo;
           primero.setAnterior(ultimo);
           ultimo.setSiguiente(primero);
       }
   }
   public void imprimir(){
       NodoDC temporal=primero;
       do{
         JOptionPane.showMessageDialog(null,temporal.getEdad());
         temporal=temporal.getSiguiente();
       }while(temporal!=primero);
   }
   public void imprimirAtras(){
       NodoDC temporal=ultimo;
       do{
         JOptionPane.showMessageDialog(null,temporal.getEdad());
         temporal=temporal.getAnterior();
       }while(temporal!=ultimo);
   }
}
