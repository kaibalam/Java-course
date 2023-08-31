public class Automovil implements Comparable<Automovil> {

    private int id;
    private String fabricante = "toyota";
    private String modelo = "2020";
    private Color color = Color.GRIS;
    private Motor motor;
    private Estanque estanque;

    private Persona conductor;
    private Rueda[] ruedas;
    private int indiceRuedas = 0;

    private static int capacidadEstanqueEstatico = 30;

    private static Color colorPatente = Color.NARANJA;

    private static int ultimoId;

    public static final Integer VELOCIDAD_MAXIMA_CARRETERA;

    public static final Integer VELOCIDAD_MAXIMA_CIUDAD;

    public static final String COLOR_AMARILLO = "Amarillo";
    public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_AZUL = "Azul";
    public static final String COLOR_BLANCO = "Blanco";
    public static final String COLOR_GRIS = "Gris";

    private TipoAutomovil tipo;



    static {
        VELOCIDAD_MAXIMA_CIUDAD = 60;
        VELOCIDAD_MAXIMA_CARRETERA = 120;
    }
    public String leerFabricante(){
        return this.fabricante;
    }

    public Automovil() {
        this.id = ++ultimoId;
        this.ruedas = new Rueda[5];
    }

    public Automovil(String fabricante, String modelo) {
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, Color color){
        this(fabricante,modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor) {
        this(fabricante,modelo,color);
        this.motor = motor;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque) {
        this(fabricante,modelo,color,motor);
        this.estanque = estanque;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque, Persona conductor, Rueda[] ruedas) {
        this(fabricante,modelo,color,motor,estanque);
        this.conductor = conductor;
        this.ruedas = ruedas;
    }

    public String verDetalle(){
        StringBuilder sb = new StringBuilder();
        sb.append("auto.id = " + this.id);
        sb.append("\nauto modelo = " + this.modelo);
        sb.append("\nauto color = " + color);
        sb.append("\nauto fabricante = " + this.fabricante);
        if(this.motor != null){
            sb.append("\nauto cilindrada = " + this.motor.getCilindrada());
        }
        sb.append("\n patente Color "+ colorPatente);
        if(this.getTipo() != null) {
            sb.append("\n Tipo " + this.getTipo().getDescripcion());
        }
        if(conductor != null){
            sb.append("\n Conductor subaro: "+ this.getConductor());
        }
        if(getRuedas() != null){
            sb.append("\n Ruedas del automovil");
            for (Rueda r : this.getRuedas()
                 ) {
                sb.append("\n").append(r.getFabricante()).append(", aro ").append(r.getAro()).append(", ancho ").append(r.getAncho());
                
            }
        }
        return sb.toString();
    }

    public String acelerar(int rpm){
        return "El auto " + fabricante + " acelerando a "+ rpm +" rpm";
    }

    public String frenar(){
        return fabricante +" "+modelo + " frenando";
    }

    public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km, float porcentajeBencina){
        return km/(this.getEstanque().getCapacidad()*porcentajeBencina);
    }

    public float calcularConsumo(int km, int porcentajeBencina){
        return km/(this.getEstanque().getCapacidad()*(porcentajeBencina/100f));
    }

    public static float calcularConsumoEstatico(int km, float porcentajeBencina){
        return km/(Automovil.capacidadEstanqueEstatico*(porcentajeBencina/100f));
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Estanque getEstanque() {
        if(estanque == null){
            this.estanque = new Estanque();
        }
        return estanque;
    }

    public void setEstanque(Estanque estanque) {
        this.estanque = estanque;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public Automovil addRueda(Rueda rueda){
        if(indiceRuedas < this.ruedas.length){
            this.ruedas[indiceRuedas++] = rueda;
        }
        return this;
    }

    public static Color getColorPatente() {
        return colorPatente;
    }

    public static int getCapacidadEstanqueEstatico() {
        return capacidadEstanqueEstatico;
    }

    public static void setCapacidadEstanqueEstatico(int capacidadEstanqueEstatico) {
        Automovil.capacidadEstanqueEstatico = capacidadEstanqueEstatico;
    }

    public static void setColorPatente(Color colorPatente) {
        Automovil.colorPatente = colorPatente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)  return true;

        if(!(obj instanceof Automovil))return false;

        Automovil a = (Automovil) obj;
        return (this.fabricante != null && this.modelo != null &&
                this.fabricante.equals(a.getFabricante()) &&
                this.modelo.equals(a.getModelo()));
    }

    @Override
    public String toString() {
        return this.id + " : " + fabricante + " " + modelo;
    }

    @Override
    public int compareTo(Automovil a) {
        return this.fabricante.compareTo(a.fabricante);
    }
}
