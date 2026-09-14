package ParteG;
class Celular {
    // Atributos
    private String marca;
    private int bateria;
    private boolean prendido;

    // Constructor
    public Celular(String marca, int bateriaInicial) {
        this.marca = marca;
        this.bateria = bateriaInicial;
        this.prendido = false; // Por defecto inicia apagado
    }

    // Métodos
    public void encender() {
        if (this.bateria > 0) {
            this.prendido = true;
            System.out.println("El celular " + this.marca + " se ha encendido.");
        } else {
            System.out.println("No se puede encender el celular " + this.marca + " sin batería.");
        }
    }

    public void apagar() {
        this.prendido = false;
        System.out.println("El celular " + this.marca + " se ha apagado.");
    }

    public void cargarBateria(int cantidad) {
        this.bateria += cantidad;
        if (this.bateria > 100) {
            this.bateria = 100; // Limita el máximo a 100%
        }
        System.out.println("Batería cargada. Nivel actual: " + this.bateria + "%");
    }
}

public class Ejercicio37 {
    public static void main(String[] args) {
        // Prueba de la clase Celular
        Celular miCelular = new Celular("Samsung", 50);

        miCelular.encender();
        miCelular.cargarBateria(30);
        miCelular.apagar();
    }
}