public class Colegio {

    public void main(String[] args) {
       
        Materia web2 = new Materia(1, "Web 2", 2);
        Materia mate = new Materia(2, "Matematicas", 1);
        Materia lab1 = new Materia(3, "Laboratorio 1", 1);

        
        Alumno a1 = new Alumno(1001, "Lopez", "Martin");
        Alumno a2 = new Alumno(1002, "Martinez", "Brenda");

      
        a1.agregarMateria(web2);
        a1.agregarMateria(mate);
        a1.agregarMateria(lab1);

        a2.agregarMateria(web2);
        a2.agregarMateria(mate);
        a2.agregarMateria(lab1);
        a2.agregarMateria(lab1); 

        
        System.out.println("Cantidad de materias de " + a1.getApellido() + " " + a1.getNombre() + ": " + a1.cantidadMaterias());
        System.out.println("Cantidad de materias de " + a2.getApellido() + " " + a2.getNombre() + ": " + a2.cantidadMaterias());
    }
}