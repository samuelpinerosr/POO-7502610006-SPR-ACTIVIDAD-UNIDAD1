package ParteJ;
class Reserva {
    // Atributos
    private String nombreCliente;
    private String fecha;
    private boolean activa;

    // Constructor
    public Reserva(String nombreCliente, String fecha) {
        this.nombreCliente = nombreCliente;
        this.fecha = fecha;
        this.activa = false; // Inicia desactivada hasta ser confirmada
    }

    // Métodos para cambiar estado
    public void confirmar() {
        this.activa = true;
        System.out.println("Reserva confirmada para " + this.nombreCliente + " el " + this.fecha + ".");
    }

    public void cancelar() {
        this.activa = false;
        System.out.println("Reserva cancelada para " + this.nombreCliente + ".");
    }

    // Método para mostrar el estado actual
    public void mostrarEstado() {
        String estado = this.activa ? "Activa" : "Inactiva/Cancelada";
        System.out.println("Cliente: " + this.nombreCliente + " | Fecha: " + this.fecha + " | Estado: " + estado);
    }
}

public class Ejercicio53 {
    public static void main(String[] args) {
        // Prueba de la clase Reserva
        Reserva miReserva = new Reserva("Laura Restrepo", "15/10/2026");

        miReserva.mostrarEstado();
        miReserva.confirmar();
        miReserva.mostrarEstado();
        miReserva.cancelar();
        miReserva.mostrarEstado();
    }
}