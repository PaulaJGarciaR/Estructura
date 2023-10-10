
public class Operaciones {
    NodoDoble inicio;
    Operaciones(){
        inicio=null;
    }
    public void entrarParquedero(String placa, String documento, String nombre, String telefono, int posicion){
        String hora="7:00";
       NodoDoble nuevoVehiculo=new NodoDoble();
       nuevoVehiculo.setPlaca(placa);
       nuevoVehiculo.setDocumento(documento);
       nuevoVehiculo.setNombre(nombre);
       nuevoVehiculo.setTelefono(telefono);
       nuevoVehiculo.setHora(hora);
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
    }
    
}
