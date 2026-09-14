package ParteG;
class Lampara {
    // Atributos
    private String marca;
    private boolean encendida;

    // Constructor
    public Lampara(String marca) {
        this.marca = marca;
        this.encendida = false; // Por defecto inicia apagada
    }

    // Métodos
    public void encender() {
        this.encendida = true;
    }

    public void apagar() {
        this.encendida = false;
    }

    public void mostrarEstado() {
        String estado = this.encendida ? "Encendida" : "Apagada";
        System.out.println("Lámpara " + this.marca + " -> Estado: " + estado);
    }
}

public class Ejercicio35 {
    public static void main(String[] args) {
        // Prueba de la clase Lampara
        Lampara miLampara = new Lampara("Philips");

        miLampara.mostrarEstado();
        miLampara.encender();
        miLampara.mostrarEstado();
        miLampara.apagar();
        miLampara.mostrarEstado();
    }
}