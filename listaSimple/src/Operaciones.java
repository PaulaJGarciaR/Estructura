import javax.swing.JOptionPane;
public class Operaciones {
  Nodo inicio;
Operaciones(){
    inicio=null;
}  
public void crearInicio(int valor){
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
    if(inicio==null){
        JOptionPane.showMessageDialog(null,"Lista Vacia");       
}else{
          Nodo temporal=inicio;
        while(temporal!=null){
          JOptionPane.showMessageDialog(null,"Los valores son:"+temporal.getDato()); 
         temporal=temporal.getEnlace();
        }
    }
}
public void Buscar(int valorABuscar){
  if(inicio==null){
        JOptionPane.showMessageDialog(null,"Lista Vacia");       
}else{
        Nodo temporal=inicio;
        int i=0;
        boolean bandera=false;
        while(temporal!=null){
            if(valorABuscar==temporal.getDato()){
                 i++;
                 bandera=true;
          JOptionPane.showMessageDialog(null,"El valor esta en la posición:"+i); 
        }
          temporal=temporal.getEnlace();
        }
        if(!bandera){
            JOptionPane.showMessageDialog(null,"El valor no fue encontrado");
        }
    }  
}
public void insertarAlFinal(int valor){
Nodo nuevo=new Nodo();
        nuevo.setDato(valor);
        nuevo.setEnlace(null);
         if(inicio==null){
            inicio=nuevo;
        }
         else{
             Nodo temporal=inicio;
             while(temporal.getEnlace()!=null)
                 temporal=temporal.getEnlace();
                 temporal.setEnlace(nuevo);
             
         }
}
public void entreNodos(int buscar, int valorAInsertar){
    Nodo nuevo=new Nodo();
    nuevo.setDato(valorAInsertar);
    nuevo.setEnlace(null);
    if(inicio==null){
        inicio=nuevo;
    }else{
        Nodo temporal=inicio;
        while(temporal!=null){
            if(temporal.getDato()==buscar){
                nuevo.setEnlace(temporal.getEnlace());
                temporal.setEnlace(nuevo);
            }
            temporal=temporal.getEnlace();
        }
    }
    
 }
}
    


