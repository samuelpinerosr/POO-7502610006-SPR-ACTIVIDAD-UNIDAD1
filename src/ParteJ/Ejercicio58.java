package ParteJ;
class InventarioItem {
    // Atributos
    private String nombre;
    private int cantidad;
    private double precioUnitario;

    // Constructor
    public InventarioItem(String nombre, int cantidad, double precioUnitario) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    // Método para calcular el valor total del inventario del objeto
    public double calcularValorTotal() {
        return this.cantidad * this.precioUnitario;
    }

    // Método para mostrar el detalle del ítem
    public void mostrarDetalle() {
        System.out.println("--- Artículo: " + this.nombre + " ---");
        System.out.println("Cantidad en stock: " + this.cantidad);
        System.out.println("Precio unitario: $" + this.precioUnitario);
        System.out.println("Valor total en inventario: $" + calcularValorTotal());
    }
}

public class Ejercicio58 {
    public static void main(String[] args) {
        // Prueba de la clase InventarioItem
        InventarioItem producto = new InventarioItem("Teclado Mecánico", 15, 45000.0);

        producto.mostrarDetalle();
    }
}