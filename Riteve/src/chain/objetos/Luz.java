package chain.objetos;

public class Luz {
    private int id;
    private String posicion;
    private String lado;
    private String estado;
    private String tipo;

    public Luz(int id, String posicion, String lado, String estado, String tipo) {
        this.id = id;
        this.posicion = posicion;
        this.lado = lado;
        this.estado = estado;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public String getPosicion() {
        return posicion;
    }

    public String getLado() {
        return lado;
    }

    public String getEstado() {
        return estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void setLado(String lado) {
        this.lado = lado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getData() {
        return "La luz # " + this.getId() + " que se encuentran en el sector " + this.getPosicion().toLowerCase() + " "
                + this.getLado().toLowerCase()+"["+ this.getTipo() + "]. Esta en un "+ this.getEstado().toLowerCase()+" estado.";
    }
}
