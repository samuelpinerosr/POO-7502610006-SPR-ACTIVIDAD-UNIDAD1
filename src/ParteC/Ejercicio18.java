package ParteC;

class Mascota {
    String nombre;
    int edad;

    Mascota(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método que incrementa la edad en 1
    void cumplirAnios() {
        this.edad = this.edad + 1;
        System.out.println("¡Feliz cumpleaños " + this.nombre + "! Ahora tiene " + this.edad + " años.");
    }
}
public class Ejercicio18 {
    public static void main(String[] args) {
        Mascota miMascota = new Mascota("Max", 2);

        System.out.println("Edad inicial: " + miMascota.edad + " año(s)");

        // Celebramos el primer cumpleaños
        miMascota.cumplirAnios();
        System.out.println("Nueva edad: " + miMascota.edad + " año(s)");

        // Celebramos otro cumpleaños
        miMascota.cumplirAnios();
        System.out.println("Nueva edad: " + miMascota.edad + " año(s)");
    }
}

