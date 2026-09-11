package ParteA;

class Producto {
    String nombre;
    String precio;
    String stock;

    Producto(String nombre, String precio, String stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    void mostrarProducto() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Precio: " + this.precio);
        System.out.println("Stock: " + this.stock);
    }
}
    public class ejercicio3 {
        public static void main(String[] args) {
            Producto producto = new Producto("Tablet", "4M", "5");
            producto.mostrarProducto();
        }
    }
