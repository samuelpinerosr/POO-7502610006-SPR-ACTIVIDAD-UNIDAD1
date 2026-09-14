package ParteF;
class Estudiantes {
    String nombre;
    String codigo;
    int semestre;

    Estudiantes() {
    }
    Estudiantes(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.semestre = 1; // Asignamos 1º semestre por defecto
    }
    Estudiantes(String nombre, String codigo, int semestre) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.semestre = semestre;
    }

    void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + " | Código: " + codigo + " | Semestre: " + semestre);
    }
}
public class Ejercicio30 {
    public static void main(String[] args) {
        // 1. Objeto creado con el constructor vacío
        Estudiante estudiante1 = new Estudiante();

        // 2. Objeto creado con el constructor de (nombre, código)
        Estudiante estudiante2 = new Estudiante("Mariana Torres", "20241102");

        // 3. Objeto creado con el constructor completo (nombre, código, semestre)
        Estudiante estudiante3 = new Estudiante("Santiago Gómez", "20222014", 5);

        // Mostramos la información de los tres objetos
        System.out.println("Estudiante 1 (Constructor vacío)");
        estudiante1.mostrarInfo();

        System.out.println("\nEstudiante 2 (Constructor con nombre y código)");
        estudiante2.mostrarInfo();

        System.out.println("\nEstudiante 3 (Constructor completo)");
        estudiante3.mostrarInfo();
    }
}
