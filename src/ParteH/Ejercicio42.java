package ParteH;
class Curso {
    // Atributos
    private String nombre;
    private int horas;

    // Constructor
    public Curso(String nombre, int horas) {
        this.nombre = nombre;
        this.horas = horas;
    }

    // Método
    public void mostrarInfo() {
        System.out.println("Curso: " + this.nombre + " | Duración: " + this.horas + " horas");
    }
}

public class Ejercicio42 {
    public static void main(String[] args) {
        // Creación de dos objetos de la misma clase
        Curso curso1 = new Curso("Programación Java", 60);
        Curso curso2 = new Curso("Bases de Datos", 40);

        curso1.mostrarInfo();
        curso2.mostrarInfo();
    }
}