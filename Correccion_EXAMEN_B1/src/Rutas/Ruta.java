package Rutas;

public class Ruta {
    String nombre;
    double precio;

    public Ruta() {
    }

    public Ruta(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void mostrar_datos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Precio: "+precio);
    }
}
