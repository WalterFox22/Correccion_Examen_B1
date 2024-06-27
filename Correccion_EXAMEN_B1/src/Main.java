import Rutas.Ruta;
import Rutas.VIP;
import Rutas.Normal;
import Rutas.Pasajero;

public class Main {
    public static void main(String[] args) {

        // INTEGRANTES: Walter Cobacango, Richard Padilla, Kevin Mendoza

        // AQUI ESTAN VALORES QUEMAODS CON CLINETES Y RUTAS
        Pasajero cliente1 = new Pasajero(" Walter", "Cobacango", "Ponceano", "0979376396", 20, "Normal");
        Pasajero cliente2 = new Pasajero("Kevin", "Mendoza", "Vicentina", "0984168469", 22, "VIP");
        Pasajero cliente3 = new Pasajero("Richard", "Padilla", "Zabala", "0999999956", 20, "VIP");
        Pasajero cliente4 = new Pasajero("Martha", "Cobacango", "Carcelen", "09867543929", 27, "Normal");
        Pasajero cliente5 = new Pasajero("Azucena", "Acero", "Cayambe", "0995122669", 25,"VIP");

        Ruta ruta1 = new Ruta("Quito_Guayaquil", 20);
        Ruta ruta2 = new Ruta("Quito-Tulcán", 17.50);
        Ruta ruta3 = new Ruta("Quito-Puyo", 15);
        Ruta ruta4 = new Ruta("Quito-Riobamba", 17.50);

        Normal normal1 = new Normal("Quito-Guayaquil", 20, "Ventana", 2, 1);
        VIP vip1 = new VIP("Quito-Galápagos", 100, "Primera fila", 3, 2);

        // Valor nulos
        Ruta ruta21 =  new Ruta();
        Pasajero cliente21 = new Pasajero();
        Pasajero cliente22 = new Pasajero();
        Pasajero cliente23 = new Pasajero();
        Pasajero cliente24 = new Pasajero();
        Pasajero cliente25 = new Pasajero();

        // valores settiados
        cliente21.setNombre("Walter");
        cliente21.setApellido("Cobacango");
        cliente21.setDireccion("Ponceano");
        cliente21.setTelefono("0979376396");
        cliente21.setEdad(20);
        cliente21.setTipoPasaje("VIP");
        System.out.println(" ----- CLIENTE 21 CON VALORES SETTEADOS ----- ");
        cliente21.mostrarInfoCliente(20);

        // Asociar rutas a los clientes
        cliente1.setRuta(normal1);
        cliente2.setRuta(vip1);
        cliente3.setRuta(vip1);
        cliente4.setRuta(normal1);
        cliente5.setRuta(normal1);

        // Calcular y mostrar costo total para cada cliente
        double costoCliente1 = normal1.total();
        double costoCliente2 = vip1.total();
        double costoCliente3 = normal1.total();
        double costoCliente4 = vip1.total();
        double costoCliente5 = normal1.total();

        // Mostrar información de cada cliente con su tipo de pasaje y costo total
        System.out.println();
        System.out.println("----- DETALLE DE CADA CLIENTE -----");
        System.out.println();
        System.out.println("----- Cliente 1 -----");
        cliente1.mostrarInfoCliente(costoCliente1);
        System.out.println();

        System.out.println("----- Cliente 2 -----");
        cliente2.mostrarInfoCliente(costoCliente2);
        System.out.println();

        System.out.println("----- Cliente 3 -----");
        cliente3.mostrarInfoCliente(costoCliente3);
        System.out.println();

        System.out.println("----- Cliente 4 -----");
        cliente4.mostrarInfoCliente(costoCliente4);
        System.out.println();

        System.out.println("----- Cliente 5 -----");
        cliente5.mostrarInfoCliente(costoCliente5);
        System.out.println();
    }
}
