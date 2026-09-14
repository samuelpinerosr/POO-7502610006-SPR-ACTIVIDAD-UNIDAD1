
package ParteL;
/*
 * PARTE L. EJERCICIOS DE CONSOLIDACIÓN FINAL
 * Ejercicio 70 - Explicación de la POO aplicada en los ejercicios anteriores.
 */

public class Ejercicio70 {
    public static void main(String[] args) {

        System.out.println("=== EXPLICACIÓN DE CONCEPTOS POO (EJERCICIO 70) ===\n");

        System.out.println("1. CUÁLES FUERON LAS CLASES:");
        System.out.println("   • ProyectoProgramacion1: Moldes para representar proyectos académicos.");
        System.out.println("   • RutinaDiaria1: Moldes para representar los bloques de tiempo de la jornada.");
        System.out.println("   • NegocioGalletas1: Moldes para gestionar el inventario y ventas del negocio.");
        System.out.println();

        System.out.println("2. CUÁLES FUERON LOS OBJETOS:");
        System.out.println("   • Instancias concretas creadas a partir de las clases (ej: proj1, proj2, rutina1, rutina2, galleta1, galleta2, etc.).");
        System.out.println("   • Cada uno ocupó un espacio en memoria con datos específicos (ej: 'Sede Central Norte' con 150 galletas).");
        System.out.println();

        System.out.println("3. CUÁLES FUERON SUS ATRIBUTOS:");
        System.out.println("   • ProyectoProgramacion1: titulo, lenguaje, porcentajeAvance.");
        System.out.println("   • RutinaDiaria1: momento, actividad, horario, recursosUtilizados, nivelSatisfaccion.");
        System.out.println("   • NegocioGalletas1: sucursal, stock, precio, unidadesVendidas.");
        System.out.println();

        System.out.println("4. CUÁLES FUERON SUS COMPORTAMIENTOS (MÉTODOS):");
        System.out.println("   • ProyectoProgramacion1: mostrarInfo() (imprime estado de avance).");
        System.out.println("   • RutinaDiaria1: mostrarInfo() (imprime el detalle y la satisfacción del bloque).");
        System.out.println("   • NegocioGalletas1: venderGalletas(), reponerStock(), mostrarInfo() (gestionan el flujo de ventas e inventario).");
    }
}