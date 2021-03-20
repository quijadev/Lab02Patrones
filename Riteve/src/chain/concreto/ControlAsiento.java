package chain.concreto;

import chain.abstracto.PuntoControl;
import chain.objetos.Asiento;
import chain.objetos.Vehiculo;
import chain.objetos.Reporte;

import java.util.ArrayList;

public class ControlAsiento extends PuntoControl {

    @Override
    public void ejecutarChequeo(Vehiculo vehiculo, Reporte reporte) {
        ArrayList<Asiento> asientos = vehiculo.getArrAsientos();
        String msj="Observaciones sobre asientos: \n\n";

        for(Asiento asiento:asientos){
            if(!asiento.isCinturon() || !asiento.isFuncionaCinturon()){ //si no tiene cinturon o no sirve
                if(!asiento.isCinturon()){ //si no tiene
                    msj+="Asiento "+asiento.getPosicion()+" no tiene cinturón. \n";
                }else{ //si no sirve
                    msj+="Cinturón del asiento "+asiento.getPosicion()+" no funciona. \n";
                }
            }else{
                msj+="Cinturón del asiento "+asiento.getPosicion()+" normal. \n";
            }
        }
        msj+="\n";
        System.out.println(msj);
        reporte.setResultadoAsientos(msj);

        siguiente.ejecutarChequeo(vehiculo,reporte);
    }
}
