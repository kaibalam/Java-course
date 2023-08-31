public class EjemploAutomovilEnum {
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
        mazda.setEstanque(new Estanque());
        mazda.setColor(Color.ROJO);
        mazda.setTipo(TipoAutomovil.PICKUP);

        TipoAutomovil tipo = subaro.getTipo();

        System.out.println("tipoSubaru.getNombre() = " + tipo.getNombre());
        System.out.println("tipoDesct.getNombre() = " + tipo.getDescripcion());



        tipo = mazda.getTipo();
        System.out.println("tipo = " + tipo);
  /*      switch (tipo){
            case CONVERTIBLE:
                System.out.println("El automovil es deportivo y descapotable de dos puertas");
                break;
            case COUPE:
                System.out.println("Es un automovil de dos puertas y tipicamente deportivo");
                break;
            case FURGON:
                System.out.println("Es un automovil utilitario de transporte, de empresa");
                break;
            case HATCHBACK:
                System.out.println("Es un automovil mediano compacto, aspecto deportivo");
                break;
            case PICKUP:
                System.out.println("Es un automovil de doble cabina o camioneta");
                break;
            case SEDAN:
                System.out.println("Es un automovil mediano comun y corriente");
                break;
            case STATION_WAGON:
                System.out.println("Es un automovil más grande, con maleta grande");
                break;
        }*/
        switch (tipo){
            case CONVERTIBLE -> System.out.println("El automovil es deportivo y descapotable de dos puertas");
            case COUPE -> System.out.println("Es un automovil de dos puertas y tipicamente deportivo");
            case FURGON -> System.out.println("Es un automovil utilitario de transporte, de empresa");
            case HATCHBACK -> System.out.println("Es un automovil mediano compacto, aspecto deportivo");
            case PICKUP -> System.out.println("Es un automovil de doble cabina o camioneta");
            case SEDAN -> System.out.println("Es un automovil mediano comun y corriente");
            case STATION_WAGON -> System.out.println("Es un automovil más grande, con maleta grande");
        }

        TipoAutomovil [] tipos = TipoAutomovil.values();

        for (TipoAutomovil ta: tipos
             ) {
            System.out.print(ta + " => " + ta.name() + ", " +
             ta.getNombre() + ", " +
                    ta.getDescripcion() + ", " +
                    ta.getNumeroPuertas());
            System.out.println();
            
        }



    }
}
