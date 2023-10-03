
import javax.swing.JOptionPane;


public class OperacionesTurnosListasDobles {
    Nodo cabeza=null;
    public void asignarTurnos(String nombre, int contadorTurnos){
        Nodo nuevo=new Nodo();
        nuevo.setAnterior(cabeza);
        nuevo.setSiguiente(null);
        nuevo.setNombre(nombre);
         if(cabeza==null){
            cabeza=nuevo;
        }
         else{
             Nodo temporal=cabeza;
             while(temporal.getSiguiente()!=null)
                 temporal=temporal.getSiguiente();
                 temporal.setSiguiente(nuevo);
                 nuevo.setAnterior(temporal);
             
         }
    }
    public void buscarPosicion(String nombre, String buscar){
        Nodo temporal=cabeza;
        while(temporal!=null){
          if(temporal.getNombre().equals(buscar)){
              if(temporal.equals(cabeza)){
                  JOptionPane.showMessageDialog(null,"Primer nodo, No hay nodo Anterior");
              }else{
                 JOptionPane.showMessageDialog(null,"Dato Anterior:"+temporal.getAnterior()); 
              }
              if(temporal.getSiguiente()==null){
                  JOptionPane.showMessageDialog(null,"Ultimo nodo, No hay nodo Siguiente");
              }else{
                 JOptionPane.showMessageDialog(null,"Dato Siguiente:"+temporal.getSiguiente()); 
              }
          } 
          temporal=temporal.getSiguiente();
        }
    }
    public void imprimirListaInicioFinal(){
        Nodo temporal=cabeza;
        if(cabeza==null){
            JOptionPane.showMessageDialog(null,"La Lista esta vacia");
        }
        else{
            while(temporal!=null){
                JOptionPane.showMessageDialog(null,"Los valores son:"+temporal.getNombre());
                temporal=temporal.getSiguiente();
            }
        }
    }
    public void imprimirFinalInicio(){
        Nodo temporal=cabeza;
      if(cabeza==null){
            JOptionPane.showMessageDialog(null,"La Lista esta vacia");
        }
        else{
            while(temporal!=null){
                JOptionPane.showMessageDialog(null,"Los valores son:"+temporal.getNombre());
                temporal=temporal.getSiguiente();
            }
            while(temporal!=null){
               JOptionPane.showMessageDialog(null,"Los valores son:"+temporal.getNombre());
                temporal=temporal.getAnterior();   
                
            }
        }
       
     
       
           
       }
            
           
           
  
         
    }

