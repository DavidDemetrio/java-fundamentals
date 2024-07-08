public class OperadoresUnarios {
    public static void main(String[] args) {
        // unary operators
        int a = 3, b = -2, resultado = 0;
        var c = false;

        // Operador unario negativo
        resultado = -a;
        System.out.println("-a = " + resultado);
        resultado = -b;
        System.out.println("-b = " + resultado);
    
        // increment unary increment
        a = 3;
        resultado = ++a; // pre-increment
        System.out.println("Pre-increment ++ a= " + resultado);
        resultado = a;
        System.out.println("Pre-increment ++ a= " + resultado);

        a = 3;
        resultado =  a++; // post-increment
                          // the differents is post a first original value
        System.out.println("Post-increment a++ = " + resultado);
        resultado = a;    // then, the value increment one
        System.out.println("Post-increment a++ = " + resultado);
    
        // decrement unary operator
        a = 3;
        resultado = --a; // pre-decrement
        System.out.println("Pre-decrement = " + resultado);

        a = 3;
        resultado = a--; //
        System.out.println("Post-decrement = " + resultado);
        resultado = a; // post-decrement, the increment value was save to show now
        System.out.println("Show increment value post = " + resultado);
    
        // Negation unary operator
        System.out.println("Negation = " + !c);
    }
}


// The unarities variables are:
//  + -> positive value
//  - -> negative value
//  ++ -> increment operator
//  -- -> decrement operator
//  ! -> negation operator (toogle value, if value is false, then will be true and vice versa)