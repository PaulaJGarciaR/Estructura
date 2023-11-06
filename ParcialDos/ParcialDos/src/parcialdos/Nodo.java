
package parcialdos;


public class Nodo {
    
    private String nombre;
    private int edad;
    private double definitiva;
    
    private Nodo sgt = null;
    private Nodo ant = null;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getDefinitiva() {
        return definitiva;
    }

    public void setDefinitiva(double definitiva) {
        this.definitiva = definitiva;
    }

    public Nodo getSgt() {
        return sgt;
    }

    public void setSgt(Nodo sgt) {
        this.sgt = sgt;
    }

    public Nodo getAnt() {
        return ant;
    }

    public void setAnt(Nodo ant) {
        this.ant = ant;
    }
    
    
}
