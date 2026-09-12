package ParteE;
class CuentaBancariaa {
    String numero;
    String titular;
    double saldo;

    // Constructor con numero, titular y saldo inicial
    CuentaBancariaa(String numero, String titular, double saldoInicial) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    void mostrarInfo() {
        System.out.println("Cuenta No: " + numero + " | Titular: " + titular + " | Saldo: $" + saldo);
    }
}

public class Ejercicio27 {
    public static void main(String[] args) {
        // Creación del objeto usando el nuevo constructor
        CuentaBancariaa miCuenta = new CuentaBancariaa("123-456-789", "Mario", 1500.0);

        miCuenta.mostrarInfo();
    }
}