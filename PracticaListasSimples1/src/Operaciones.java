
import javax.swing.JOptionPane;


public class Operaciones {
    Nodo inicio;
    Operaciones(){
        inicio=null;
    }
    
    public void crear(int valor){
        Nodo nuevo=new Nodo();
        nuevo.setDato(valor);
        nuevo.setEnlace(null);
        if(inicio==null){
            inicio=nuevo;
        }else{
           nuevo.setEnlace(inicio);
           inicio=nuevo;
        }
          
    }
    public void imprimir(){
        Nodo temporal=inicio;
        while(temporal!=null){
        JOptionPane.showMessageDialog(null,"El valor es:"+temporal.getDato());
         temporal=temporal.getEnlace();
        }
        
    }
    public void agregarInicio(int valor){
        Nodo nuevo=new Nodo();
        nuevo.setDato(valor);
        nuevo.setEnlace(inicio);
        inicio=nuevo; 
    }
    public void agregarAlFinal(int valor){
       Nodo nuevo=new Nodo();
       nuevo.setDato(valor);
       nuevo.setEnlace(null);
       Nodo temporal=inicio;
             while(temporal.getEnlace()!=null)
                 temporal=temporal.getEnlace();
                 temporal.setEnlace(nuevo);
        
    }
}
