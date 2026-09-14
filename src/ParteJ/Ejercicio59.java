package ParteJ;
class UsuarioSistema {
    // Atributos
    private String nombreUsuario;
    private String clave;
    private boolean activo;

    // Constructor
    public UsuarioSistema(String nombreUsuario, String clave) {
        this.nombreUsuario = nombreUsuario;
        this.clave = clave;
        this.activo = true; // Por defecto el usuario se crea activo
    }

    // Métodos para cambiar el estado de la cuenta
    public void activar() {
        this.activo = true;
        System.out.println("Usuario " + this.nombreUsuario + " activado correctamente.");
    }

    public void desactivar() {
        this.activo = false;
        System.out.println("Usuario " + this.nombreUsuario + " desactivado.");
    }

    // Método para mostrar el estado actual
    public void mostrarEstado() {
        String estado = this.activo ? "Activo" : "Inactivo";
        System.out.println("Usuario: " + this.nombreUsuario + " | Estado del sistema: " + estado);
    }
}

public class Ejercicio59 {
    public static void main(String[] args) {
        // Prueba de la clase UsuarioSistema
        UsuarioSistema usuario = new UsuarioSistema("admin_dev", "Secret123");

        usuario.mostrarEstado();
        usuario.desactivar();
        usuario.mostrarEstado();
        usuario.activar();
        usuario.mostrarEstado();
    }
}