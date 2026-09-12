package ParteD;
class Laptop {
    String marca;
    String modelo;
    double precio;

    Laptop(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    void mostrarInfo() {
        System.out.println("Laptop: " + marca + " " + modelo + " | Precio: $" + precio);
    }
}
public class Ejercicio21 {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Apple", "MacBook Air", 1200.0);
        Laptop laptop2 = new Laptop("Dell", "XPS 13", 1200.0);

        laptop1.mostrarInfo();
        laptop2.mostrarInfo();

        System.out.println("\nAmbos objetos son laptops y tienen el mismo precio,");
        System.out.println("pero cada uno es de una marca y modelo diferente.");
    }
}

