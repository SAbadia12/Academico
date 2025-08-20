public class Estudiante {
    private int idEstudiante;
    private String nombre;
    public int semestreActual;

    public Estudiante(int id, String nombre, int semestre){
        this.idEstudiante = id;
        this.nombre = nombre;
        this.semestreActual = semestre;
    }

    public void presentarse(){
        System.out.printf("Hola, soy %s, identificado con la cédula %d\n", nombre, idEstudiante);
    }

    public void estudiar(){
        System.out.printf("%s está estudiando\n", nombre);
    }

    public int obtenerSemestreActual(){
        return semestreActual;
    }
}
