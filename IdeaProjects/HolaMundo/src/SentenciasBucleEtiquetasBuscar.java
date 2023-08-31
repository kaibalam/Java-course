public class SentenciasBucleEtiquetasBuscar {
    public static void main(String[] args) {

        String frase = "tres tristes tigres tragan trigotrigo en un trigaltrigo, trigo. trigo!";
        String palabra = "trigo";
        int cantidad = 0;
        int maxPalabra = palabra.length();
        int maxFrase = frase.length() - maxPalabra;

        char letra = 'g';
        buscar:
        for (int i = 0; i <= maxFrase;){
            int k = i;
            for (int j = 0; j < maxPalabra; j++) {
                if (frase.charAt(k++) != palabra.charAt(j)) {
                    i++;
                    continue buscar;
                }
            }
            cantidad++;
            i = i + maxPalabra;
        }
        System.out.println("Encontrado = " + cantidad + " veces la palabra '"+ palabra +"' en la frase");

    }
}
