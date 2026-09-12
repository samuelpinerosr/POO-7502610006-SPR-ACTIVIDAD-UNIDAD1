package ParteD;
class Libro {
    String titulo;
    String autor;
    int paginas;

    Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    void mostrarInfo() {
        System.out.println("Libro: \"" + titulo + "\" | Autor: " + autor + " | Páginas: " + paginas);
    }
}
public class Ejercicio22 {
    public static void main(String[] args) {
        // Creación de cuatro objetos distintos a partir de la misma clase 'Libro'
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 496);
        Libro libro2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 863);
        Libro libro3 = new Libro("1984", "George Orwell", 328);
        Libro libro4 = new Libro("El principito", "Antoine de Saint-Exupéry", 96);

        // Mostramos los cuatro casos concretos
        libro1.mostrarInfo();
        libro2.mostrarInfo();
        libro3.mostrarInfo();
        libro4.mostrarInfo();

        System.out.println("\nConclusión:\n" +
                "La clase 'Libro' es la plantilla porque define la estructura abstracta,\n" +
                "mientras que los objetos son casos concretos que guardan valores\n" +
                "reales e independientes en la memoria.");
    }
}

