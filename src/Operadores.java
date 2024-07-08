public class Operadores {
    public static void main(String[] args) {
        // Operadores aritméticos
        // var a = 3;
        // var b = 2;
        // var resultado = 0;
        // int a = 3, b = 2, resultado = '0'; // if use int type variable, you may do
        // this.
        // use '' represent unicode value,in the other form,
        // '0' in unicode is 48 int

        int a = 3, b = 2, resultado = 0;
        // Suma
        resultado = a + b;
        System.out.println("Suma = " + resultado);

        // Resta
        resultado = a - b;
        System.out.println("Resta = " + resultado);

        // Multiplicación
        resultado = a * b;
        System.out.println("Multiplicación = " + resultado);

        // División
        resultado = a / b;
        System.out.println("División = " + resultado); // the result is int number 'cause variables are int.
                                                       // if you want decimal numbers, the factories (variables)
                                                       // must be float or double
        // Módulo
        resultado = a % 2;
        System.out.println("Residuo = " + resultado);
    }
}