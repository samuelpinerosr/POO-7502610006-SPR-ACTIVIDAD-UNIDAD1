package ParteE;
class CuentaBancaria {
    String numero;
    String titular;
    double saldo;

    // Constructor con número, titular y saldo inicial
    CuentaBancaria(String numero, String titular, double saldoInicial) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    void mostrarInfo() {
        System.out.println("Cuenta No: " + numero + " | Titular: " + titular + " | Saldo: $" + saldo);
    }
}
public class Ejercicio28 {
    public static void main(String[] args) {
        // Creación de tres cuentas bancarias usando el mismo constructor
        CuentaBancaria cuenta1 = new CuentaBancaria("100-001-892", "Carlos", 2500.50);
        CuentaBancaria cuenta2 = new CuentaBancaria("200-004-511", "María", 800.00);
        CuentaBancaria cuenta3 = new CuentaBancaria("300-009-340", "Jorge", 12500.75);

        // Mostramos la información de cada cuenta
        cuenta1.mostrarInfo();
        cuenta2.mostrarInfo();
        cuenta3.mostrarInfo();
    }
}

