package ParteC;

class Vehiculo {
    String marca;
    int velocidad;

    Vehiculo(String marca, int velocidad) {
        this.marca = marca;
        this.velocidad = velocidad;
    }

    // Método que aumenta la velocidad en 10
    void acelerar() {
        this.velocidad = this.velocidad + 10;
    }
}
public class Ejercicio11 {
    public static void main(String[] args) {
        Vehiculo miAuto = new Vehiculo("Toyota", 50);

        System.out.println("Mi auto marca " + miAuto.marca + " corre a una velocidad inicial de " + miAuto.velocidad + " km/h");

        // Llamamos al método acelerar
        miAuto.acelerar();
        System.out.println("Después de acelerar mi auto fue a " + miAuto.velocidad + " km/h");

        // Aceleramos otra vez
        miAuto.acelerar();
        System.out.println("Luego, aceleré nuevamente y ahora iba a " + miAuto.velocidad + " km/h");
    }
}

