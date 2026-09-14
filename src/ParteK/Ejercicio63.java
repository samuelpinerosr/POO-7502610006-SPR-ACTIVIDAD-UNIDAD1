package ParteK;

// Atributos de la clase:
// - nombre (String): Nombre del hospital o clínica.
// - camasDisponibles (int): Cantidad de camas libres para ingresar pacientes.
// - nivelUrgencia (String): Nivel de complejidad de atención médica.
class Hospital {
    // Atributos
    private String nombre;
    private int camasDisponibles;
    private String nivelUrgencia;

    // Constructor
    public Hospital(String nombre, int camasDisponibles, String nivelUrgencia) {
        this.nombre = nombre;
        this.camasDisponibles = camasDisponibles;
        this.nivelUrgencia = nivelUrgencia;
    }

    // Métodos de la clase:
    // - ingresarPaciente(): Ocupa una cama disponible (reduce en 1) si hay cupo.
    // - darAltaPaciente(): Libera una cama (aumenta en 1).
    // - mostrarEstado(): Imprime en consola la información detallada del centro médico.
    public void ingresarPaciente() {
        if (this.camasDisponibles > 0) {
            this.camasDisponibles--;
            System.out.println("Paciente ingresado en " + this.nombre + ". Camas libres: " + this.camasDisponibles);
        } else {
            System.out.println("No hay camas disponibles en " + this.nombre + " para ingresar al paciente.");
        }
    }

    public void darAltaPaciente() {
        this.camasDisponibles++;
        System.out.println("Paciente dado de alta en " + this.nombre + ". Camas libres: " + this.camasDisponibles);
    }

    public void mostrarEstado() {
        System.out.println("--- " + this.nombre + " ---");
        System.out.println("Nivel de atención: " + this.nivelUrgencia);
        System.out.println("Camas disponibles: " + this.camasDisponibles);
    }
}

public class Ejercicio63 {
    public static void main(String[] args) {
        // Objetos reales construidos a partir del diseño de la clase Hospital:
        // 1. hospital1: Representa al "Hospital San Juan" de Alta Complejidad con 45 camas.
        // 2. hospital2: Representa a la "Clínica del Norte" de Media Complejidad con 1 cama.
        Hospital hospital1 = new Hospital("Hospital San Juan", 45, "Alta Complejidad");
        Hospital hospital2 = new Hospital("Clínica del Norte", 1, "Media Complejidad");

        hospital1.mostrarEstado();
        hospital1.ingresarPaciente();

        System.out.println();

        hospital2.mostrarEstado();
        hospital2.ingresarPaciente();
        hospital2.ingresarPaciente(); // Intenta ingresar sin camas
        hospital2.darAltaPaciente();
    }
}