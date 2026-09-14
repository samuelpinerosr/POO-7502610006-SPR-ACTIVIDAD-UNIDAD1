package ParteJ;
class Rectangulo {
    // Atributos
    private double base;
    private double altura;

    // Constructor
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Métodos para calcular
    public double calcularArea() {
        return this.base * this.altura;
    }

    public double calcularPerimetro() {
        return 2 * (this.base + this.altura);
    }

    // Método para mostrar resultados
    public void mostrarResultados() {
        System.out.println("--- Rectángulo (" + this.base + " x " + this.altura + ") ---");
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}

public class Ejercicio51 {
    public static void main(String[] args) {
        // Prueba de la clase Rectangulo
        Rectangulo miRectangulo = new Rectangulo(5.0, 3.0);
        miRectangulo.mostrarResultados();
    }
}