package ParteA;

class Mascota {
    String nombre;
    String especie;
    String edad;

    Mascota(String nombre, String especie, String edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    void mostrarMascota() {
        System.out.println("Nombre de la mascota: " + this.nombre);
        System.out.println("Especie de la mascota: " + this.especie);
        System.out.println("Edad de la mascota: " + this.edad);
    }
}
    public class Ejercicio5 {
        public static void main(String[] args){
            Mascota mascota = new Mascota("Conny","Perro","10 años");
            mascota.mostrarMascota();
        }
}
