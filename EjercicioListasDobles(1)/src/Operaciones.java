
import javax.swing.JOptionPane;


public class Operaciones {
    Nodo inicio;
    int contador=1;
    Operaciones(){
        inicio=null;
    }
    public void crearAlInicio(int dato){
        Nodo nuevo=new Nodo();
        nuevo.setAnterior(null);
        nuevo.setDato(dato);
        nuevo.setSiguiente(null);
        if(inicio==null){
            inicio=nuevo;
        }else{
         nuevo.setSiguiente(inicio);
         inicio.setAnterior(nuevo);
         inicio=nuevo;
        }
    }
    public void imprimir(){
       Nodo temporal=inicio;
        if(inicio==null){
            JOptionPane.showMessageDialog(null,"La Lista esta vacia");
        }
        else{
            while(temporal!=null){
                JOptionPane.showMessageDialog(null,"Los valores son:"+temporal.getDato());
                temporal=temporal.getSiguiente();
            }
        }
    }
    public void imprimirAtras(){
       Nodo temporal=inicio;
        if(inicio==null){
            JOptionPane.showMessageDialog(null,"La Lista esta vacia");
        }
        else{
            while(temporal.getSiguiente()!=null){
                temporal=temporal.getSiguiente();
            }
            while(temporal!=null){
                JOptionPane.showMessageDialog(null,"Los valores son:"+temporal.getDato());
                temporal=temporal.getAnterior();
            }
            
        } 
    }
    public void buscar(int valorBuscar){
        Nodo temporal=inicio;
        boolean bandera=false;
        while(temporal!=null){
          if(contador==valorBuscar){
              bandera=true;
            JOptionPane.showMessageDialog(null,"El valor en la posición"+contador+",es:"+temporal.getDato());
            if(temporal.getAnterior()==null){
             JOptionPane.showMessageDialog(null,"No existe valor anterior"); }
           else{
              JOptionPane.showMessageDialog(null,"El valor en la posición anterior:"+temporal.getAnterior().getDato());
          }
            if(temporal.getSiguiente()==null){
             JOptionPane.showMessageDialog(null,"No existe valor Siguiente"); }
           else{
              JOptionPane.showMessageDialog(null,"El valor en la posición Siguiente:"+temporal.getSiguiente().getDato());
          }
          }
          contador++;
          temporal=temporal.getSiguiente();
        }
        if(!bandera){
           JOptionPane.showMessageDialog(null,"Valor no Encontrado"); 
        }
    }
}
