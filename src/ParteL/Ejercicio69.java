package ParteL;
/*
 * PARTE L. EJERCICIOS DE CONSOLIDACIÓN FINAL
 * Ejercicio 69 - Instanciación de múltiples objetos (al menos 5 por clase):
 *
 * 1. CLASES UTILIZADAS (con sufijo 1 para evitar duplicidad):
 *    - ProyectoProgramacion1
 *    - RutinaDiaria1
 *    - NegocioGalletas1
 *
 * 2. OBJETIVO:
 *    - Crear al menos 5 instancias únicas con datos independientes para cada clase.
 */

// --- CLASE 1: ProyectoProgramacion1 ---
class ProyectoProgramacion1 {
    private String titulo;
    private String lenguaje;
    private double porcentajeAvance;

    public ProyectoProgramacion1(String titulo, String lenguaje, double porcentajeAvance) {
        this.titulo = titulo;
        this.lenguaje = lenguaje;
        this.porcentajeAvance = porcentajeAvance;
    }

    public void mostrarInfo() {
        System.out.println("Proyecto: " + this.titulo + " | Lenguaje: " + this.lenguaje + " | Avance: " + this.porcentajeAvance + "%");
    }
}

// --- CLASE 2: RutinaDiaria1 ---
class RutinaDiaria1 {
    private String momento;
    private String actividad;
    private String horario;
    private String recursosUtilizados;
    private int nivelSatisfaccion;

    public RutinaDiaria1(String momento, String actividad, String horario, String recursosUtilizados, int nivelSatisfaccion) {
        this.momento = momento;
        this.actividad = actividad;
        this.horario = horario;
        this.recursosUtilizados = recursosUtilizados;
        this.nivelSatisfaccion = nivelSatisfaccion;
    }

    public void mostrarInfo() {
        System.out.println("[" + this.momento + " - " + this.horario + "] " + this.actividad + " | Satisfacción: " + this.nivelSatisfaccion + "/10");
    }
}

// --- CLASE 3: NegocioGalletas1 ---
class NegocioGalletas1 {
    private String sucursal;
    private int stock;
    private double precio;
    private int unidadesVendidas;

    public NegocioGalletas1(String sucursal, int stock, double precio) {
        this.sucursal = sucursal;
        this.stock = stock;
        this.precio = precio;
        this.unidadesVendidas = 0;
    }

    public void mostrarInfo() {
        System.out.println("Sucursal: " + this.sucursal + " | Stock: " + this.stock + " galletas | Precio unitario: $" + this.precio);
    }
}

public class Ejercicio69 {
    public static void main(String[] args) {

        System.out.println("=== 1. OBJETOS DE LA CLASE PROYECTOPROGRAMACION1 ===");
        ProyectoProgramacion1 proj1 = new ProyectoProgramacion1("Sistema de Inventario", "Java", 85.0);
        ProyectoProgramacion1 proj2 = new ProyectoProgramacion1("App Móvil de Tareas", "Kotlin", 40.0);
        ProyectoProgramacion1 proj3 = new ProyectoProgramacion1("Página Web Institucional", "JavaScript", 100.0);
        ProyectoProgramacion1 proj4 = new ProyectoProgramacion1("Modelo de Análisis de Datos", "Python", 15.0);
        ProyectoProgramacion1 proj5 = new ProyectoProgramacion1("Base de Datos Académica", "SQL", 60.0);

        proj1.mostrarInfo();
        proj2.mostrarInfo();
        proj3.mostrarInfo();
        proj4.mostrarInfo();
        proj5.mostrarInfo();

        System.out.println("\n=== 2. OBJETOS DE LA CLASE RUTINADIARIA1 ===");
        RutinaDiaria1 rutina1 = new RutinaDiaria1("Mañana", "Estudiar en la universidad", "7am - 12pm", "Investigación online y recursos de la plataforma", 10);
        RutinaDiaria1 rutina2 = new RutinaDiaria1("Tarde", "Clases de inglés", "2:30pm - 4pm", "Clase presencial y material institucional", 10);
        RutinaDiaria1 rutina3 = new RutinaDiaria1("Noche", "Estudio personal y tareas", "6pm - 10pm", "Plataforma, YouTube y documentación", 10);
        RutinaDiaria1 rutina4 = new RutinaDiaria1("Fin de Semana", "Repaso autónomo de programación", "9am - 1pm", "IDE Java y documentación oficial", 9);
        RutinaDiaria1 rutina5 = new RutinaDiaria1("Madrugada", "Planificación semanal de proyectos", "5am - 6am", "Agenda digital y Notion", 8);

        rutina1.mostrarInfo();
        rutina2.mostrarInfo();
        rutina3.mostrarInfo();
        rutina4.mostrarInfo();
        rutina5.mostrarInfo();

        System.out.println("\n=== 3. OBJETOS DE LA CLASE NEGOCIOGALLETAS1 ===");
        NegocioGalletas1 galleta1 = new NegocioGalletas1("Sede Central Norte", 150, 2000.0);
        NegocioGalletas1 galleta2 = new NegocioGalletas1("Punto de Venta Universidad", 80, 2000.0);
        NegocioGalletas1 galleta3 = new NegocioGalletas1("Kiosco Centro Comercial", 200, 2500.0);
        NegocioGalletas1 galleta4 = new NegocioGalletas1("Express San Diego", 50, 2000.0);
        NegocioGalletas1 galleta5 = new NegocioGalletas1("Sede Poblado", 120, 2500.0);

        galleta1.mostrarInfo();
        galleta2.mostrarInfo();
        galleta3.mostrarInfo();
        galleta4.mostrarInfo();
        galleta5.mostrarInfo();
    }
}