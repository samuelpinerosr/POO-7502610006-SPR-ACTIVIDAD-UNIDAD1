package ParteG;
class Pelicula {
    // Atributos
    private String nombre;
    private String genero;
    private int minutos;

    // Constructor
    public Pelicula(String nombre, String genero, int minutos) {
        this.nombre = nombre;
        this.genero = genero;
        this.minutos = minutos;
    }

    // Método
    public void mostrarFicha() {
        System.out.println("Película: " + this.nombre + " | Género: " + this.genero + " | Duración: " + this.minutos + " min");
    }
}

public class Ejercicio40 {
    public static void main(String[] args) {
        // Prueba de la clase Pelicula
        Pelicula miPelicula = new Pelicula("Inception", "Ciencia Ficción", 148);

        miPelicula.mostrarFicha();
    }
}