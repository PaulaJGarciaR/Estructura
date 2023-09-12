public class Nodo {
   private int dato;
   private int datoAInsertar;
   //Variables Auto-referenciadas 
   private Nodo enlace;

    public int getDatoAInsertar() {
        return datoAInsertar;
    }

    public void setDatoAInsertar(int datoAInsertar) {
        this.datoAInsertar = datoAInsertar;
    }
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
