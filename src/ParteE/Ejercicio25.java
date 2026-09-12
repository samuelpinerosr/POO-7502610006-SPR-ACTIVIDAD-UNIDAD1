package ParteE;
class Carro {
    String añoLanzamiento;
    String marca;
    String velocidadMaxima;
    String precio;

    Carro() {
    }

    Carro(String añoLanzamiento, String marca, String velocidadMaxima, String precio) {
        this.añoLanzamiento = añoLanzamiento;
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
        this.precio = precio;
    }

    void mostrarInfo() {
        System.out.println("Carro: " + marca + " (" + añoLanzamiento + ") | Vel. Máx: " + velocidadMaxima + " | Precio: " + precio);
    }
}
public class Ejercicio25 {
    public static void main(String[] args) {

                Carro carroVacio = new Carro();

                Carro carroParametrizado = new Carro("2024", "Porsche", "300 km/h", "$120,000 usd");

                System.out.println("Carro sin parámetros");
                carroVacio.mostrarInfo();

                System.out.println("\nCarro con parámetros");
                carroParametrizado.mostrarInfo();
    }
}

