package chain.concreto;

import chain.abstracto.PuntoControl;
import chain.objetos.Reporte;
import chain.objetos.Vehiculo;

public class ControlDecibelios extends PuntoControl {
    @Override
    public void ejecutarChequeo(Vehiculo vehiculo, Reporte reporte) {
        String msj="Observaciones sobre ruido:\n";
        if(vehiculo.getDecibelios()<=70){
            msj+="El vehículo no excede los 70 decibelios permitidos.\n";
        }else{
            msj+="El vehículo excede los 70 decibelios permitidos.\n";
        }

        System.out.println(msj);
        reporte.setResultadoDecibelios(msj);

        siguiente.ejecutarChequeo(vehiculo,reporte);
    }
}
