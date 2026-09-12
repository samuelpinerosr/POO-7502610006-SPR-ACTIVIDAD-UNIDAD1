package ParteD;
class Celular {
    String marca;
    String modelo;
    int bateria;

    Celular(String marca, String modelo, int bateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }

    void mostrarInfo() {
        System.out.println("Celular: " + marca + " " + modelo + " | Batería: " + bateria + "%");
    }
}
public class Ejercicio20 {
    public static void main(String[] args) {

        Celular cel1 = new Celular("Apple", "iPhone 15", 85);
        Celular cel2 = new Celular("Samsung", "Galaxy S24", 15);
        Celular cel3 = new Celular("Xiaomi", "Redmi Note 13", 100);

        cel1.mostrarInfo();
        cel2.mostrarInfo();
        cel3.mostrarInfo();

        System.out.println("\nTodos los objetos anteriores tienen en comun que son aparatos tecnologicos, celulares y cada uno");
        System.out.println("tiene una marca propia.");
        System.out.println("se diferencian en que cada celular tiene una marca diferente, tienen nombres diferentes y todos tienen");
        System.out.println("un porcentaje de bateria diferente.");
    }
}

