package ParteF;
class Producto {
    String nombre;
    double precio;
    int stock;

    Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public static Producto crearProductoBasico(String nombre) {

        return new Producto(nombre, 1.0, 10);
    }

    void mostrarInfo() {
        System.out.println("Producto: " + nombre + " | Precio: $" + precio + " | Stock: " + stock);
    }
}
public class Ejercicio31 {
    public static void main(String[] args) {
        Producto productoBasico = Producto.crearProductoBasico("Cuaderno Argollado");
        productoBasico.mostrarInfo();
    }
}

