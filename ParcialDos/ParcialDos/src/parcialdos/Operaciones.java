package parcialdos;

import javax.swing.JOptionPane;

public class Operaciones {

    Nodo primero;
    Nodo ultimo;

    Operaciones() {
        primero = null;
        ultimo = null;
    }

    public void crearInicio(String nombre, int edad, double definitiva) {
        Nodo nuevo = new Nodo();
        nuevo.setNombre(nombre);
        nuevo.setEdad(edad);
        nuevo.setDefinitiva(definitiva);

        JOptionPane.showMessageDialog(null, "Ingreso exitoso");

        if (primero == null) {
            primero = nuevo;
            ultimo = nuevo;
            return;
        }

//        nuevo.setSgt(primero);
//        primero.setAnt(nuevo);
//        primero = nuevo;
//        primero.setAnt(ultimo);
//        ultimo.setSgt(primero);
        ordenarEdad(nuevo);
    }

    public void ordenarEdad(Nodo nodoNuevo) {
        Nodo temporal = primero;
        
        if (primero.getEdad() <= nodoNuevo.getEdad()) {
            nodoNuevo.setSgt(primero);
            primero.setAnt(nodoNuevo);
            primero = nodoNuevo;
            primero.setAnt(ultimo);
            ultimo.setSgt(primero);
            return;
        }
        
        int edadNodo = nodoNuevo.getEdad();

        do {
            Nodo tempAnterior = temporal.getAnt();
            int edadActual = temporal.getEdad();

            if (edadNodo >= edadActual) {
                nodoNuevo.setAnt(tempAnterior);
                nodoNuevo.setSgt(temporal);
                
                tempAnterior.setSgt(nodoNuevo);
                temporal.setAnt(nodoNuevo);
                
                return;
            }

            temporal = temporal.getSgt();

        } while (temporal != primero && temporal != null);
        
        nodoNuevo.setSgt(primero);
        nodoNuevo.setAnt(ultimo);
        ultimo.setSgt(nodoNuevo);
        ultimo = nodoNuevo;
    }

    public boolean validarVacio() {
        if (primero == null) {
            JOptionPane.showMessageDialog(null, "Lista Vacia");
            return true;
        }

        return false;
    }

    public void buscarNodo(String nombre) {
        if (validarVacio()) {
            return;
        }

        Nodo temporal = primero;

        do {
            if (temporal.getNombre().equalsIgnoreCase(nombre)) {
                JOptionPane.showMessageDialog(null, "El estudiante " + temporal.getNombre() + " esta en la lista");

                Nodo tempSiguiente = temporal.getSgt();
                Nodo tempAnterior = temporal.getAnt();

                if (tempSiguiente != null) {
                    JOptionPane.showMessageDialog(null, "El estudiante siguiente es " + tempSiguiente.getNombre());
                }

                if (tempAnterior != null) {
                    JOptionPane.showMessageDialog(null, "El estudiante anterior es " + tempAnterior.getNombre());
                }

                return;
            }

            temporal = temporal.getSgt();
        } while (temporal != primero && temporal != null);

        JOptionPane.showMessageDialog(null, "El estudiante no se encuentra en la lista");
    }

    public void materiaInformacion() {
        Nodo temporal = primero;
        int contador = 0, contador2 = 0, contador3 = 0, contador4 = 0;

        if (validarVacio()) {
            return;
        }

        do {
            if (temporal.getDefinitiva() >= 3.0) {
                contador++;
            } else {
                contador2++;
            }
            if (temporal.getEdad() >= 18) {
                contador3++;
            } else {
                contador4++;
            }
            temporal = temporal.getSgt();
        } while (temporal != primero && temporal != null);

        if (contador == 0) {
            JOptionPane.showMessageDialog(null, "Ningun estudiante gano la materia");
        } else {
            JOptionPane.showMessageDialog(null, contador + " estudiantes ganaron la materia");
        }

        if (contador2 == 0) {
            JOptionPane.showMessageDialog(null, "Ningun estudiante perdio la materia");
        } else {
            JOptionPane.showMessageDialog(null, contador2 + " estudiantes perdieron la materia");
        }

        if (contador3 == 0) {
            JOptionPane.showMessageDialog(null, "No hay estudiantes mayores de edad");
        } else {
            JOptionPane.showMessageDialog(null, contador3 + " estudiantes mayores de edad");
        }

        if (contador4 == 0) {
            JOptionPane.showMessageDialog(null, "No hay estudiantes menores de edad");
        } else {
            JOptionPane.showMessageDialog(null, contador4 + " estudiantes menores de edad");
        }
    }

    public void cambioInformacion(String nombre) {
        if (validarVacio()) {
            return;
        }
        Nodo temporal = primero;
        JOptionPane.showMessageDialog(null, "Solo podra cambiar el nombre si solo hay un solo estudiante en la lista");

        if (temporal.getNombre().equalsIgnoreCase(nombre)) {
            if (temporal == primero && temporal == ultimo) {
                temporal.setNombre(JOptionPane.showInputDialog("Ingrese el nombre nuevo"));
            } else {
                JOptionPane.showMessageDialog(null, "Hay mas estudiantes en la lista no se pueden hacer modificaciones");
            }
        }
    }

    public void eliminarNodo(String nombre) {
        if (validarVacio()) {
            return;
        }

        boolean validar = false;
        Nodo temporal = primero;
        Nodo temporalsgt;
        Nodo temporalant;

        do {
            if (temporal.getNombre().equalsIgnoreCase(nombre)) {
                validar = true;
                if ((temporal == primero && temporal == ultimo)) {
                    primero = null;
                    ultimo = null;
                    temporal = null;
                } else if (temporal.getSgt() != primero && temporal.getAnt() != ultimo) {
                    temporalsgt = temporal.getSgt();
                    temporalant = temporal.getAnt();
                    temporalsgt.setAnt(temporalant);
                    temporalant.setSgt(temporalsgt);
                    temporal = temporal.getSgt();
                } else if (temporal == primero) {
                    primero = temporal.getSgt();
                    temporal.getSgt().setAnt(ultimo);
                    ultimo.setSgt(primero);
                    temporal = temporal.getSgt();
                } else if (temporal == ultimo) {
                    ultimo = temporal.getAnt();
                    temporal.getAnt().setSgt(primero);
                    primero.setAnt(ultimo);
                    temporal = temporal.getSgt();
                }
            } else {
                temporal = temporal.getSgt();
            }

        } while (temporal != primero && temporal != null);

        if (!validar) {
            JOptionPane.showMessageDialog(null, "El estudiante no se encuentra en la lista");
        }
    }

    public void imprimirLista() {
        Nodo temporal = primero;
        if (validarVacio()) {
            return;
        }

        do {
            JOptionPane.showMessageDialog(null, "Estudiante:" + temporal.getNombre() + " edad: " + temporal.getEdad() + " definitiva " + temporal.getDefinitiva());
            temporal = temporal.getSgt();
        } while (temporal != primero && temporal != null);
    }
}
