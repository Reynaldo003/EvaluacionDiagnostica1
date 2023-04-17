package EntradaSalida;

import TDA.Alumno;
import javax.swing.JOptionPane;

public class Almacenar {
    private Alumno alu[];
    private byte i = 0;

    public Almacenar(int tam) {
        alu = new Alumno[tam];
        i = -1;
    }

    public boolean arregloVacio() {
        return i == -1;
    }

    public boolean arregloLleno() {
        return i == alu.length - 1;
    }

    private Alumno crearAlumno() {
        Alumno obj = new Alumno();
        obj.setNombre(Tools.validaNombre("Inserta tu nombre"));//Para los metodos estaticos no se necesita crear objetos
        obj.setNumCtrl(Tools.validaCtrl("Inserta tu numero de control, 8 digitos:"));
        obj.setEdad(Tools.validaEdad());
        obj.setSemestre(Tools.semestre());
        return obj;
    }

    public void agregarObjeto() {
        if (i <= alu.length) {
            //alu[++i] = crearAlumno();
            alu[++i] = crearAlumno();
        } else {
            System.out.println("Arreglo Lleno");
        }
    }

    public void verObjetos() {
        byte j;
        String cad = "";
        for (j = 0; j <= i; j++) {
            cad += alu[j].toString();
        }
        JOptionPane.showMessageDialog(null, cad);
        //System.out.println("Datos del arreglo\n"+cad);
    }

    public void ordenarAs() {
        int j = 1, k = 0;
        String aux;
        for (k = 0; k <= i; k++) {
            for (j = k + 1; j <= i; j++) {
                if (Integer.parseInt(alu[k].getNumCtrl()) > Integer.parseInt(alu[j].getNumCtrl())) {
                    aux = alu[k].getNumCtrl();
                    alu[k].setNumCtrl(alu[j].getNumCtrl());
                    alu[j].setNumCtrl(aux);
                }
            }
        }
    }
    
    public void ordenarDes() {
        int j = 1, k = 0;
        String aux;
        for (k = 0; k <= i; k++) {
            for (j = k + 1; j <= i; j++) {
                if (Integer.parseInt(alu[k].getNumCtrl()) < Integer.parseInt(alu[j].getNumCtrl())) {
                    aux = alu[k].getNumCtrl();
                    alu[k].setNumCtrl(alu[j].getNumCtrl());
                    alu[j].setNumCtrl(aux);
                }
            }
        }
    }
}
