import java.util.Scanner;

public class EjemploAutomovilStatic {
    public static void main(String[] args) {
        Automovil subaro = new Automovil();

        subaro.setFabricante("subaru");
        subaro.setModelo("impreza");
        subaro.setMotor(new Motor(2.0,TipoMotor.BENCINA));
        subaro.setEstanque(new Estanque());
        subaro.setColor(Color.ROJO);
        subaro.setTipo(TipoAutomovil.HATCHBACK);

        Automovil mazda = new Automovil();

        mazda.setFabricante("Mazda");
        mazda.setModelo("BT-50");
        mazda.setMotor(new Motor(3.0, TipoMotor.DIESEL));

        mazda.setColor(Color.ROJO);
        mazda.setTipo(TipoAutomovil.PICKUP);


        Automovil nissan = new Automovil("Nissan","Navara",Color.AZUL,
                new Motor(4.0,TipoMotor.DIESEL),new Estanque(50));
        nissan.setTipo(TipoAutomovil.PICKUP);


        Automovil nissan2 = new Automovil("Nissan","Navara",Color.AMARILLO,
                new Motor(4.0,TipoMotor.BENCINA),new Estanque(60));
        Automovil auto = new Automovil();
        nissan2.setTipo(TipoAutomovil.PICKUP);


        Automovil.setColorPatente(Color.VERDE);
        Automovil.setCapacidadEstanqueEstatico(45);

        System.out.println("subaro.verDetalle() = " + subaro.verDetalle());
        System.out.println("mazda = " + mazda.verDetalle());
        System.out.println("nissan2 = " + nissan2.verDetalle());
        System.out.println("nissan.verDetalle() = " + nissan.verDetalle());
        System.out.println("Color enum"+ Automovil.getColorPatente());

        System.out.println("Automovil.calcularConsumoEstatico(300, 60) = " + Automovil.calcularConsumoEstatico(300, 60));

        System.out.println("Automovil.VELOCIDAD_MAXIMA_CARRETERA = " + Automovil.VELOCIDAD_MAXIMA_CARRETERA);

        System.out.println("Automovil.VELOCIDAD_MAXIMA_CIUDAD = " + Automovil.VELOCIDAD_MAXIMA_CIUDAD);

        TipoAutomovil tipoSubaru = subaro.getTipo();

        System.out.println("tipoSubaru.getNombre() = " + tipoSubaru.getNombre());
        System.out.println("tipoDesct.getNombre() = " + tipoSubaru.getDescripcion());

        System.out.println("mazda = " + mazda.calcularConsumo(300,70));


    }
}
