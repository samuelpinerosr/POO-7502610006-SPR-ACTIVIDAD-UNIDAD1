package ParteJ;
class Avion {
    // Atributos
    private String aerolinea;
    private String destino;
    private int pasajeros;

    // Constructor
    public Avion(String aerolinea, String destino, int pasajeros) {
        this.aerolinea = aerolinea;
        this.destino = destino;
        this.pasajeros = pasajeros;
    }

    // Método para abordar pasajeros
    public void abordar(int cantidad) {
        if (cantidad > 0) {
            this.pasajeros += cantidad;
            System.out.println("Han abordado " + cantidad + " pasajeros. Total a bordo: " + this.pasajeros);
        } else {
            System.out.println("La cantidad de pasajeros a abordar debe ser mayor a 0.");
        }
    }

    // Método para mostrar el estado del vuelo
    public void mostrarEstado() {
        System.out.println("--- Vuelo " + this.aerolinea + " ---");
        System.out.println("Destino: " + this.destino);
        System.out.println("Pasajeros a bordo: " + this.pasajeros);
    }
}

public class Ejercicio60 {
    public static void main(String[] args) {
        // Prueba de la clase Avion
        Avion miAvion = new Avion("Avianca", "Madrid", 120);

        miAvion.mostrarEstado();
        miAvion.abordar(35);
        miAvion.mostrarEstado();
    }
}