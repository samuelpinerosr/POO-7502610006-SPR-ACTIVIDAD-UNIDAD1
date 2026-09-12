package ParteA;

class Vehiculo {
    //marca, modelo, velocidad Actual
    String marca;
    String modelo;
    String velocidadActual;

    Vehiculo(String marca, String modelo, String velocidadActual) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadActual = velocidadActual;
    }
    void mostrarEstado(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("velocidad actual: " + this.velocidadActual);
    }

}
public class ejercicio2 {
    public static void main(String[] args){
        Vehiculo vehiculo = new Vehiculo("Porsche","Cayenne","100km/h");
        vehiculo.mostrarEstado();
    }
}