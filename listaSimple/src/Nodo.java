public class Nodo {
   private int dato;
   //Variables Auto-referenciadas 
   private Nodo enlace;

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getEnlace() {
        return enlace;
    }

    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }
   
}
