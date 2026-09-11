package ParteA;

class cuentaBancaria{
    String numero;
    String titular;
    String saldo;

    cuentaBancaria(String numero, String titular, String saldo){
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }
    void mostrarCuenta(){
        System.out.println("Numero de cuenta: " + this.numero);
        System.out.println("Titular: " + this.titular);
        System.out.println("Saldo: " + this.saldo);
    }
}
public class ejercicio4 {
    public static void main(String[] args) {
        cuentaBancaria cuentaBancaria = new cuentaBancaria("123456789", "Samuel P.", "1000 usd");
        cuentaBancaria.mostrarCuenta();
    }
}