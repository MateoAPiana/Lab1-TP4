
import java.util.HashSet;

public class Colegio {
    
    static private HashSet<Alumno> alumnos  = new HashSet<>();
    static private HashSet<Materia> materias  = new HashSet<>();

    public static void main() {
       
        agregarMateria(1, "Web 2", 2);
        agregarMateria(2, "Matematicas", 1);
        agregarMateria(3, "Laboratorio 1", 1);
        
        agregarAlumno(1001, "Lopez", "Martin");
        agregarAlumno(1002, "Martinez", "Brenda");
        
        registrarAlumno(1001, 1);
        registrarAlumno(1001, 2);
        registrarAlumno(1001, 3);
        
        registrarAlumno(1002, 1);
        registrarAlumno(1002, 2);
        registrarAlumno(1002, 3);
        registrarAlumno(1002, 3);
    }

    public static HashSet<Alumno> getAlumnos() {
        return alumnos;
    }

    public static void setAlumnos(HashSet<Alumno> alumnos) {
        Colegio.alumnos = alumnos;
    }

    public static HashSet<Materia> getMaterias() {
        return materias;
    }

    public static void setMaterias(HashSet<Materia> materias) {
        Colegio.materias = materias;
    }
    
    public static void agregarMateria(int id, String nombre, int año){
        Materia materia = new Materia(id, nombre, año);
        materias.add(materia);
    }
    
    public static void agregarAlumno(int letajo, String apellido, String nombre){
        Alumno alumno = new Alumno(letajo, apellido, nombre);
        alumnos.add(alumno);
        System.out.println("Alumno agregado");
    }
    
    public static void registrarAlumno(int letajo, int id_materia) {
        for (Alumno a : alumnos) {
            if (a.getLegajo() == letajo) {
                for (Materia m : materias) {
                    if (m.getId_materia()== id_materia) {
                        a.agregarMateria(m);
                    }
                }
            }
        }
    }
    
    public static void mostrarAlumnos(){
        for (Alumno a : alumnos){
            System.out.println(a.getNombre());
        }
    }
    
    public static void mostrarMaterias(){
        for (Materia m : materias){
            System.out.println(m.getNombre_materia());
        }
    }
}