package ParteL;
/*
 * PARTE L. EJERCICIOS DE CONSOLIDACIÓN FINAL
 * Ejercicio 67 - Diseño de la clase RutinaDiaria:
 *
 * 1. ATRIBUTOS:
 *    - momento (String): Bloque del día ("Mañana", "Tarde", "Noche").
 *    - actividad (String): Tarea o estudio realizado en dicho bloque.
 *    - horario (String): Rango de horas asignado a la actividad.
 *    - recursosUtilizados (String): Herramientas, plataformas o medios de apoyo.
 *    - nivelSatisfaccion (int): Escala de valoración del 1 al 10.
 *
 * 2. MÉTODOS:
 *    - actualizarSatisfaccion(int nuevoNivel): Modifica el puntaje de satisfacción.
 *    - mostrarDetalle(): Muestra la ficha completa de la rutina para ese momento.
 *
 * 3. OBJETOS REALES A CONSTRUIR:
 *    - rutinaManana: Momento: "Mañana", Actividad: "Estudiar en la universidad", Horario: "7am - 12pm", Recursos: "Investigación online y recursos de la plataforma", Satisfacción: 10
 *    - rutinaTarde: Momento: "Tarde", Actividad: "Clases de inglés", Horario: "2:30pm - 4pm", Recursos: "Clase presencial y material de estudio institucional", Satisfacción: 10
 *    - rutinaNoche: Momento: "Noche", Actividad: "Estudio de cosas que me llaman la atención o hacer actividades pendientes", Horario: "6pm - 10pm", Recursos: "Investigación online, plataforma institucional, videos de youtube", Satisfacción: 10
 */

class RutinaDiaria {
    // Atributos
    private String momento;
    private String actividad;
    private String horario;
    private String recursosUtilizados;
    private int nivelSatisfaccion;

    // Constructor
    public RutinaDiaria(String momento, String actividad, String horario, String recursosUtilizados, int nivelSatisfaccion) {
        this.momento = momento;
        this.actividad = actividad;
        this.horario = horario;
        this.recursosUtilizados = recursosUtilizados;
        this.nivelSatisfaccion = nivelSatisfaccion;
    }

    // Método para actualizar la satisfacción si cambia en algún momento
    public void actualizarSatisfaccion(int nuevoNivel) {
        if (nuevoNivel >= 1 && nuevoNivel <= 10) {
            this.nivelSatisfaccion = nuevoNivel;
            System.out.println("Nivel de satisfacción actualizado a " + nuevoNivel + "/10 para el bloque de la " + esteMomento());
        } else {
            System.out.println("El nivel de satisfacción debe estar entre 1 y 10.");
        }
    }

    private String esteMomento() {
        return this.momento.toLowerCase();
    }

    // Método para imprimir los detalles de la rutina
    public void mostrarDetalle() {
        System.out.println("=== MOMENTO: " + this.momento.toUpperCase() + " ===");
        System.out.println("• Actividad: " + this.actividad);
        System.out.println("• Horario: " + this.horario);
        System.out.println("• Recursos utilizados: " + this.recursosUtilizados);
        System.out.println("• Nivel de satisfacción: " + this.nivelSatisfaccion + "/10");
        System.out.println();
    }
}

public class Ejercicio67 {
    public static void main(String[] args) {
        // Objeto 1: Mañana
        RutinaDiaria rutinaManana = new RutinaDiaria(
                "Mañana",
                "Estudiar en la universidad",
                "7am - 12pm",
                "Investigación online y recursos de la plataforma",
                10
        );

        // Objeto 2: Tarde
        RutinaDiaria rutinaTarde = new RutinaDiaria(
                "Tarde",
                "Clases de inglés",
                "2.30 pm - 4pm",
                "Clase presencial y material de estudio institucional",
                10
        );

        // Objeto 3: Noche
        RutinaDiaria rutinaNoche = new RutinaDiaria(
                "Noche",
                "Estudio de cosas que me llaman la atención o hacer actividades pendientes",
                "6pm - 10pm",
                "Investigación online, plataforma institucional, videos de youtube",
                10
        );

        // Visualización de la jornada completa
        rutinaManana.mostrarDetalle();
        rutinaTarde.mostrarDetalle();
        rutinaNoche.mostrarDetalle();
    }
}