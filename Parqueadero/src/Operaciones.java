
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Operaciones {
    NodoDoble inicio;
    int contadorVehiculos=2;
    int contador=0;
    String horaLLegada;
   
    Operaciones(){
        inicio=null;
    }
    public void entrarParquedero(String placa, String documento, String nombre, String telefono, int posicion,String horaLlegada){
       NodoDoble nuevoVehiculo=new NodoDoble();
       nuevoVehiculo.setPlaca(placa);
       nuevoVehiculo.setDocumento(documento);
       nuevoVehiculo.setNombre(nombre);
       nuevoVehiculo.setTelefono(telefono);
       nuevoVehiculo.setHora(horaLlegada);
       nuevoVehiculo.setPosicion(posicion);
       nuevoVehiculo.setAnterior(null);
       nuevoVehiculo.setSiguiente(null);
       if(inicio==null){
           inicio=nuevoVehiculo;
       }else{
           nuevoVehiculo.setSiguiente(inicio);
           inicio.setAnterior(nuevoVehiculo);
           inicio=nuevoVehiculo;
       }
       contador++;
       
    }
    public void consultar(String placaBuscar){
        NodoDoble temporal=inicio;
        if(inicio==null){
            JOptionPane.showMessageDialog(null,"La Lista esta vacia");
        }
        else{
            while(temporal!=null){
             if(temporal.getPlaca().equals(placaBuscar)){
               JOptionPane.showMessageDialog(null,"Nombre del usuario: "+temporal.getNombre()+" ,placa:"+temporal.getPlaca()+" ,Posicion Parqueadero-"+temporal.getPosicion()+",Hora Llegada-"+temporal.getHora());}
               temporal=temporal.getSiguiente();
            }
         
        }
    
        }
    public void parqueaderosDisponibles(){
        
        JOptionPane.showMessageDialog(null,"Parqueaderos Disponibles:"+(contadorVehiculos-contador));
        if(contador==contadorVehiculos){
            JOptionPane.showMessageDialog(null,"PARQUEADERO LLENO");
        }
    }
    public void eliminarPosicion(int posicionEliminar){
    NodoDoble temporal=inicio;
    while(temporal!=null){
    if(posicionEliminar==temporal.getPosicion()){
        if(temporal.getSiguiente()==null){
            temporal.setAnterior(temporal.getAnterior().getAnterior());
            temporal.setSiguiente(null);
        }else{
            temporal.setSiguiente(temporal.getSiguiente().getSiguiente());
        }
        
    }
    temporal=temporal.getSiguiente();
    }
//        if(temporal.getAnterior()!=null){
//                        temporal.setAnterior(temporal.getSiguiente());
//                    }else{
//                        inicio = temporal.getSiguiente();
//                    }
//                    if(temporal.getSiguiente()!=null){
//                        temporal.setSiguiente(temporal.getAnterior());
//                    }
        
        while(temporal!=null){
       JOptionPane.showMessageDialog(null,"Nombre del usuario: "+temporal.getNombre()+" ,placa:"+temporal.getPlaca()+" ,Posicion Parqueadero-"+temporal.getPosicion()+",Hora Llegada-"+temporal.getHora());
    temporal=temporal.getSiguiente();
    }

            
    }
    }
    

