
import javax.swing.JOptionPane;

public class Operaciones {
   NodoEstudiante primero;
   NodoEstudiante ultimo;
   final String SALTO_DE_LINEA="\n";
   
   Operaciones(){
       primero=null;
       ultimo=null;
   }
   public void inicio(String nombreEstudiante,int edadEstudiante, double notaDefinitivaEstudiante){
       NodoEstudiante nuevo=new NodoEstudiante();
       nuevo.setNombreEstudiante(nombreEstudiante);
       nuevo.setEdadEstudiante(edadEstudiante);
       nuevo.setNotaDefinitivaEstudiante(notaDefinitivaEstudiante);
       nuevo.setAnterior(nuevo);
       nuevo.setSiguiente(nuevo);
       if(primero==null){
           primero=nuevo;
           ultimo=nuevo;
       }else{
           nuevo.setSiguiente(primero);
           primero.setAnterior(nuevo);
           primero=nuevo;
           primero.setAnterior(ultimo);
           ultimo.setSiguiente(primero);
       }
   }
   public void imprimir(){
       NodoEstudiante temporal=primero;
       do{
         JOptionPane.showMessageDialog(null,"Nombre Estudiante:"+temporal.getNombreEstudiante()+SALTO_DE_LINEA+"Edad Estudiante:"+temporal.getEdadEstudiante()+SALTO_DE_LINEA+"Nota Definitiva:"+temporal.getNotaDefinitivaEstudiante());
         temporal=temporal.getSiguiente();
       }while(temporal!=primero);
   }
   public void buscarEstudiante(String estudianteBuscar){
       NodoEstudiante temporal=primero;
       while(temporal!=primero){
       if(estudianteBuscar.equalsIgnoreCase(estudianteBuscar)){
            JOptionPane.showMessageDialog(null,"Estudiante Encontrado"+SALTO_DE_LINEA+"Estudiante Anterior:"+temporal.getAnterior());
       }
       temporal=temporal.getSiguiente();
       }
   }
   }

