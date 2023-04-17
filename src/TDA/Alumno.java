package TDA;

public class Alumno {
    private byte semestre;
    private byte edad;
    private String numCtrl;
    private String nombre;

    public Alumno(String nombre, byte edad, String numCtrl, byte semestre) {
        this.nombre = nombre;
        this.edad = edad;
        this.numCtrl = numCtrl;
        this.semestre = semestre;
    }

    public Alumno() {

    }

    public byte getSemestre() {
        return semestre;
    }

    public void setSemestre(byte semestre) {
        this.semestre = semestre;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public String getNumCtrl() {
        return numCtrl;
    }

    public void setNumCtrl(String numCtrl) {
        this.numCtrl = numCtrl;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Informacion Del Alumno:\nNombre: "+nombre+"\nNumero de Control: "
                +numCtrl+"\nEdad: "+edad+"\nSemestre: "+semestre+"\n\n";
    }

}
