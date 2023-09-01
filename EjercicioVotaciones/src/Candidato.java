
public class Candidato {
    private String nombreCandidato;
    private int numeroCandidato;

    public Candidato(String nombreCandidato, int numeroCandidato) {
        this.nombreCandidato = nombreCandidato;
        this.numeroCandidato = numeroCandidato;
    }

    public String getNombreCandidato() {
        return nombreCandidato;
    }

    public void setNombreCandidato(String nombreCandidato) {
        this.nombreCandidato = nombreCandidato;
    }

    public int getNumeroCandidato() {
        return numeroCandidato;
    }

    public void setNumeroCandidato(int numeroCandidato) {
        this.numeroCandidato = numeroCandidato;
    }
    
   @Override
   public String toString(){
       return nombreCandidato+","+"numero de Tarjeton:"+numeroCandidato;
   }
    
}
