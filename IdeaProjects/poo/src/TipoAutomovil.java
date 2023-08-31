public enum TipoAutomovil {
    SEDAN("Sedan",4,"Auto mediano"),
    STATION_WAGON("Station Wagon", 5, "Auto grande"),
    HATCHBACK("Hatchback", 5, "Auto compacto"),
    PICKUP("Pickup", 4, "Camioneta"),
    COUPE("coupe", 2, "Auto pequeño"),
    CONVERTIBLE("Convertible",2, "Auto deportivo"),
    FURGON("Furgón", 2, "Auto Utilitario"),

    SUV("SUV",5,"Todo terreno");

    private final String nombre;
    private final int numeroPuertas;
    private final String descripcion;

    TipoAutomovil(String nombre, int numeroPuertas, String descripcion) {
        this.nombre = nombre;
        this.numeroPuertas = numeroPuertas;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
