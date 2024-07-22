import java.util.Scanner;

public class ValidationUserPassword {
    public static void main(String[] args) {
        // Revisar Usuario y Password
        var consola = new Scanner(System.in);
        System.out.print("¿Cuál es tu usuario? ");
        var usuario = consola.nextLine();
        System.out.print("¿Cuál es tu contraseña? ");
        var password = consola.nextLine();

        consola.close();

        // Usuario válido usuario_valido = 'admin'
        // Password válida password_valido = '1234'
        var usuario_valido = "admin";
        var password_valido = "1234";
    
        if (usuario_valido.equals(usuario) && password_valido.equals(password)) {
            System.out.println("Ingreso al sistema exitoso!");
        } else {
            System.out.println("Tus credenciales son inválidas :(!");
        }
    }
}
