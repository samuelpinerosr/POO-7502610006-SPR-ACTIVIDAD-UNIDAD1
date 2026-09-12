package ParteB;

class Carro {
    String marca;
    String velocidadMaxima;

    // Constructor 1: Sin parámetros
    Carro() {
    }

    // Constructor 2: Con parámetros
    Carro(String marca, String velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    // Un solo metodo para mostrar los datos de cualquier carro
    void mostrarCarro() {
        System.out.println("marca: " + this.marca);
        System.out.println("velocidadMaxima: " + this.velocidadMaxima);
    }
}

public class Ejercicio7 {
    public static void main(String[] args) {
        Carro a = new Carro(); // Usa el constructor vacío
        Carro b = new Carro("Mazda", "150km/h"); // Usa el constructor con parámetros
        Carro c = new Carro("Ferrari", "300km/h"); // Usa el constructor con parámetros

        System.out.println("CARRO UNO");
        b.mostrarCarro();
        System.out.println("\n---------------------");
        System.out.println("\nCARRO DOS");
        c.mostrarCarro();
    }
}