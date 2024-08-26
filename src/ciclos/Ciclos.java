package ciclos;

public class Ciclos {
    public static void main(String[] args) {
        // Ciclo while
        int contador = 1;
        // when is constant, add key word final
        final int VALOR_MAXIMO = 5;
        // IF while contains one sentence, discard llavecitas
        // the initial value contador is show, then it is incrementeding
        // while (contador <= VALOR_MAXIMO) System.out.println("Valor: " + contador++);

        // ciclo do while
        do {
            System.out.println("Valir: " + contador++);
        } while (contador <= VALOR_MAXIMO);
    }
}
