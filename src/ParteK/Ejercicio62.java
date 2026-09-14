package ParteK;
/*
 * 1. ATRIBUTOS:
 *    - nombre (String): Nombre de la biblioteca.
 *    - ciudad (String): Ciudad donde se ubica.
 *    - cantidadLibros (int): Total de libros disponibles en el inventario.
 *
 * 2. MÉTODOS:
 *    - prestarLibro(int cantidad): Reduce el stock de libros disponibles.
 *    - recibirDevolucion(int cantidad): Aumenta el stock de libros disponibles.
 *    - mostrarInfo(): Muestra los datos de la biblioteca y su disponibilidad.
 *
 * 3. OBJETOS REALES A CONSTRUIR:
 *    - biblio1: Nombre: "Biblioteca Nacional", Ciudad: "Bogotá", Libros: 5000
 *    - biblio2: Nombre: "Biblioteca Comfenalco", Ciudad: "Medellín", Libros: 1200
 */

class Biblioteca {
    // Atributos
    private String nombre;
    private String ciudad;
    private int cantidadLibros;

    // Constructor
    public Biblioteca(String nombre, String ciudad, int cantidadLibros) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.cantidadLibros = cantidadLibros;
    }

    // Métodos
    public void prestarLibro(int cantidad) {
        if (cantidad <= this.cantidadLibros) {
            this.cantidadLibros -= cantidad;
            System.out.println("Se prestaron " + cantidad + " libro(s). Stock restante: " + this.cantidadLibros);
        } else {
            System.out.println("No hay suficientes libros disponibles para realizar el préstamo.");
        }
    }

    public void recibirDevolucion(int cantidad) {
        this.cantidadLibros += cantidad;
        System.out.println("Se devolvieron " + cantidad + " libro(s). Stock actual: " + this.cantidadLibros);
    }

    public void mostrarInfo() {
        System.out.println("--- " + this.nombre + " (" + this.ciudad + ") ---");
        System.out.println("Libros disponibles: " + this.cantidadLibros);
    }
}

public class Ejercicio62 {
    public static void main(String[] args) {
        // Objetos reales construidos a partir del diseño previo
        Biblioteca biblio1 = new Biblioteca("Biblioteca Nacional", "Bogotá", 5000);
        Biblioteca biblio2 = new Biblioteca("Biblioteca Comfenalco", "Medellín", 1200);

        biblio1.mostrarInfo();
        biblio1.prestarLibro(3);

        System.out.println();

        biblio2.mostrarInfo();
        biblio2.recibirDevolucion(5);
    }
}