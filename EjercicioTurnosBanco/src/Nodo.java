
import java.util.Date;
public class Nodo {
 private String documento;
 private String nombre;
 private Date fechaNacimiento;
 private double saldo;
 private int años;
 private boolean mayores=false;
 private boolean saldoMayor=false;
 private Nodo enlace; 
    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Nodo getEnlace() {
        return enlace;
    }

    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }

    public int getAños() {
        return años;
    }

    public void setAños(int años) {
        this.años = años;
    }

    public boolean isMayores() {
        return mayores;
    }

    public void setMayores(boolean mayores) {
        this.mayores = mayores;
    }

    public boolean isSaldoMayor() {
        return saldoMayor;
    }

    public void setSaldoMayor(boolean saldoMayor) {
        this.saldoMayor = saldoMayor;
    }
    

    
    
 
}
