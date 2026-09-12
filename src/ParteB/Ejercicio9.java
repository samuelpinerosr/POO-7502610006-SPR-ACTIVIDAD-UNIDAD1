package ParteB;

class Mascota{
    String nombre;
    int edad;

    Mascota(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
}
public class Ejercicio9{
    public static void main(String[] args) {
        // 1. Creamos la mascota con 1 año
        Mascota mascota = new Mascota("Max", 1);
        System.out.println("Nombre de la mascota: " + mascota.nombre );
        System.out.println("Edad inicial: " + mascota.edad);

        // 2. Primer cambio
        mascota.edad = 3;
        System.out.println("Primer cambio de edad de "+mascota.nombre +": " + mascota.edad);

        // 3. Segundo cambio
        mascota.edad = 7;
        System.out.println("Segundo cambio de edad de "+mascota.nombre +": "  + mascota.edad);
    }
}