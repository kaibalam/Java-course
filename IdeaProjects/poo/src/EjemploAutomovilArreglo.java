import java.util.Arrays;

public class EjemploAutomovilArreglo {
    public static void main(String[] args) {


        Persona conductorSubaru = new Persona("Lucy", "Martinez");

        Automovil subaro = new Automovil();
        subaro.setFabricante("subaru");
        subaro.setModelo("impreza");
        subaro.setMotor(new Motor(2.0,TipoMotor.BENCINA));
        subaro.setEstanque(new Estanque());
        subaro.setColor(Color.ROJO);
        subaro.setTipo(TipoAutomovil.HATCHBACK);
        subaro.setConductor(conductorSubaru);

        Persona pato = new Persona("Pato", "Rodríguez");
        Automovil mazda = new Automovil();
        mazda.setFabricante("Mazda");
        mazda.setModelo("BT-50");
        mazda.setMotor(new Motor(3.0, TipoMotor.DIESEL));
        mazda.setEstanque(new Estanque());
        mazda.setColor(Color.ROJO);
        mazda.setTipo(TipoAutomovil.PICKUP);

        Persona bea = new Persona("Bea","Gonzalez");
        Automovil nissan = new Automovil("Nissan","Navara",Color.AZUL,
                new Motor(4.0,TipoMotor.DIESEL),new Estanque(50));
        nissan.setTipo(TipoAutomovil.PICKUP)    ;
        nissan.setConductor(bea);



        Persona lalo = new Persona("Lalo", "Mena");
        Automovil suzuki = new Automovil("Suzuki","Vitara",Color.AMARILLO,
                new Motor(1.6,TipoMotor.BENCINA),new Estanque(60),lalo,null);

        suzuki.setConductor(lalo);
        suzuki.setColor(Color.AMARILLO);
        suzuki.setTipo(TipoAutomovil.SUV);
        Automovil.setColorPatente(Color.AZUL);

        Automovil audi = new Automovil("Audi","A3");
        audi.setConductor(new Persona("Jano","Pére<"));


        Automovil[] autos = new Automovil[5];
        autos[0] = subaro;
        autos[1] = mazda;
        autos[2] = nissan;
        autos[3] = suzuki;
        autos[4] = audi;

        Arrays.sort(autos);
        for (Automovil auto : autos) {
            System.out.println(auto);
        }




    }
}
