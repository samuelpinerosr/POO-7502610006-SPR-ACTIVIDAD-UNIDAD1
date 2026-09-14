package ParteJ;
class FacturaSimple {
    // Atributos
    private int numero;
    private String cliente;
    private double valor;

    // Constructor
    public FacturaSimple(int numero, String cliente, double valor) {
        this.numero = numero;
        this.cliente = cliente;
        this.valor = valor;
    }

    // Método para aplicar el descuento del 10%
    public void aplicarDescuento() {
        this.valor -= this.valor * 0.10;
        System.out.println("Se ha aplicado un 10% de descuento a la factura.");
    }

    // Método para mostrar los datos de la factura
    public void mostrarFactura() {
        System.out.println("--- Factura #" + this.numero + " ---");
        System.out.println("Cliente: " + this.cliente);
        System.out.println("Valor total: $" + this.valor);
    }
}

public class Ejercicio52 {
    public static void main(String[] args) {
        // Prueba de la clase FacturaSimple
        FacturaSimple miFactura = new FacturaSimple(1001, "Carlos Mendoza", 200000.0);

        miFactura.mostrarFactura();
        miFactura.aplicarDescuento();
        miFactura.mostrarFactura();
    }
}