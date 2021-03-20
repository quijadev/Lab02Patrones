package chain.objetos;

public class Asiento {
    private int posicion;
    private boolean cinturon;
    private boolean funcionaCinturon;

    public Asiento(int posicion, boolean cinturon, boolean funcionaCinturon) {
        setPosicion(posicion);
        setCinturon(cinturon);
        setFuncionaCinturon(funcionaCinturon);

    }

    public int getPosicion() {
        return posicion;
    }

    public boolean isCinturon() {
        return cinturon;
    }

    public boolean isFuncionaCinturon() {
        return funcionaCinturon;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public void setCinturon(boolean cinturon) {
        this.cinturon = cinturon;
    }

    public void setFuncionaCinturon(boolean funcionaCinturon) {
        this.funcionaCinturon = funcionaCinturon;
    }
}
