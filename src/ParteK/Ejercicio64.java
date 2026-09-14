package ParteK;

// Atributos de la clase:
// - nombre (String): Nombre del establecimiento comercial.
// - direccion (String): Dirección física de la tienda.
// - totalVentas (double): Acumulado de dinero registrado por ventas.
class Tienda {
    // Atributos
    private String nombre;
    private String direccion;
    private double totalVentas;

    // Constructor
    public Tienda(String nombre, String direccion, double totalVentas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.totalVentas = totalVentas;
    }

    // Métodos de la clase:
    // - registrarVenta(double monto): Suma una nueva venta al acumulado si el monto es mayor a 0.
    // - abrirTienda(): Muestra un mensaje en consola indicando que el negocio está abierto.
    // - mostrarResumen(): Imprime la información de la tienda y su total recaudado.
    public void registrarVenta(double monto) {
        if (monto > 0) {
            this.totalVentas += monto;
            System.out.println("Venta registrada por $" + monto + " en " + this.nombre + ".");
        } else {
            System.out.println("El monto de la venta debe ser mayor a 0.");
        }
    }

    public void abrirTienda() {
        System.out.println("La tienda " + this.nombre + " ubicada en " + this.direccion + " ya está abierta al público.");
    }

    public void mostrarResumen() {
        System.out.println("--- Tienda: " + this.nombre + " ---");
        System.out.println("Dirección: " + this.direccion);
        System.out.println("Total ventas acumuladas: $" + this.totalVentas);
    }
}

public class Ejercicio64 {
    public static void main(String[] args) {
        // Objetos reales construidos a partir del diseño de la clase Tienda:
        // 1. tienda1: Representa a "Supermercado El Sol", ubicado en "Calle 10 #15-20" con 0.0 en ventas iniciales.
        // 2. tienda2: Representa a "Boutique MODA", ubicada en "Carrera 45 #80-12" con 150000.0 en ventas iniciales.
        Tienda tienda1 = new Tienda("Supermercado El Sol", "Calle 10 #15-20", 0.0);
        Tienda tienda2 = new Tienda("Boutique MODA", "Carrera 45 #80-12", 150000.0);

        // Operaciones sobre la primera tienda
        tienda1.abrirTienda();
        tienda1.registrarVenta(45000.0);
        tienda1.mostrarResumen();

        System.out.println();

        // Operaciones sobre la segunda tienda
        tienda2.mostrarResumen();
        tienda2.registrarVenta(80000.0);
        tienda2.mostrarResumen();
    }
}