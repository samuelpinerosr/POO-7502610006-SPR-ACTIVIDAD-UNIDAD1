package ParteI;
public class Ejercicio45 {

    // --- CÓDIGO CORREGIDO ---
    private String titulo;

    // El método DEBE ir dentro de las llaves de la clase
    public void saludar() {
        System.out.println("   -> Resultado: ¡Hola! Método dentro de la clase ejecutado.");
    }

    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 45 ===");
        System.out.println("1. CÓDIGO ERRADO:");
        System.out.println("   public class Ejercicio45 { private String titulo; }\n" +
                "   public void saludar() { System.out.println(\"Hola\"); } // FUERA DE LA CLASE");

        System.out.println("\n2. ¿POR QUÉ NO FUNCIONA?");
        System.out.println("   Error del compilador: 'class, interface, enum, or record expected'.");
        System.out.println("   En Java, ningún método puede existir suelto fuera del cuerpo de una clase.");

        System.out.println("\n3. EJECUCIÓN DEL CÓDIGO CORREGIDO:");
        Ejercicio45 objeto = new Ejercicio45();
        objeto.saludar();
    }
}