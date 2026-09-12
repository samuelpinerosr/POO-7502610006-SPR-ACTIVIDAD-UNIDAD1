package ParteE;
class Producto {
    String nombre;
    String marca;
    double precio;
    int stock;

    // 1. Constructor sin parámetros (vacío)
    Producto() {
    }

    // 2. Constructor con parámetros
    Producto(String nombre, String marca, double precio, int stock) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.stock = stock;
    }

    void mostrarInfo() {
        System.out.println("Producto: " + marca + " " + nombre + " | Precio: $" + precio + " | Stock: " + stock);
    }
}

public class Ejercicio26 {
    public static void main(String[] args) {

        Producto celular1 = new Producto();
        Producto celular2 = new Producto("Galaxy S24", "Samsung", 999.99, 15);

        System.out.println("Primer producto");
        celular1.mostrarInfo();

        System.out.println("\nSegundo producto");
        celular2.mostrarInfo();
    }
}