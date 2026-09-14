package ParteJ;
class NotaAcademica {
    // Atributos
    private String asignatura;
    private double nota1;
    private double nota2;
    private double nota3;

    // Constructor
    public NotaAcademica(String asignatura, double nota1, double nota2, double nota3) {
        this.asignatura = asignatura;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    // Método para calcular la definitiva (promedio simple)
    public double calcularDefinitiva() {
        return (this.nota1 + this.nota2 + this.nota3) / 3.0;
    }

    // Método para mostrar el reporte completo
    public void mostrarReporte() {
        System.out.println("--- Reporte Académico: " + this.asignatura + " ---");
        System.out.println("Notas: " + this.nota1 + " | " + this.nota2 + " | " + this.nota3);
        System.out.printf("Definitiva: %.2f%n", calcularDefinitiva());
    }
}

public class Ejercicio57 {
    public static void main(String[] args) {
        // Prueba de la clase NotaAcademica
        NotaAcademica materia = new NotaAcademica("Programación Orientada a Objetos", 4.5, 3.8, 4.2);

        materia.mostrarReporte();
    }
}