package ParteL;
/*
 * PARTE L. EJERCICIOS DE CONSOLIDACIÓN FINAL
 * Ejercicio 68 - Diseño de la clase NegocioGalletas:
 *
 * 1. ATRIBUTOS:
 *    - stock (int): Cantidad total de galletas disponibles.
 *    - precio (double): Precio unitario de cada galleta.
 *    - unidadesVendidas (int): Total de galletas vendidas acumuladas.
 *    - ganancias (double): Total de dinero generado por las ventas.
 *
 * 2. MÉTODOS:
 *    - venderGalletas(int cantidad): Registra la venta, descuenta del stock y calcula ganancias.
 *    - reponerStock(int cantidad): Aumenta el inventario de galletas.
 *    - mostrarEstado(): Muestra el estado comercial actual del negocio.
 *
 * 3. OBJETOS REALES A CONSTRUIR:
 *    - miNegocio: Stock: 100 galletas, Precio: $2000.0, Vendidas: 0, Ganancias: $0.0
 */

class NegocioGalletas {
    // Atributos
    private int stock;
    private double precio;
    private int unidadesVendidas;
    private double ganancias;

    // Constructor
    public NegocioGalletas(int stock, double precio) {
        this.stock = stock;
        this.precio = precio;
        this.unidadesVendidas = 0;
        this.ganancias = 0.0;
    }

    // Métodos
    public void venderGalletas(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad a vender debe ser mayor a 0.");
        } else if (cantidad <= this.stock) {
            this.stock -= cantidad;
            this.unidadesVendidas += cantidad;
            double ingreso = cantidad * this.precio;
            this.ganancias += ingreso;
            System.out.println("Venta realizada: " + cantidad + " galleta(s) por $" + ingreso);
        } else {
            System.out.println("Stock insuficiente. Solo quedan " + this.stock + " galletas.");
        }
    }

    public void reponerStock(int cantidad) {
        if (cantidad > 0) {
            this.stock += cantidad;
            System.out.println("Stock repuesto: +" + cantidad + " galletas.");
        } else {
            System.out.println("La cantidad a reponer debe ser mayor a 0.");
        }
    }

    public void mostrarEstado() {
        System.out.println("=== ESTADO DEL NEGOCIO DE GALLETAS ===");
        System.out.println("• Stock disponible: " + this.stock + " galletas");
        System.out.println("• Precio unitario: $" + this.precio);
        System.out.println("• Unidades vendidas: " + this.unidadesVendidas);
        System.out.println("• Ganancias totales: $" + this.ganancias);
        System.out.println();
    }
}

public class Ejercicio68 {
    public static void main(String[] args) {
        // Creación del objeto del negocio de galletas
        NegocioGalletas miNegocio = new NegocioGalletas(100, 2000.0);

        miNegocio.mostrarEstado();
        miNegocio.venderGalletas(15);
        miNegocio.mostrarEstado();

        miNegocio.reponerStock(50);
        miNegocio.venderGalletas(30);
        miNegocio.mostrarEstado();
    }
}