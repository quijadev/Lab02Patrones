package principal;

import chain.abstracto.PuntoControl;
import chain.concreto.ControlAsiento;
import chain.concreto.ControlDecibelios;
import chain.concreto.ControlEmisiones;
import chain.concreto.ControlLuces;
import chain.objetos.Reporte;
import chain.objetos.Vehiculo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Gestor {
    private ArrayList<Vehiculo> carros;
    private ArrayList<Reporte> reportes;
    private PuntoControl checkpoint;

    public Gestor() {
        carros = new ArrayList <>();
        reportes = new ArrayList<>();
    }

    //Vehiculos

    public void nuevoVehiculo(int emisiones, int decibelios, String placa) {
        carros.add(new Vehiculo(emisiones, decibelios,placa));
    }

    public void agregarLuces(int pId_Vehiculo, int iD, String posicion, String lado, String estado, String tipo) {
        carros.get(pId_Vehiculo).addLuz(iD, posicion, lado, estado, tipo);
    }

    public void agregarAsientos(int pId_Vehiculo, int posicion, boolean tiene_cinturon, boolean funciona_cinturon) {
        carros.get(pId_Vehiculo).addAsiento(posicion, tiene_cinturon, funciona_cinturon);
    }

    public int getAmountVehiculos() {
        return carros.size();
    }

    public String getVehiculoData(int pID) {
        String message = "El estado del vehiculo # " + pID + " es=\n";
        message += "valor de emisiones: " + carros.get(pID).getEmisiones() + " \n";
        message += "valor de decibelios: " + carros.get(pID).getDecibelios() + " \n";
        message += "valor de las luces:\n" + carros.get(pID).getLuces() + " \n";


        return message;
    }

    //Cadena

    private PuntoControl configurarCadena(){
        PuntoControl controlAsiento = new ControlAsiento();
        PuntoControl controlLuces = new ControlLuces();
        PuntoControl controlEmisiones = new ControlEmisiones();
        PuntoControl controlDecibelios = new ControlDecibelios();

        controlAsiento.setSiguiente(controlLuces);
        controlLuces.setSiguiente(controlDecibelios);
        controlDecibelios.setSiguiente(controlEmisiones);
        return controlAsiento;
    }

    public void iniciarProceso() {
        checkpoint=configurarCadena();
    }

    public void ejecutarRevision() {
        int cont=1;
        for(Vehiculo carro:carros){
            Reporte reporte = new Reporte(carro);
            reportes.add(reporte);
            System.out.println("Iniciando revisión del vehículo en la posición #"+cont+".\n");
            checkpoint.ejecutarChequeo(carro,reporte);
            cont++;
        }
    }

    public void imprimirReportes() {
        System.out.println("Resultado de revisiones técnicas vehiculares "+ LocalDate.now()+":");
        String msj="";
        for(Reporte reporte:reportes){
            msj+=reporte.getReporte();
        }
        System.out.println(msj);
    }
}
