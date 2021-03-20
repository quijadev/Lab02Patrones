package principal;

public class Main {

    static GestorVehiculo gestor;

    public static void main(String[] args) {
        int vehId, decibeles = 30, emision = 2;
        gestor = new GestorVehiculo();

        //Crea un nuevo vehiculo
        gestor.nuevoVehiculo(emision, decibeles);
        vehId = gestor.getAmountVehiculos() - 1;

        //Agrega los 5 asientos.
        gestor.agregarAsientos(vehId, 1, false, false);
        gestor.agregarAsientos(vehId, 2, true, false);
        gestor.agregarAsientos(vehId, 3, true, true);
        gestor.agregarAsientos(vehId, 4, true, false);
        gestor.agregarAsientos(vehId, 5, false, false);

        //Agrega las 7 luces
        gestor.agregarLuces(vehId, 1, "Trasero", "Derecho", "Bueno", "Freno");
        gestor.agregarLuces(vehId, 2, "Trasero", "Izquierdo", "Bueno", "Freno");
        gestor.agregarLuces(vehId, 3, "Delantero", "Derecho", "Bueno", "Normal");
        gestor.agregarLuces(vehId, 4, "Delantero", "Izquierdo", "Bueno", "Normal");
        gestor.agregarLuces(vehId, 5, "Delantero", "Derecho", "Bueno", "Alta");
        gestor.agregarLuces(vehId, 6, "Delantero", "Izquierdo", "Bueno", "Alta");
        gestor.agregarLuces(vehId, 7, "Trasero", "Izquierdo", "Bueno", "Retroceso");

        //Agrega la suspension
        gestor.agregarSuspensiones(vehId, 1, false);
        gestor.agregarSuspensiones(vehId, 1, true);

        System.out.println(gestor.getVehiculoData(vehId));
    }
}
