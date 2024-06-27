package Rutas;

public class Pasajero {
    String nombre;
    String apellido;
    String direccion;
    String telefono;
    int edad;
    String tipoPasaje;
    Ruta ruta;

    public Pasajero() {

    }

    public Pasajero(String nombre, String apellido, String direccion, String telefono, int edad, String tipoPasaje) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.edad = edad;
        this.tipoPasaje = tipoPasaje;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipoPasaje() {
        return tipoPasaje;
    }

    public void setTipoPasaje(String tipoPasaje) {
        this.tipoPasaje = tipoPasaje;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    // Método para mostrar la información del cliente con el tipo de pasaje y el costo total
    public void mostrarInfoCliente(double costoTotal) {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Edad: " + edad);
        System.out.println("Tipo de pasaje: " + tipoPasaje);
        System.out.println("Costo total: " + costoTotal);

        if (ruta != null){
            ruta.mostrar_datos();
        }
    }
}
