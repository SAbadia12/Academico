public class Docente {
    private int idDocente;
    private String nombre;
    public String materia;

    public Docente(int id, String nombre, String materia){
        this.idDocente = id;
        this.nombre = nombre;
        this.materia = materia;
    }

    public void presentarse(){
        System.out.printf("Hola, soy %s, identificado con la cédula %d\n", nombre, idDocente);
    }

    public void estudiar(){
        System.out.printf("%s está estudiando\n", nombre);
    }

    public void calificar(){
        //System.out.printf("%s está estudiando\n", nombre);
    }
}
