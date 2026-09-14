package ParteJ;
class Reloj {
    // Atributos
    private int hora;
    private int minuto;
    private int segundo;

    // Constructor
    public Reloj(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    // Método para mostrar la hora en formato HH:MM:SS
    public void mostrarHora() {
        System.out.printf("Hora actual: %02d:%02d:%02d%n", this.hora, this.minuto, this.segundo);
    }
}

public class Ejercicio55 {
    public static void main(String[] args) {
        // Prueba de la clase Reloj
        Reloj miReloj = new Reloj(10, 8, 5);

        miReloj.mostrarHora();
    }
}