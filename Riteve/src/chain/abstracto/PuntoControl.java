package chain.abstracto;

import chain.objetos.Reporte;
import chain.objetos.Vehiculo;

public abstract class PuntoControl {
    protected PuntoControl siguiente;

    public void setSiguiente(PuntoControl checkpoint){
        this.siguiente = checkpoint;
    }

    public abstract void ejecutarChequeo(Vehiculo vehiculo, Reporte reporte);
}
