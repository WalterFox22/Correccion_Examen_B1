package Rutas;

public class VIP extends Ruta{
    String Asiento;
    int Espacio_maleta;
    int Espacio_extra;

    public VIP(String nombre, double precio) {
        super(nombre, precio);
    }

    public VIP(String nombre, double precio, String asiento, int espacio_maleta, int espacio_extra) {
        super(nombre, precio);
        Asiento = asiento;
        Espacio_maleta = espacio_maleta;
        Espacio_extra = espacio_extra;
    }

    public String getAsiento() {
        return Asiento;
    }

    public void setAsiento(String asiento) {
        Asiento = asiento;
    }

    public int getEspacio_maleta() {
        return Espacio_maleta;
    }

    public void setEspacio_maleta(int espacio_maleta) {
        Espacio_maleta = espacio_maleta;
    }

    public int getEspacio_extra() {
        return Espacio_extra;
    }
    public void setEspacio_extra(int espacio_extra) {
        Espacio_extra = espacio_extra;
    }


    public  double Vip_adicional(){
        double extra= precio*(30/100);
        return (extra+precio);
    }
    public double precio_extra() {
        return (Espacio_extra * 1.50);
    }
    public double total(){
        double Total= Vip_adicional()+precio_extra();
        return (Total+precio);
    }

    @Override
    public void mostrar_datos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Precio: "+ precio);
        System.out.println("Asiento: "+Asiento);
        System.out.println("Espacio maleta: "+Espacio_maleta);
        System.out.println("Espacio extra: "+Espacio_extra);
        System.out.println("Total: "+total());
    }
}
