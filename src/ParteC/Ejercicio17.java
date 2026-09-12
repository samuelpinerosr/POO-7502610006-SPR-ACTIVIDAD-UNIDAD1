package ParteC;

public class Ejercicio17 {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Carlos", 2);

        System.out.println("Semestre actual: " + estudiante.semestre);

        // Cambio exitoso (avanza de semestre)
        estudiante.cambiarSemestre(3);
        System.out.println("Semestre actual: " + estudiante.semestre);

        // Intento de cambio inválido (no se puede retroceder o poner 0)
        estudiante.cambiarSemestre(1);
        System.out.println("Semestre actual: " + estudiante.semestre);
    }
}

class Estudiante {
    String nombre;
    int semestre;

    Estudiante(String nombre, int semestre) {
        this.nombre = nombre;
        this.semestre = semestre;
    }

    // Método para actualizar el semestre del estudiante
    void cambiarSemestre(int nuevoSemestre) {
        if (nuevoSemestre > this.semestre) {
            this.semestre = nuevoSemestre;
            System.out.println("Semestre actualizado con éxito a: " + nuevoSemestre);
        } else {
            System.out.println("El nuevo semestre debe ser mayor al semestre actual (" + this.semestre + ").");
        }
    }
}