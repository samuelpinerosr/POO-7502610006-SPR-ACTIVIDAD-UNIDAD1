package ParteK;

// Atributos de la clase:
// - nombre (String): Nombre del equipo de fútbol.
// - ciudad (String): Ciudad de origen del equipo.
// - puntos (int): Cantidad de puntos acumulados en la tabla de posiciones.
class EquipoDeFutbol {
    // Atributos
    private String nombre;
    private String ciudad;
    private int puntos;

    // Constructor
    public EquipoDeFutbol(String nombre, String ciudad, int puntos) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.puntos = puntos;
    }

    // Métodos de la clase:
    // - ganarPartido(): Aumenta en 3 la cantidad de puntos del equipo por victoria.
    // - empatarPartido(): Aumenta en 1 la cantidad de puntos del equipo por empate.
    // - mostrarTabla(): Imprime en consola la información básica y los puntos acumulados.
    public void ganarPartido() {
        this.puntos += 3;
        System.out.println(this.nombre + " ganó el partido (+3 pts).");
    }

    public void empatarPartido() {
        this.puntos += 1;
        System.out.println(this.nombre + " empató el partido (+1 pt).");
    }

    public void mostrarTabla() {
        System.out.println("--- Equipo: " + this.nombre + " (" + this.ciudad + ") ---");
        System.out.println("Puntos acumulados: " + this.puntos);
    }
}

public class Ejercicio65 {
    public static void main(String[] args) {
        // Objetos reales construidos a partir del diseño de la clase EquipoDeFutbol:
        // 1. equipo1: Representa a "Atlético Nacional" de la ciudad de Medellín con 12 puntos iniciales.
        // 2. equipo2: Representa a "Millonarios FC" de la ciudad de Bogotá con 10 puntos iniciales.
        EquipoDeFutbol equipo1 = new EquipoDeFutbol("Atlético Nacional", "Medellín", 12);
        EquipoDeFutbol equipo2 = new EquipoDeFutbol("Millonarios FC", "Bogotá", 10);

        equipo1.mostrarTabla();
        equipo1.ganarPartido();
        equipo1.mostrarTabla();

        System.out.println();

        equipo2.mostrarTabla();
        equipo2.empatarPartido();
        equipo2.mostrarTabla();
    }
}