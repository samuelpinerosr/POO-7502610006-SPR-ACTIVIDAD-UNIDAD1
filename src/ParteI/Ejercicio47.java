package ParteI;
public class Ejercicio47 {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 47 ===");
        System.out.println("1. CÓDIGO ERRADO:");
        System.out.println("   String mensaje;\n" +
                "   System.out.println(mensaje.length()); // Objeto sin inicializar");

        System.out.println("\n2. ¿POR QUÉ NO FUNCIONA?");
        System.out.println("   Error del compilador: 'variable mensaje might not have been initialized'.");
        System.out.println("   No puedes llamar métodos en una variable de tipo objeto que no ha sido creada o asignada.");

        System.out.println("\n3. EJECUCIÓN DEL CÓDIGO CORREGIDO:");
        // --- CÓDIGO CORREGIDO ---
        String mensaje = "Hola Java"; // Se crea e inicializa el objeto String
        System.out.println("   -> Resultado: Longitud del texto: " + mensaje.length());
    }
}