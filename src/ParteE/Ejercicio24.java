package ParteE;
class Librodos {
    String titulo;
    String autor;
    int paginas;

    Librodos() {
    }

    Librodos(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    void mostrarInfo() {
        System.out.println("Libro: \"" + titulo + "\" | Autor: " + autor + " | Páginas: " + paginas);
    }
}
public class Ejercicio24 {
    public static void main(String[] args) {

        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 496);

        System.out.println("libro con parametros");
        libro1.mostrarInfo();


    }
}

