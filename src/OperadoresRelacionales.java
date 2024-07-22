public class OperadoresRelacionales {
    public static void main(String[] args) {
        // Operadores relacionales (Comparación)
        int a = 3, b = 2;
        
        // Igualdad
        var resultado = a == b;
        System.out.println("Resultado a == b : " + resultado);
    
        // Diferente de
        resultado = a != b;
        System.out.println("Resultado a != b : " + resultado);

        // Menor que
        resultado = a < b;
        // resultado = a <= b;
        System.out.println("Resultado a < b  : " + resultado);
        
        // Mayor que
        resultado = a > b;
        // resultado = a >= b;
        System.out.println("Resultado a > b : " + resultado);
    }
}
