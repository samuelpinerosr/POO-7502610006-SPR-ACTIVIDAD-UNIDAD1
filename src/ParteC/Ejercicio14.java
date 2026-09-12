package ParteC;

public class Ejercicio14 {
    public static void main(String[] args) {
        CuentaBank miCuenta = new CuentaBank("Juan", 500.0);

        System.out.println("Saldo inicial: $" + miCuenta.saldo);

        // Retiro exitoso
        miCuenta.retirar(200.0);
        System.out.println("Saldo actual: $" + miCuenta.saldo);

        // Intento de retiro superior al saldo disponible
        miCuenta.retirar(400.0);
        System.out.println("Saldo final: $" + miCuenta.saldo);
    }
}

class CuentaBank {
    String titular;
    double saldo;

    CuentaBank(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    // Método para restar dinero sólo si alcanza
    void retirar(double valor) {
        if (valor <= 0) {
            System.out.println("El valor a retirar debe ser mayor a 0.");
        } else if (valor <= this.saldo) {
            this.saldo = this.saldo - valor;
            System.out.println("Retiro exitoso de: $" + valor);
        } else {
            System.out.println("Fondos insuficientes. No puedes retirar $" + valor);
        }
    }
}