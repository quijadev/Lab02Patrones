package principal;

public class Main {

    static Gestor gestor;

    public static void main(String[] args) {
        int vehId, decibeles = 30, emision = 2;

        //CREACION DE VEHICULOS

        gestor = new Gestor();

        //Crea un nuevo vehiculo
        gestor.nuevoVehiculo(emision, decibeles,"CL212763");
        vehId = gestor.getAmountVehiculos() - 1;

        //Agrega los 5 asientos.
        gestor.agregarAsientos(vehId, 1, false, false);
        gestor.agregarAsientos(vehId, 2, true, false);
        gestor.agregarAsientos(vehId, 3, true, true);
        gestor.agregarAsientos(vehId, 4, true, false);
        gestor.agregarAsientos(vehId, 5, false, false);

        //Agrega las 7 luces
        gestor.agregarLuces(vehId, 1, "Trasera", "Derecho", "Bueno", "Freno");
        gestor.agregarLuces(vehId, 2, "Trasera", "Izquierdo", "Medio", "Freno");
        gestor.agregarLuces(vehId, 3, "Delantera", "Derecho", "Bueno", "Normal");
        gestor.agregarLuces(vehId, 4, "Delantera", "Izquierdo", "Malo", "Normal");
        gestor.agregarLuces(vehId, 5, "Delantera", "Derecho", "Bueno", "Alta");
        gestor.agregarLuces(vehId, 6, "Delantera", "Izquierdo", "Malo", "Alta");
        gestor.agregarLuces(vehId, 7, "Trasera", "Izquierdo", "Bueno", "Retroceso");
        gestor.agregarLuces(vehId, 7, "Trasera", "Derecho", "Bueno", "Retroceso");

        //Crea un nuevo vehiculo
        gestor.nuevoVehiculo(4, 80,"THC420");
        vehId = gestor.getAmountVehiculos() - 1;

        //Agrega los 5 asientos.
        gestor.agregarAsientos(vehId, 1, true, true);
        gestor.agregarAsientos(vehId, 2, true, true);
        gestor.agregarAsientos(vehId, 3, false, false);
        gestor.agregarAsientos(vehId, 4, false, false);

        //Agrega las 7 luces
        gestor.agregarLuces(vehId, 1, "Trasera", "Derecho", "Malo", "Freno");
        gestor.agregarLuces(vehId, 2, "Trasera", "Izquierdo", "Medio", "Freno");
        gestor.agregarLuces(vehId, 3, "Delantera", "Derecho", "Bueno", "Normal");
        gestor.agregarLuces(vehId, 4, "Delantera", "Izquierdo", "Bueno", "Normal");
        gestor.agregarLuces(vehId, 5, "Delantera", "Derecho", "Medio", "Alta");
        gestor.agregarLuces(vehId, 6, "Delantera", "Izquierdo", "Medio", "Alta");
        gestor.agregarLuces(vehId, 7, "Trasera", "Izquierdo", "Bueno", "Retroceso");
        gestor.agregarLuces(vehId, 7, "Trasera", "Derecho", "Bueno", "Retroceso");


        //EJECUCION DE CADENA

        gestor.iniciarProceso();
        gestor.ejecutarRevision();
        gestor.imprimirReportes();

    }
}
