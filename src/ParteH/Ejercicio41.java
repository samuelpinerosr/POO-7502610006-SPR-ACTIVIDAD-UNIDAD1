package ParteH;
class Empleado {
    // Atributos
    private String nombre;
    private String puesto;
    private double salario;

    // Constructor
    public Empleado(String nombre, String puesto, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    // Método para mostrar información
    public void mostrarDetalles() {
        System.out.println("Empleado: " + this.nombre + " | Puesto: " + this.puesto + " | Salario: $" + this.salario);
    }
}

public class Ejercicio41 {
    public static void main(String[] args) {
        // Creación de objetos Empleado
        Empleado emp1 = new Empleado("Ana Gómez", "Desarrolladora Java", 3500.0);
        Empleado emp2 = new Empleado("Carlos López", "Diseñador UX", 2800.0);

        emp1.mostrarDetalles();
        emp2.mostrarDetalles();
    }
}