package principal;

import objetos.Vehiculo;

import java.util.ArrayList;

public class GestorVehiculo {
    private ArrayList<Vehiculo> carros;

    public GestorVehiculo() {
        carros = new ArrayList <Vehiculo>();
    }

    public void nuevoVehiculo(int emisiones, int decibelios) {
        carros.add(new Vehiculo(emisiones, decibelios));
    }

    public void agregarLuces(int pId_Vehiculo, int iD, String posicion, String lado, String estado, String tipo) {
        carros.get(pId_Vehiculo).addLuz(iD, posicion, lado, estado, tipo);
    }

    public void agregarAsientos(int pId_Vehiculo, int posicion, boolean tiene_cinturon, boolean funciona_cinturon) {
        carros.get(pId_Vehiculo).addAsiento(posicion, tiene_cinturon, funciona_cinturon);
    }

    public void agregarSuspensiones(int pId_Vehiculo, int identificador, boolean pEstado) {
        carros.get(pId_Vehiculo).addSuspension(identificador, pEstado);
    }

    public int getAmountVehiculos() {
        return carros.size();
    }

    public String getVehiculoData(int pID) {
        String message = "El estado del vehiculo # " + pID + " es=\n";
        message += "valor de emisiones: " + carros.get(pID).getEmisiones() + " \n";
        message += "valor de decibelios: " + carros.get(pID).getDecibelios() + " \n";
        message += "valor de las luces:\n" + carros.get(pID).getLuces() + " \n";


        return message;
    }
}
