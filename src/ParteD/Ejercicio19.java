package ParteD;
// 'Estudiante' es una CLASE porque actúa únicamente como la plantilla o molde.
// Define la estructura (atributos nombre y semestre) que tendrán todos los estudiantes,
// pero por sí misma no ocupa espacio en memoria para guardar datos específicos.
class Estudiante {
    String nombre;
    int semestre;

    Estudiante(String nombre, int semestre) {
        this.nombre = nombre;
        this.semestre = semestre;
    }
}
public class Ejercicio19 {
    public static void main(String[] args) {
        // 'est1' es un OBJETO porque es una instancia concreta creada en memoria (Heap)
        // que representa a un estudiante real con sus propios datos ("Carlos", 3º semestre).
        Estudiante est1 = new Estudiante("Carlos", 3);

        System.out.println("Estudiante: " + est1.nombre + " | Semestre: " + est1.semestre);
    }
}

