package chain.objetos;

public class Reporte {
    private String resultadoAsientos;
    private String resultadoLuces;
    private String resultadoEmisiones;
    private String resultadoDecibelios;
    private Vehiculo carro;

    public Reporte(Vehiculo carro) {
        this.carro = carro;
    }

    //SETS

    public void setResultadoAsientos(String resultadoAsientos) {
        this.resultadoAsientos = resultadoAsientos;
    }

    public void setResultadoLuces(String resultadoLuces) {
        this.resultadoLuces = resultadoLuces;
    }

    public void setResultadoEmisiones(String resultadoEmisiones) {
        this.resultadoEmisiones = resultadoEmisiones;
    }

    public void setResultadoDecibelios(String resultadoDecibelios) {
        this.resultadoDecibelios = resultadoDecibelios;
    }

    public void setCarro(Vehiculo carro) {
        this.carro = carro;
    }


    //GETS

    public String getResultadoAsientos() {
        return resultadoAsientos;
    }

    public String getResultadoLuces() {
        return resultadoLuces;
    }

    public String getResultadoEmisiones() {
        return resultadoEmisiones;
    }

    public String getResultadoDecibelios() {
        return resultadoDecibelios;
    }

    public Vehiculo getCarro() {
        return carro;
    }


    //METODOS

    public String getReporte() {
        String msj="";

        return msj;
    }
}
