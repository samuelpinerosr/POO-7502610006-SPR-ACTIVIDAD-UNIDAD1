package ParteF;
class Productos {
    String nombre;
    String precio;
    String stock;

    Productos(String nombre, String precio, String stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public static Productos crearProductoBasico(String nombre) {
        // Usamos la variable 'nombre' que entra por parámetro
        return new Productos(nombre, "500 pesos", "7");
    }

    void mostrarInfo() {
        System.out.println("Producto: " + nombre + " | Precio: " + precio + " | Stock: " + stock);
    }
}

public class Ejercicio32 {
    public static void main(String[] args) {
        Productos p1 = Productos.crearProductoBasico("Lápiz");
        Productos p2 = Productos.crearProductoBasico("Borrador de Nata");

        p1.mostrarInfo();
        p2.mostrarInfo();
    }
}