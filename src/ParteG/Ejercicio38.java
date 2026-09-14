package ParteG;
class Ventilador {
    // Atributos
    private String marca;
    private int velocidad;
    private boolean encendido;

    // Constructor
    public Ventilador(String marca) {
        this.marca = marca;
        this.velocidad = 0; // Inicia detenido
        this.encendido = false; // Inicia apagado
    }

    // Métodos
    public void encender() {
        this.encendido = true;
        if (this.velocidad == 0) {
            this.velocidad = 1; // Al encender, arranca en velocidad 1
        }
        System.out.println("El ventilador " + this.marca + " se ha encendido en velocidad " + this.velocidad + ".");
    }

    public void apagar() {
        this.encendido = false;
        this.velocidad = 0;
        System.out.println("El ventilador " + this.marca + " se ha apagado.");
    }

    public void subirVelocidad() {
        if (this.encendido) {
            this.velocidad++;
            System.out.println("Velocidad aumentada a: " + this.velocidad);
        } else {
            System.out.println("No se puede subir la velocidad porque el ventilador está apagado.");
        }
    }
}

public class Ejercicio38 {
    public static void main(String[] args) {
        // Prueba de la clase Ventilador
        Ventilador miVentilador = new Ventilador("Samurai");

        miVentilador.encender();
        miVentilador.subirVelocidad();
        miVentilador.subirVelocidad();
        miVentilador.apagar();
    }
}