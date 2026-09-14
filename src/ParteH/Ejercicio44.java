package ParteH;
class Paciente {
    // Atributos
    private String nombre;
    private int edad;
    private String diagnostico;

    // Constructor
    public Paciente(String nombre, int edad, String diagnostico) {
        this.nombre = nombre;
        this.edad = edad;
        this.diagnostico = diagnostico;
    }

    // Método
    public void mostrarFichaMedica() {
        System.out.println("Paciente: " + this.nombre + " | Edad: " + this.edad + " años | Diagnóstico: " + this.diagnostico);
    }
}

public class Ejercicio44 {
    public static void main(String[] args) {
        // Instanciación de la clase / Creación del objeto
        Paciente paciente1 = new Paciente("María Torres", 34, "Gripe común");

        paciente1.mostrarFichaMedica();
    }
}