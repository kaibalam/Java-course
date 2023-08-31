public enum Color {
    ROJO("Rojo"),
    AMARILLO("Amarillo"),
    AZUL("Azul"),
    VERDE("Verde"),
    GRIS("Gris"),
    BLANCO("Blanco"),
    NARANJA("Blanco");

    private final String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return this.color ;
    }
}
