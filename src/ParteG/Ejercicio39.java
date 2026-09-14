package ParteG;
class Cancion {
    // Atributos
    private String titulo;
    private String artista;
    private double duracion; // Duración en minutos

    // Constructor
    public Cancion(String titulo, String artista, double duracion) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
    }

    // Método
    public void mostrarInfo() {
        System.out.println("Canción: " + this.titulo + " | Artista: " + this.artista + " | Duración: " + this.duracion + " min");
    }
}

public class Ejercicio39 {
    public static void main(String[] args) {
        // Prueba de la clase Cancion
        Cancion miCancion = new Cancion("Bohemian Rhapsody", "Queen", 5.55);

        miCancion.mostrarInfo();
    }
}