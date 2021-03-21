package chain.concreto;

import chain.abstracto.PuntoControl;
import chain.objetos.Luz;
import chain.objetos.Reporte;
import chain.objetos.Vehiculo;

import java.util.ArrayList;

public class ControlLuces extends PuntoControl {

    @Override
    public void ejecutarChequeo(Vehiculo vehiculo, Reporte reporte) {
        ArrayList<Luz> luces = vehiculo.getArrLuces();
        String msj="Observaciones sobre luces: \n\n";
        String msjNormal="";
        String msjBueno="";
        String msjMalo="";
        int faltasLeves=0;
        int faltasGraves=0;

        for(Luz luz:luces) {
            if(luz.getEstado()=="Bueno") {
                msjBueno+="Luz "+luz.getPosicion().toLowerCase()+" de tipo "+luz.getTipo().toLowerCase()+" del lado "+luz.getLado().toLowerCase()+" en buen estado.\n";
            }else if (luz.getEstado()=="Medio") {
                msjNormal+="Luz "+luz.getPosicion().toLowerCase()+" de tipo "+luz.getTipo().toLowerCase()+" del lado "+luz.getLado().toLowerCase()+" en estado medio. Falta leve.\n";
                faltasLeves++;
            }else{
                msjMalo+="Luz "+luz.getPosicion().toLowerCase()+" de tipo "+luz.getTipo().toLowerCase()+" del lado "+luz.getLado().toLowerCase()+" en mal estado. Falta grave.\n";
                faltasGraves++;
            }
        }

        msj+=msjMalo+msjNormal+msjBueno+"\nFaltas leves: "+faltasLeves+".\nFaltas graves: "+faltasGraves+". \n\n";
        System.out.println(msj);
        reporte.setResultadoLuces(msj);

        siguiente.ejecutarChequeo(vehiculo,reporte);
    }
}
