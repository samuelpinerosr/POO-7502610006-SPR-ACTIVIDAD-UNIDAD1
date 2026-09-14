package ParteL;
/*
 * EJERCICIO 71 (Refactorización del Ejercicio 2)
 * Clase reescrita: Vehiculo71
 *
 * 1. ATRIBUTOS:
 *    - marca (String)
 *    - modelo (int)
 *    - velocidadActual (int)
 *
 * 2. CAMBIO PRINCIPAL:
 *    - Se reemplaza la asignación manual por un constructor con parámetros.
 */

class Vehiculo71 {
    // Atributos encapsulados
    private String marca;
    private int modelo;
    private int velocidadActual;

    // Constructor con parámetros
    public Vehiculo71(String marca, int modelo, int velocidadActual) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadActual = velocidadActual;
    }

    // Métodos de comportamiento
    public void acelerar(int incremento) {
        this.velocidadActual += incremento;
        System.out.println(this.marca + " aceleró. Velocidad actual: " + this.velocidadActual + " km/h");
    }

    public void mostrarInfo() {
        System.out.println("Vehículo: " + this.marca + " | Modelo: " + this.modelo + " | Velocidad: " + this.velocidadActual + " km/h");
    }
}

public class Ejercicio71 {
    public static void main(String[] args) {
        // Instanciación directa pasando los datos al constructor con parámetros
        Vehiculo71 auto1 = new Vehiculo71("Toyota", 2022, 0);
        Vehiculo71 auto2 = new Vehiculo71("Mazda", 2024, 40);

        auto1.mostrarInfo();
        auto1.acelerar(60);

        System.out.println();

        auto2.mostrarInfo();
        auto2.acelerar(20);
    }
}