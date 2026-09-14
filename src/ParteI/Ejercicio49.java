package ParteI;
class Auto {
    private String marca = "Toyota";

    // Getter para acceder al atributo privado
    public String getMarca() {
        return this.marca;
    }
}

public class Ejercicio49 {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 49 ===");
        System.out.println("1. CÓDIGO ERRADO:");
        System.out.println("   Auto miAuto = new Auto();\n" +
                "   System.out.println(marca); // Se accede al atributo sin usar 'miAuto'");

        System.out.println("\n2. ¿POR QUÉ NO FUNCIONA?");
        System.out.println("   Error del compilador: 'cannot find symbol: variable marca'.");
        System.out.println("   'marca' le pertenece a la instancia del objeto, por lo que requiere su referencia.");

        System.out.println("\n3. EJECUCIÓN DEL CÓDIGO CORREGIDO:");
        // --- CÓDIGO CORREGIDO ---
        Auto miAuto = new Auto();
        System.out.println("   -> Resultado: Marca accedida mediante la referencia: " + miAuto.getMarca());
    }
}