package ParteC;

class Auto {
    int velocidad;

    Auto(int velocidad) {
        this.velocidad = velocidad;
    }

    // Metodo que disminuye la velocidad en 10 sin permitir números negativos
    void frenar() {
        this.velocidad = this.velocidad - 10;

        if (this.velocidad < 0) {
            this.velocidad = 0;
        }
    }
}
public class Ejercicio12 {
    public static void main(String[] args) {
        Auto miAuto = new Auto( 15);

        System.out.println("Mi auto marca corre a una velocidad inicial de " + miAuto.velocidad + " km/h");
        // Primera frenada (15 - 10 = 5)
        miAuto.frenar();
        System.out.println("Frené y ahora va a " + miAuto.velocidad + " km/h");

        // Segunda frenada (5 - 10 -> no baja de 0)
        miAuto.frenar();
        System.out.println("Volví a frenar y ahora va a " + miAuto.velocidad + " km/h");
    }
}

