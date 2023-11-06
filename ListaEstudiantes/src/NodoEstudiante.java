public class NodoEstudiante {
    private String nombreEstudiante;
    private int edadEstudiante;
    private double notaDefinitivaEstudiante;
    private NodoEstudiante anterior;
    private NodoEstudiante siguiente;

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public int getEdadEstudiante() {
        return edadEstudiante;
    }

    public void setEdadEstudiante(int edadEstudiante) {
        this.edadEstudiante = edadEstudiante;
    }

    

    public NodoEstudiante getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoEstudiante anterior) {
        this.anterior = anterior;
    }

    public NodoEstudiante getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoEstudiante siguiente) {
        this.siguiente = siguiente;
    }

    public double getNotaDefinitivaEstudiante() {
        return notaDefinitivaEstudiante;
    }

    public void setNotaDefinitivaEstudiante(double notaDefinitivaEstudiante) {
        this.notaDefinitivaEstudiante = notaDefinitivaEstudiante;
    }
    
}
