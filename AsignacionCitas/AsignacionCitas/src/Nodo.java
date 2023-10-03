
import java.util.Date;


public class Nodo {
    
    private String documento;
    private String nombre;
    private Date fechaDeNacimiento;
    private double saldo;
    private int años;
    private boolean MayorEdad = false;
    private boolean SaldoMayor = false;
    
    private Nodo enlace;
    public int getAños() {
        return años;
    }

    public void setAños(int años) {
        this.años = años;
    }

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

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public boolean isMayorEdad() {
        return MayorEdad;
    }

    public void setMayorEdad(boolean MayorEdad) {
        this.MayorEdad = MayorEdad;
    }

    public boolean isSaldoMayor() {
        return SaldoMayor;
    }

    public void setSaldoMayor(boolean SaldoMayor) {
        this.SaldoMayor = SaldoMayor;
    }
    
}
