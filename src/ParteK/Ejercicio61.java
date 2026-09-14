package ParteK;

// Atributos de la clase:
// - nombre (String): Guarda el nombre completo del docente.
// - materia (String): Asignatura que imparte actualmente.
// - horasSemanales (int): Carga horaria semanal asignada.
class Docente {
    // Atributos
    private String nombre;
    private String materia;
    private int horasSemanales;

    // Constructor
    public Docente(String nombre, String materia, int horasSemanales) {
        this.nombre = nombre;
        this.materia = materia;
        this.horasSemanales = horasSemanales;
    }

    // Métodos de la clase:
    // - enseñar(): Muestra un mensaje en consola simulando la impartición de la clase.
    // - mostrarPerfil(): Imprime la información detallada del perfil del docente.
    public void enseñar() {
        System.out.println("El/La docente " + this.nombre + " está impartiendo la clase de " + this.materia + ".");
    }

    public void mostrarPerfil() {
        System.out.println("--- Perfil del Docente ---");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Materia: " + this.materia);
        System.out.println("Horas semanales: " + this.horasSemanales);
    }
}

public class Ejercicio61 {
    public static void main(String[] args) {
        // Objetos reales construidos a partir del diseño de la clase Docente:
        // 1. docente1: Representa al docente "Carlos Pérez" impartiendo "Programación Java" con 20 horas.
        // 2. docente2: Representa a la docente "Ana Gómez" impartiendo "Base de Datos" con 15 horas.
        Docente docente1 = new Docente("Carlos Pérez", "Programación Java", 20);
        Docente docente2 = new Docente("Ana Gómez", "Base de Datos", 15);

        // Muestra la información del docente 1
        docente1.mostrarPerfil();
        docente1.enseñar();

        System.out.println();

        // Muestra la información del docente 2
        docente2.mostrarPerfil();
        docente2.enseñar();
    }
}