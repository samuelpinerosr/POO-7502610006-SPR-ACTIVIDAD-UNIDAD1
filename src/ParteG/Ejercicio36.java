package ParteG;
class Puerta {
    // Atributos
    private String material;
    private boolean abierta;

    // Constructor
    public Puerta(String material) {
        this.material = material;
        this.abierta = false; // Por defecto la puerta inicia cerrada
    }

    // Métodos
    public void abrir() {
        this.abierta = true;
    }

    public void cerrar() {
        this.abierta = false;
    }

    public void mostrarEstado() {
        String estado = this.abierta ? "Abierta" : "Cerrada";
        System.out.println("Puerta de " + this.material + " -> Estado: " + estado);
    }
}

public class Ejercicio36 {
    public static void main(String[] args) {
        // Prueba de la clase Puerta
        Puerta miPuerta = new Puerta("Madera");

        miPuerta.mostrarEstado(); // Puerta de Madera -> Estado: Cerrada
        miPuerta.abrir();
        miPuerta.mostrarEstado(); // Puerta de Madera -> Estado: Abierta
        miPuerta.cerrar();
        miPuerta.mostrarEstado(); // Puerta de Madera -> Estado: Cerrada
    }
}