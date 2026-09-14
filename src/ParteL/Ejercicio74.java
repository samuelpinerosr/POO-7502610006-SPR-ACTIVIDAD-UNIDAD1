package ParteL;
/*
 * PARTE L. EJERCICIOS DE CONSOLIDACIÓN FINAL
 * Ejercicio 74 - Comparación de los tres tipos de constructores en Java.
 */

public class Ejercicio74 {
    public static void main(String[] args) {

        System.out.println("=== COMPARACIÓN DE FORMAS DE CONSTRUCCIÓN EN POO ===\n");

        System.out.println("1. CONSTRUCTOR POR DEFECTO (Sin parámetros):");
        System.out.println("   • Asigna valores vacíos o nulos por omisión.");
        System.out.println("   • Obliga a asignar los atributos manualmente después de instanciar.");
        System.out.println("   • Desventaja: Permite crear objetos 'incompletos' o con estado inconsistente.\n");

        System.out.println("2. CONSTRUCTOR CON PARÁMETROS:");
        System.out.println("   • Recibe los datos iniciales al momento de usar 'new'.");
        System.out.println("   • Asegura que el objeto nazca completamente configurado y válido en una sola línea.");
        System.out.println("   • Ventaja: Es directo, legible y evita olvidos en la inicialización.\n");

        System.out.println("3. CONSTRUCTOR COPIA:");
        System.out.println("   • Recibe un objeto del mismo tipo y duplica sus valores en la nueva instancia.");
        System.out.println("   • Utilidad: Muy útil cuando se requiere clonar objetos sin compartir referencia en memoria.");
        System.out.println("   • Desventaja: Requiere entender conceptos avanzados de manejo de memoria (referencias vs. valores).\n");

        System.out.println("=========================================================================");
        System.out.println("VERDICTO / ARGUMENTACIÓN PARA PRINCIPIANTES:");
        System.out.println("El CONSTRUCTOR CON PARÁMETROS es la forma más clara para principiantes.");
        System.out.println("Permite asociar de inmediato los atributos con los argumentos recibidos");
        System.out.println("y garantiza que ningún objeto se instancie sin la información obligatoria.");
        System.out.println("=========================================================================");
    }
}