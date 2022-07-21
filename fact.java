package App;

import javax.swing.JOptionPane;

public class fact {

    public static void main(String[] args) {
        String fecha, estudiante, carrera, semestre;
        int cod, Nmaterias;

        for (int i = 0; i <= 3; i++) {

            fecha = JOptionPane.showInputDialog(null, "Ingrese la fecha");
            estudiante = JOptionPane.showInputDialog(null, "Ingrese el nombre del estudiante: ");
            carrera = JOptionPane.showInputDialog(null, "Ingrese el nombre de la carrera: ");
            semestre = JOptionPane.showInputDialog(null, "Ingrese su semestre");

            if (cod.matches("[0-9]+")) {
                if (estudiante.matches("[a-zA-Z]+")) {
                    if (semestre.matches("[1-5]+")) {

                        cod = Integer.parseInt(cod);
                        Nmaterias = Integer.parseInt(Nmaterias);
                        semestre = Integer.parseInt(semestre);

//
                        JOptionPane.showMessageDialog(null, "fecha: " + fecha
                                + "\nestudiante: " + estudiante
                                + "\ncarrera: " + carrera
                                + "\nsemestre: " + semestre
                                + "\ncod: " + cod
                                + "\nNmaterias: " + Nmaterias);
                    } else {
                         JOptionPane.showMessageDialog(null, "Ingrese solo numeros enteros");
                    }
                }else {
                    JOptionPane.showMessageDialog(null, "Ingrese solo el nuero de materias");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingrse su semestre");
            }
        }

    }

}
