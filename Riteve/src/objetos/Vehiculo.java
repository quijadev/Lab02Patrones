package objetos;

import java.util.ArrayList;

public class Vehiculo {
    private int emisiones;
    private int decibelios;
    private ArrayList<Luz> luces;
    private ArrayList <Asiento> asientos;
    private ArrayList <Suspension> suspensiones;

    public Vehiculo(int emisiones, int decibelios) {
        this.emisiones = emisiones;
        this.decibelios = decibelios;
        luces = new ArrayList<>();
        asientos = new ArrayList<>();
        suspensiones = new ArrayList<>();
    }

    public int getEmisiones() {
        return emisiones;
    }

    public int getDecibelios() {
        return decibelios;
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

    public void addSuspension(int identificador, boolean pEstado) {
        suspensiones.add(new Suspension( identificador,  pEstado));
    }

    public String getLuces() {
        String dataLuces = "";
        for (Luz luz : this.luces) dataLuces += luz.getData() + "\n";

        return dataLuces;
    }


}
