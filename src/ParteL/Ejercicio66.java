package ParteL;
/*
 * PARTE L. EJERCICIOS DE CONSOLIDACIÓN FINAL
 * Ejercicio 66 - Diseño de la clase ProyectoProgramacion:
 *
 * 1. ATRIBUTOS:
 *    - titulo (String): Nombre del proyecto académico.
 *    - lenguaje (String): Lenguaje de programación utilizado (ej: "Java").
 *    - porcentajeAvance (double): Progreso del proyecto (0.0 a 100.0).
 *
 * 2. MÉTODOS:
 *    - avanzarProyecto(double porcentaje): Incrementa el progreso actual.
 *    - estaTerminado(): Retorna verdadero si el avance llegó al 100%.
 *    - mostrarEstado(): Muestra el reporte detallado del proyecto académico.
 *
 * 3. OBJETOS REALES A CONSTRUIR:
 *    - proyecto1: Título: "Sistema de Gestión OOP", Lenguaje: "Java", Avance: 45.0
 *    - proyecto2: Título: "Base de Datos Estudiantil", Lenguaje: "SQL", Avance: 90.0
 */

class ProyectoProgramacion {
    // Atributos
    private String titulo;
    private String lenguaje;
    private double porcentajeAvance;

    // Constructor
    public ProyectoProgramacion(String titulo, String lenguaje, double porcentajeAvance) {
        this.titulo = titulo;
        this.lenguaje = lenguaje;
        this.porcentajeAvance = porcentajeAvance;
    }

    // Métodos
    public void avanzarProyecto(double porcentaje) {
        if (porcentaje > 0) {
            this.porcentajeAvance += porcentaje;
            if (this.porcentajeAvance > 100.0) {
                this.porcentajeAvance = 100.0;
            }
            System.out.println("Progreso registrado: +" + porcentaje + "%. Avance total: " + this.porcentajeAvance + "%");
        } else {
            System.out.println("El incremento debe ser mayor a 0.");
        }
    }

    public boolean estaTerminado() {
        return this.porcentajeAvance >= 100.0;
    }

    public void mostrarEstado() {
        System.out.println("--- Proyecto: " + this.titulo + " ---");
        System.out.println("Lenguaje principal: " + this.lenguaje);
        System.out.println("Estado de entrega: " + (estaTerminado() ? "Completado" : "En desarrollo (" + this.porcentajeAvance + "%)"));
    }
}

public class Ejercicio66 {
    public static void main(String[] args) {
        // Objetos reales construidos a partir del contexto académico
        ProyectoProgramacion proyecto1 = new ProyectoProgramacion("Sistema de Gestión OOP", "Java", 45.0);
        ProyectoProgramacion proyecto2 = new ProyectoProgramacion("Base de Datos Estudiantil", "SQL", 90.0);

        proyecto1.mostrarEstado();
        proyecto1.avanzarProyecto(55.0);
        proyecto1.mostrarEstado();

        System.out.println();

        proyecto2.mostrarEstado();
        proyecto2.avanzarProyecto(10.0);
        proyecto2.mostrarEstado();
    }
}