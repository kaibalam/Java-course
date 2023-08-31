public class EjemploAutomovilRelacionesObjetos {
    public static void main(String[] args) {
        Rueda[] ruedasSubaru = new Rueda[10];
        for(int i = 0; i<ruedasSubaru.length; i++){
            ruedasSubaru[i] = new Rueda("yokohama",16,7.5);
        }
        Persona conductorSubaru = new Persona("Lucy", "Martinez");

        Automovil subaro = new Automovil();
        subaro.setFabricante("subaru");
        subaro.setModelo("impreza");
        subaro.setMotor(new Motor(2.0,TipoMotor.BENCINA));
        subaro.setEstanque(new Estanque());
        subaro.setColor(Color.ROJO);
        subaro.setTipo(TipoAutomovil.HATCHBACK);
        //subaro.setRuedas(ruedasSubaru);
        subaro.setConductor(conductorSubaru);
        for(int i = 0; i<ruedasSubaru.length; i++){
            subaro.addRueda(new Rueda("yokohama",16,7.5));
        }

        Rueda[] ruedaMaz = new Rueda[5];

        Persona pato = new Persona("Pato", "Rodríguez");
        Automovil mazda = new Automovil();
        mazda.setFabricante("Mazda");
        mazda.setModelo("BT-50");
        mazda.setMotor(new Motor(3.0, TipoMotor.DIESEL));
        mazda.setEstanque(new Estanque());
        mazda.setColor(Color.ROJO);
        mazda.setTipo(TipoAutomovil.PICKUP);
        //mazda.setRuedas(ruedaMaz);
        for(int i = 0; i<ruedaMaz.length; i++){
            mazda.addRueda(new Rueda("yokohama",18,10.5));
        }


        Rueda[] ruedasNissan = new Rueda[5];
        for (int i = 0; i<ruedasNissan.length; i++){
             ruedasNissan[i] =   new Rueda("Pirelli", 20,11.5);
        }

        Persona bea = new Persona("Bea","Gonzalez");
        Automovil nissan = new Automovil("Nissan","Navara",Color.AZUL,
                new Motor(4.0,TipoMotor.DIESEL),new Estanque(50));
        nissan.setTipo(TipoAutomovil.PICKUP);
        nissan.setConductor(bea);
        nissan.addRueda(new Rueda("Pirelli", 20,11.5))
                .addRueda(new Rueda("Pirelli", 20,11.5))
                .addRueda(new Rueda("Pirelli", 20,11.5))
                .addRueda(new Rueda("Pirelli", 20,11.5))
                .addRueda(new Rueda("Pirelli", 20,11.5));

        Rueda[] ruedasNissan2 = new Rueda[5];
        for (int i = 0; i<ruedasNissan2.length; i++){
            ruedasNissan2[i] =   new Rueda("Pirelli", 20,11.5);
        }
        Persona lalo = new Persona("Lalo", "Mena");
        Automovil nissan2 = new Automovil("Nissan","Navara",Color.AMARILLO,
                new Motor(4.0,TipoMotor.BENCINA),new Estanque(60),lalo,ruedasNissan2);
        Automovil auto = new Automovil();
        nissan2.setTipo(TipoAutomovil.PICKUP);


        Automovil.setColorPatente(Color.VERDE);
        Automovil.setCapacidadEstanqueEstatico(45);

        System.out.println("subaro.verDetalle() = " + subaro.verDetalle());
        System.out.println("mazda = " + mazda.verDetalle());
        System.out.println("nissan2 = " + nissan2.verDetalle());
        System.out.println("nissan.verDetalle() = " + nissan.verDetalle());

        /*System.out.println("Conductor subaru: "+ subaro.getConductor());

        for (Rueda r: subaro.getRuedas()
             ) {
            System.out.println("r.getFabricante() + \", \" + r.getAro()+ \", \" + r.getAncho() = " + r.getFabricante() + ", " + r.getAro()+ ", " + r.getAncho());

        }*/


    }
}
