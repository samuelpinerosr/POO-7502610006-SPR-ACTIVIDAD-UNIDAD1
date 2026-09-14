package ParteI;
public class Ejercicio46 {
    private int edad;

    public Ejercicio46(int edad) {
        this.edad = edad;
    }

    public void mostrarEdad() {
        System.out.println("   -> Resultado: Edad registrada: " + this.edad + " años.");
    }

    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 46 ===");
        System.out.println("1. CÓDIGO ERRADO:");
        System.out.println("   public class {\n" +
                "       private int edad;\n" +
                "   } // Falta el nombre de la clase");

        System.out.println("\n2. ¿POR QUÉ NO FUNCIONA?");
        System.out.println("   Error del compilador: '<identifier> expected'.");
        System.out.println("   La palabra clave 'class' requiere obligatoriamente un nombre para identificarse.");

        System.out.println("\n3. EJECUCIÓN DEL CÓDIGO CORREGIDO:");
        Ejercicio46 objeto = new Ejercicio46(25);
        objeto.mostrarEdad();
    }
}