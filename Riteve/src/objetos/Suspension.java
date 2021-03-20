package objetos;

public class Suspension {
    private int identificador;
    private String posicion;
    private boolean estado;

    public Suspension(int identificador, boolean estado) {
        this.identificador = identificador;
        this.estado = estado;

        if(identificador==1){
            this.posicion = "delantera";
        }else{
            this.posicion = "trasera";
        }
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getPosicion() {
        return posicion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
