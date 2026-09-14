package ParteF;
class Libroo {
    String titulo;
    String autor;
    int paginas;

    // Constructor con parámetros (Original)
    Libroo(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    // Constructor Copia
    Libroo(Libro otroLibro) {
        this.titulo = otroLibro.titulo;
        this.autor = otroLibro.autor;
        this.paginas = otroLibro.paginas;
    }

    void mostrarInfo() {
        System.out.println("Libro: \"" + titulo + "\" | Autor: " + autor + " | Páginas: " + paginas);
    }
}
public class Ejercicio34 {
    public static void main(String[] args) {
        // 1. Creación del libro original
        Libro libroOriginal = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 863);

        // 2. Creación del objeto copia usando el constructor copia
        Libro libroCopia = new Libro(libroOriginal);

        // Mostramos ambos libros
        System.out.println("Libro Original");
        libroOriginal.mostrarInfo();

        System.out.println("\nLibro Copia");
        libroCopia.mostrarInfo();
    }
}
