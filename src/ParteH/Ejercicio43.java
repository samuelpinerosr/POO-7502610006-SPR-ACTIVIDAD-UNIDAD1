package ParteH;
class Computador {
    // Atributos
    private String marca;
    private String procesador;
    private int ram; // Memoria RAM en GB

    // Constructor
    public Computador(String marca, String procesador, int ram) {
        this.marca = marca;
        this.procesador = procesador;
        this.ram = ram;
    }

    // Método
    public void mostrarEspecificaciones() {
        System.out.println("Computador " + this.marca + " | Procesador: " + this.procesador + " | RAM: " + this.ram + " GB");
    }
}

public class Ejercicio43 {
    public static void main(String[] args) {
        // Creación de una máquina concreta (Objeto) a partir del plano (Clase)
        Computador miPc = new Computador("Lenovo", "Intel i7", 16);

        miPc.mostrarEspecificaciones();
    }
}