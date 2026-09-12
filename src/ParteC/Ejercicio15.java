package ParteC;

public class Ejercicio15 {
    public static void main(String[] args) {
        Producto producto = new Producto("Laptop", 10);

        System.out.println("Stock inicial: " + producto.stock + " unidades");

        // Venta exitosa
        producto.vender(3);
        System.out.println("Stock actual: " + producto.stock + " unidades");

        // Intento de venta que supera el stock disponible
        producto.vender(12);
        System.out.println("Stock final: " + producto.stock + " unidades");
    }
}

class Producto {
    String nombre;
    int stock;

    Producto(String nombre, int stock) {
        this.nombre = nombre;
        this.stock = stock;
    }

    // Método para reducir el stock si hay suficientes unidades
    void vender(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad a vender debe ser mayor a 0.");
        } else if (cantidad <= this.stock) {
            this.stock = this.stock - cantidad;
            System.out.println("Venta realizada: " + cantidad + " unidades");
        } else {
            System.out.println("Stock insuficiente. Solo quedan " + this.stock + " unidades.");
        }
    }
}