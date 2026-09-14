package ParteI;
class Libro {
    public void leer() {
        System.out.println("   -> Resultado: Objeto creado exitosamente. Leyendo libro...");
    }
}

public class Ejercicio50 {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 50 ===");
        System.out.println("1. CÓDIGO ERRADO:");
        System.out.println("   class Libro { public void leer() {...} }\n" +
                "   public static void main(String[] args) {\n" +
                "       // La clase existe pero nunca se construye el objeto\n" +
                "   }");

        System.out.println("\n2. ¿POR QUÉ NO FUNCIONA?");
        System.out.println("   Error de Lógica:");
        System.out.println("   Una clase es solo un plano. Sin instanciarla con 'new', no se ocupa memoria ni se ejecuta nada.");

        System.out.println("\n3. EJECUCIÓN DEL CÓDIGO CORREGIDO:");
        // --- CÓDIGO CORREGIDO ---
        Libro miLibro = new Libro(); // Se construye el objeto
        miLibro.leer();
    }
}