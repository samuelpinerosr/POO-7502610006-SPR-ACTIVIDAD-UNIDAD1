package ParteI;
public class Ejercicio48 {
    // Atributo de la clase
    private double saldo;

    // --- CÓDIGO CORREGIDO ---
    public void depositar(double monto) {
        this.saldo += monto; // Modifica el atributo real mediante 'this'
    }

    public void mostrarSaldo() {
        System.out.println("   -> Resultado: Saldo en el atributo: $" + this.saldo);
    }

    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 48 ===");
        System.out.println("1. CÓDIGO ERRADO:");
        System.out.println("   public void depositar(double monto) {\n" +
                "       double saldo = monto; // Redeclara una variable local con el mismo nombre\n" +
                "   }");

        System.out.println("\n2. ¿POR QUÉ NO FUNCIONA?");
        System.out.println("   Error de Lógica (Sombreado / Variable Shadowing):");
        System.out.println("   Redeclarar 'double saldo' crea una variable temporal del método, dejando el atributo en 0.0.");

        System.out.println("\n3. EJECUCIÓN DEL CÓDIGO CORREGIDO:");
        Ejercicio48 cuenta = new Ejercicio48();
        cuenta.depositar(500.0);
        cuenta.mostrarSaldo();
    }
}