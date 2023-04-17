package EntradaSalida;

import javax.swing.JOptionPane;

public class Tools {
    public static String validaNombre(String msj) {
        String cad = "";
        boolean band;
        do {
            cad = JOptionPane.showInputDialog(null, msj, "Lectura String", JOptionPane.QUESTION_MESSAGE);
            band = (cad != null && cad.matches("([a-z A-Z]|\\s)+"));
            if (band) {
                return cad;
            } else {
                JOptionPane.showMessageDialog(null, "El nombre ingresado contiene caracteres no validos");
            }
        } while (!band);
        return cad;
    }

    public static String validaCtrl(String msj) {
        String ctrl = "";
        System.out.println(ctrl.trim());
        do {
            ctrl = JOptionPane.showInputDialog(msj);
            ctrl = ctrl.trim();//Espacios
        } while (!ctrl.matches("[0-9]{8}"));
        return ctrl;
    }

    public static String validaNCtrl(String msje) {
        String cad = "";
        boolean band;
        do {
            cad = JOptionPane.showInputDialog(null, msje, "Lectura String", JOptionPane.QUESTION_MESSAGE);
            band = (cad != null && cad.matches("[0-9]{8}"));
            if (band) {
                return cad;
            } else {
                JOptionPane.showMessageDialog(null, "El nombre ingresado contiene caracteres no validos");
            }
        } while (!band);
        return cad;
    }

    public static byte semestre() {
        String valores[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
        return (byte) (JOptionPane.showOptionDialog(null, "Semestre:", "Selecciona una opcion",
                JOptionPane.YES_NO_OPTION, JOptionPane.YES_NO_CANCEL_OPTION, null, valores, valores[0]) + 1);
    }

    public static byte edad(String msj) {
        String e;
        byte edad = 0;
        do {
            e = JOptionPane.showInputDialog(msj);
            if (e != null && e.matches("[17-90]{2}")) {
                edad = Byte.parseByte(e);
            } else {
                JOptionPane.showMessageDialog(null, "La edad ingresada contiene caracteres no validos");
            }
        } while (edad <= 1 || edad >= 35);

        return edad;
    }

    public static byte validaEdad() {
        byte edad = 0;
        do {
            edad = Byte.parseByte(JOptionPane.showInputDialog("Ingrese su edad:"));
            if (edad >= 17 && edad <= 60) {
                return edad;
            } else {
                JOptionPane.showMessageDialog(null, "No cumple con la edad minima");
            }
        } while (edad < 17 || edad > 60);
        return edad;
    }
}
