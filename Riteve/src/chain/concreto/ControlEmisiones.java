package chain.concreto;

import chain.abstracto.PuntoControl;
import chain.objetos.Reporte;
import chain.objetos.Vehiculo;

public class ControlEmisiones extends PuntoControl {

    public ControlEmisiones() {
        this.siguiente=null;
    }

    @Override
    public void ejecutarChequeo(Vehiculo vehiculo, Reporte reporte) {
        String msj="\nObservaciones sobre emisiones:\n";
        if(vehiculo.getEmisiones()<=3){
            msj+="Emisiones normales.\n\n";
        }else{
            msj+="Emisiones exceden el rango permitido.\n\n";
        }


        System.out.println(msj);
        reporte.setResultadoEmisiones(msj);
    }
}
