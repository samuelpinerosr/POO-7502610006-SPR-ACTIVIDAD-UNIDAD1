package ParteC;

public class Ejercicio13 {
    public static void main(String[] args) {
        CuentaBancaria miCuenta = new CuentaBancaria("Juan", 500.0);

        System.out.println("Saldo inicial: $" + miCuenta.saldo);

        // Consignación válida
        miCuenta.consignar(200.0);
        System.out.println("Saldo actual: $" + miCuenta.saldo);

        // Intento de consignación inválida
        miCuenta.consignar(-50.0);
        System.out.println("Saldo final: $" + miCuenta.saldo);
    }
}

class CuentaBancaria {
    String titular;
    double saldo;

    CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    // Método para sumar dinero a la cuenta
    void consignar(double valor) {
        if (valor > 0) {
            this.saldo = this.saldo + valor;
            System.out.println("Consignación exitosa de: $" + valor);
        } else {
            System.out.println("El valor a consignar debe ser mayor a 0.");
        }
    }
}