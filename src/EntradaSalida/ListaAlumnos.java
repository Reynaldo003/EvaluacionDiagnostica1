package EntradaSalida;

import TDA.Alumno;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ListaAlumnos {

    private ArrayList lista;

    public ListaAlumnos() {
        lista = new <Alumno>ArrayList();
    }

    public void añadir(Alumno p) {
        lista.add(p);
    }

    public void eliminar(int pos) {
        lista.remove(pos);
    }

    public void eliminarTodo() {
        lista.removeAll(lista);
    }
    
    public void mostrarAlum(int pos){
        JOptionPane.showMessageDialog(null, lista.get(pos));
    }
//    
//    public void mostrarTodo(){
//        for(int i = 0; i <= lista.size()-1;i++){
//            JOptionPane.showMessageDialog(null, lista.get(i));
//        }
//    }
}
