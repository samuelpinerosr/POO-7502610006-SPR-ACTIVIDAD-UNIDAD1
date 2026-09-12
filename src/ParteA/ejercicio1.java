package ParteA;

class Estudiante {
        // Atributos
        String nombre;
        String codigo;
        String semestre;

        // Constructor
        Estudiante(String nombre, String codigo, String semestre) {
            this.nombre = nombre;
            this.codigo = codigo;
            this.semestre = semestre;
        }

        void mostrarInfo() {
            System.out.println("Nombre: " + this.nombre);
            System.out.println("Código: " + this.codigo);
            System.out.println("Semestre: " + this.semestre);
        }
    }

    public class ejercicio1 {
        public static void main(String[] args) {
            Estudiante estudiante = new Estudiante("Samuel", "750251006", "Segundo");
            estudiante.mostrarInfo();
        }
    }

