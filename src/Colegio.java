
import java.util.ArrayList;

public class Colegio {
    
    static private ArrayList<Alumno> alumnos  = new ArrayList<>();
    static private ArrayList<Materia> materias  = new ArrayList<>();

    public static void main() {
       
        agregarMateria(1, "Web 2", 2);
        agregarMateria(2, "Matematicas", 1);
        agregarMateria(3, "Laboratorio 1", 1);
        
        agregarAlumno(1001, "Lopez", "Martin");
        agregarAlumno(1002, "Martinez", "Brenda");
        
        registrarAlumno(0, 0);
        registrarAlumno(0, 1);
        registrarAlumno(0, 2);
        
        registrarAlumno(1, 0);
        registrarAlumno(1, 1);
        registrarAlumno(1, 2);
        registrarAlumno(1, 2);
        
        System.out.println("Cantidad de materias de " + alumnos.get(0).getApellido() + " " + alumnos.get(0).getNombre() + ": " + alumnos.get(0).cantidadMaterias());
        System.out.println("Cantidad de materias de " + alumnos.get(1).getApellido() + " " + alumnos.get(1).getNombre() + ": " + alumnos.get(1).cantidadMaterias());
    }

    public static ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public static void setAlumnos(ArrayList<Alumno> alumnos) {
        Colegio.alumnos = alumnos;
    }

    public static ArrayList<Materia> getMaterias() {
        return materias;
    }

    public static void setMaterias(ArrayList<Materia> materias) {
        Colegio.materias = materias;
    }
    
    public static void agregarMateria(int id, String nombre, int año){
        Materia materia = new Materia(id, nombre, año);
        materias.add(materia);
    }
    
    public static void agregarAlumno(int letajo, String apellido, String nombre){
        Alumno alumno = new Alumno(letajo, apellido, nombre);
        alumnos.add(alumno);
    }
    
    public static void registrarAlumno(int indexA, int indexM){
        alumnos.get(indexA).agregarMateria(materias.get(indexM));
    }
}