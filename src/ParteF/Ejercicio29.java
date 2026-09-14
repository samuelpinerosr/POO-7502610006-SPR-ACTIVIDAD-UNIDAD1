package ParteF;
class Estudiante {
    String nombre;
    String codigo;
    int semestre;

    Estudiante() {
    }

    Estudiante(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }
    Estudiante(String nombre, String codigo, int semestre) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.semestre = semestre;
    }
    void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + " | Código: " + codigo + " | Semestre: " + semestre);
    }
}
public class Ejercicio29 {
    public static void main(String[] args) {
        Estudiante est1 = new Estudiante();
        Estudiante est2 = new Estudiante("Laura Sofía", "20241001");
        Estudiante est3 = new Estudiante("Camilo Andrés", "20232005", 4);

        System.out.println("Estudiante 1 (Vacío)");
        est1.mostrarInfo();

        System.out.println("\nEstudiante 2 (Nombre y Código)");
        est2.mostrarInfo();

        System.out.println("\nEstudiante 3 (Todos los campos)");
        est3.mostrarInfo();
    }
}

