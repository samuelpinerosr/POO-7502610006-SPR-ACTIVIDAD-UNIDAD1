package ParteC;

public class Ejercicio16 {
    public static void main(String[] args) {
        Product product = new Product("Laptop", 5);

        System.out.println("Stock actual: " + product.stock + " unidades");

        // Reabastecimiento válido
        product.reabastecer(10);
        System.out.println("Stock actual: " + product.stock + " unidades");

        // Intento de reabastecimiento inválido
        product.reabastecer(-3);
        System.out.println("Stock actual: " + product.stock + " unidades");
    }
}

class Product {
    String nombre;
    int stock;

    Product(String nombre, int stock) {
        this.nombre = nombre;
        this.stock = stock;
    }

    // Método para aumentar el stock disponible
    void reabastecer(int cantidad) {
        if (cantidad > 0) {
            this.stock = this.stock + cantidad;
            System.out.println("Reabastecimiento exitoso: +" + cantidad + " unidades");
        } else {
            System.out.println("La cantidad a reabastecer debe ser mayor a 0.");
        }
    }
}