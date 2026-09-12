package ParteE;
class Libro {
    String titulo;
    String autor;
    int paginas;

    Libro() {
    }

    Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    void mostrarInfo() {
        System.out.println("Libro: \"" + titulo + "\" | Autor: " + autor + " | Páginas: " + paginas);
    }
}
public class Ejercicio23 {
    public static void main(String[] args) {

        Libro libroVacio = new Libro();


        System.out.println("libro vacio");
        libroVacio.mostrarInfo();


    }
}

