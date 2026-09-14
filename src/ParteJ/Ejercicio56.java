package ParteJ;
class Temperatura {
    // Atributo
    private double celsius;

    // Constructor
    public Temperatura(double celsius) {
        this.celsius = celsius;
    }

    // Método para convertir de Celsius a Fahrenheit
    public double aFahrenheit() {
        return (this.celsius * 9 / 5) + 32;
    }

    // Método para mostrar la conversión
    public void mostrarConversion() {
        System.out.println(this.celsius + " °C equivalen a " + aFahrenheit() + " °F");
    }
}

public class Ejercicio56 {
    public static void main(String[] args) {
        // Prueba de la clase Temperatura
        Temperatura temp = new Temperatura(25.0);

        temp.mostrarConversion();
    }
}