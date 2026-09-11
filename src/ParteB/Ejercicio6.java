package ParteB;

class Estudiante{
    String nombre;
    String edad;
    String universidad;
    String carrera;
    String semestre;

    Estudiante(String nombre, String edad, String carrera, String semestre, String universidad){
        this.nombre = nombre;
        this.edad = edad;
        this.universidad = universidad;
        this.carrera = carrera;
        this.semestre = semestre;
    }
    void mostrarEstudiante(){
        System.out.println("nombre: " + this.nombre);
        System.out.println("edad: " + this.edad);
        System.out.println("universidad: " + this.universidad);
        System.out.println("carrera: " + this.carrera);
        System.out.println("semestre: " + this.semestre);
    }
}
public class Ejercicio6{
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Samuel","18","ing. software","segundo","UdeC");
        estudiante.mostrarEstudiante();

    }
}