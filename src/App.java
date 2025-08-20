public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Estudiante e1 = new Estudiante(1106512045, "Sebastián", 4);
        
        e1.presentarse();
        e1.estudiar();
        System.out.printf("El estudiante esta cursando el semestre %d", e1.obtenerSemestreActual());    
    }
}
