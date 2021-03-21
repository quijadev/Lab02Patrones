package chain.objetos;

import java.util.ArrayList;

public class Vehiculo {
    private int emisiones;
    private int decibelios;
    private String placa;
    private ArrayList<Luz> luces;
    private ArrayList <Asiento> asientos;

    public Vehiculo(int emisiones, int decibelios, String placa) {
        this.emisiones = emisiones;
        this.decibelios = decibelios;
        this.placa = placa;
        luces = new ArrayList<>();
        asientos = new ArrayList<>();
    }

    public int getEmisiones() {
        return emisiones;
    }

    public int getDecibelios() {
        return decibelios;
    }

    public String getPlaca() {
        return placa;
    }

    public void setEmisiones(int emisiones) {
        this.emisiones = emisiones;
    }

    public void setDecibelios(int decibelios) {
        this.decibelios = decibelios;
    }

    public void addLuz(int id, String posicion, String lado, String estado, String tipo) {
        luces.add(new Luz(id, posicion, lado, estado, tipo));
    }

    public void addAsiento(int posicion, boolean tiene_cinturon, boolean funciona_cinturon) {
        asientos.add(new Asiento( posicion,  tiene_cinturon,  funciona_cinturon));
    }

    public String getLuces() {
        String dataLuces = "";
        for (Luz luz : this.luces) dataLuces += luz.getData() + "\n";

        return dataLuces;
    }

    public ArrayList<Luz> getArrLuces() {
        return luces;
    }

    public ArrayList<Asiento> getArrAsientos(){
        return asientos;
    }


}
