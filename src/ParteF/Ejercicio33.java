package ParteF;
class Libro {
    String titulo;
    String autor;
    int paginas;

    // Constructor parametrizado normal
    Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    // CONSTRUCTOR COPIA
    Libro(Libro otroLibro) {
        this.titulo = otroLibro.titulo;
        this.autor = otroLibro.autor;
        this.paginas = otroLibro.paginas;
    }

    void mostrarInfo() {
        System.out.println("Libro: \"" + titulo + "\" | Autor: " + autor + " | Páginas: " + paginas);
    }
}
public class Ejercicio33 {
    public static void main(String[] args) {
        // 1. Objeto original
        Libro libroOriginal = new Libro("Cien años de soledad", "Gabriel García Márquez", 496);

        // 2. Copia exacta creada mediante el constructor copia
        Libro libroCopia = new Libro(libroOriginal);

        System.out.println("Libro Original");
        libroOriginal.mostrarInfo();

        System.out.println("\nLibro Copia");
        libroCopia.mostrarInfo();
    }
}
