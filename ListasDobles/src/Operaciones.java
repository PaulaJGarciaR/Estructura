
import javax.swing.JOptionPane;


public class Operaciones {
    Nodo cabeza=null;
    public void inicioLista(String nombre){
        Nodo nuevo=new Nodo();
        nuevo.setAnterior(null);
        nuevo.setSiguiente(null);
        nuevo.setNombre(nombre);
        if(cabeza==null){
            cabeza=nuevo;
        }
        else{
            nuevo.setSiguiente(cabeza);
            cabeza.setAnterior(nuevo);
            cabeza=nuevo;
        }
    }
    public void consultarLista(){
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
}
