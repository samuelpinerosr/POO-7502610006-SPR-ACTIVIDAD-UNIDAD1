package ParteB;

class CuentaBancaria {
    String titular;
    double saldo;

    CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
}

public class Ejercicio10 {
    public static void main(String[] args) {
        // 1. Creamos dos cuentas distintas con saldos diferentes
        CuentaBancaria cuenta1 = new CuentaBancaria("Samuel", 500.0);
        CuentaBancaria cuenta2 = new CuentaBancaria("Ana", 1200.0);

        // 2. Mostramos sus saldos iniciales
        System.out.println(cuenta1.titular + " tiene un saldo de: $" + cuenta1.saldo);
        System.out.println(cuenta2.titular + " tiene un saldo de: $" + cuenta2.saldo);

        System.out.println("\n--- Se deposita $200 a la cuenta de Samuel ---");
        // 3. Le agregamos dinero solo a la cuenta 1
        cuenta1.saldo = cuenta1.saldo + 200.0;

        // 4. Se comprueba que cada una conserva su propio valor en memoria
        System.out.println(cuenta1.titular + " ahora tiene: $" + cuenta1.saldo);
        System.out.println(cuenta2.titular + " sigue teniendo: $" + cuenta2.saldo);
    }
}
