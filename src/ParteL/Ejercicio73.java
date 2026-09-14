
package ParteL;
/*
 * EJERCICIO 73 (Refactorización del Ejercicio 2)
 * Clase reescrita: Vehiculo73
 *
 * 1. ATRIBUTOS:
 *    - marca (String)
 *    - modelo (int)
 *    - velocidadActual (int)
 *
 * 2. CAMBIO PRINCIPAL:
 *    - Se añade un Constructor Copia (Vehiculo73 otroVehiculo) que recibe
 *      un objeto existente como parámetro y duplica sus atributos.
 */

class Vehiculo73 {
    // Atributos encapsulados
    private String marca;
    private int modelo;
    private int velocidadActual;

    // Constructor con parámetros
    public Vehiculo73(String marca, int modelo, int velocidadActual) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadActual = velocidadActual;
    }

    // CONSTRUCTOR COPIA
    public Vehiculo73(Vehiculo73 otroVehiculo) {
        this.marca = otroVehiculo.marca;
        this.modelo = otroVehiculo.modelo;
        this.velocidadActual = otroVehiculo.velocidadActual;
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

public class Ejercicio73 {
    public static void main(String[] args) {
        // 1. Crear el objeto original
        Vehiculo73 autoOriginal = new Vehiculo73("Toyota", 2023, 50);
        System.out.print("Objeto Original: ");
        autoOriginal.mostrarInfo();

        System.out.println();

        // 2. Crear una copia exacta del objeto original usando el Constructor Copia
        Vehiculo73 autoCopia = new Vehiculo73(autoOriginal);
        System.out.print("Objeto Copia (recién creado): ");
        autoCopia.mostrarInfo();

        System.out.println();

        // 3. Modificar el objeto copia para demostrar que son independientes en memoria
        System.out.println("--- Modificando únicamente la copia ---");
        autoCopia.acelerar(30);

        System.out.print("Objeto Original (sin cambios): ");
        autoOriginal.mostrarInfo();

        System.out.print("Objeto Copia (modificado): ");
        autoCopia.mostrarInfo();
    }
}
