package ParteJ;
class Semaforo {
    // Atributo
    private String colorActual;

    // Constructor (inicia por defecto en Rojo)
    public Semaforo() {
        this.colorActual = "Rojo";
    }

    // Método para cambiar el color en secuencia (Rojo -> Verde -> Amarillo -> Rojo)
    public void cambiar() {
        switch (this.colorActual) {
            case "Rojo":
                this.colorActual = "Verde";
                break;
            case "Verde":
                this.colorActual = "Amarillo";
                break;
            case "Amarillo":
                this.colorActual = "Rojo";
                break;
            default:
                this.colorActual = "Rojo";
                break;
        }
        System.out.println("El semáforo cambió a: " + this.colorActual);
    }

    // Método para mostrar el estado actual
    public void mostrarEstado() {
        System.out.println("Color actual del semáforo: " + this.colorActual);
    }
}

public class Ejercicio54 {
    public static void main(String[] args) {
        // Prueba de la clase Semaforo
        Semaforo semaforo = new Semaforo();

        semaforo.mostrarEstado();
        semaforo.cambiar(); // Pasa a Verde
        semaforo.cambiar(); // Pasa a Amarillo
        semaforo.cambiar(); // Pasa a Rojo
    }
}