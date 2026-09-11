package ParteB;

class producto{
    String categoria;
    String precio;
    String garantia;

    producto(String categoria, String precio, String garantia) {
        this.categoria = categoria;
        this.precio = precio;
        this.garantia = garantia;
    }
    void mostrarproducto(){
        System.out.println("Categoria: " + this.categoria);
        System.out.println("Precio: " + this.precio);
        System.out.println("Garantia: " + this.garantia);
    }
}
public class Ejercicio8{
    public static void main(String[] args){
        producto producto1 = new producto ("Tecnologia", "5M", "1 año");
        producto producto2 = new producto("Tecnologia", "800k", "2 meses");

        System.out.println("IPHONE 13 PRO");
        producto1.mostrarproducto();
        System.out.println("\n--------------------------------------");
        System.out.println("\nAUDIFONOS INALAMBRICOS JBL");
        producto2.mostrarproducto();
    }
}
