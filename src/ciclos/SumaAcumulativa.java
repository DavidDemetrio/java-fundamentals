package ciclos;

public class SumaAcumulativa {
    public static void main(String[] args) {
        // Sumar los primeros 5 números
        final var MAXIMO = 5;
        var acumuladorSuma = 0;
        
        // Iterar los valors
        for (var numero = 1; numero <= MAXIMO; numero ++) {
            acumuladorSuma += numero;
        }

        System.out.println("Suma acumulativa de los primeros 5 números: " + acumuladorSuma);
    }
}
