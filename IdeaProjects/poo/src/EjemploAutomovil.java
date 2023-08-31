public class EjemploAutomovil {
    public static void main(String[] args) {
        Automovil subaro = new Automovil();

        subaro.setFabricante("subaru");
        subaro.setModelo("impreza");
        subaro.setMotor(new Motor(2.0,TipoMotor.BENCINA));
        subaro.setEstanque(new Estanque());
        subaro.setColor(Color.BLANCO);

        Automovil mazda = new Automovil();

        mazda.setFabricante("Mazda");
        mazda.setModelo("BT-50");
        mazda.setMotor(new Motor(3.0,TipoMotor.DIESEL));
        mazda.setEstanque(new Estanque());
        mazda.setColor(Color.ROJO);

        Automovil nissan = new Automovil("Nissan","Navara",Color.AZUL,
                new Motor(3.0,TipoMotor.DIESEL),new Estanque(50));
        Automovil nissan2 = new Automovil("Nissan","Navara",Color.AMARILLO,
                new Motor(3.0,TipoMotor.BENCINA),new Estanque(60));
        Automovil auto = new Automovil();

        System.out.println("nissan2 = " + nissan2);
        System.out.println("nissan2 = " + nissan2.toString());


        System.out.println("con igual" +  (nissan == nissan2));
        System.out.println("con equals por valor " +    nissan.equals(nissan2));
        System.out.println("auto.equals(nissan) = " + auto.equals(nissan));

        System.out.println("nissan.verDetalle() = " + nissan.verDetalle());
        System.out.println("\nmazda = " + mazda.verDetalle());
        System.out.println("\nsubaro.detalle() = " + subaro.verDetalle());

        subaro.acelerar(3000);
        subaro.frenar();
        System.out.println("\nKilometros por litro : "+ subaro.calcularConsumo(300,0.6F));
        System.out.println("Kilometros por litro : "+ subaro.calcularConsumo(300,60));
        System.out.println("Kilometros por litro : "+ nissan.calcularConsumo(300,60));

    }
}
