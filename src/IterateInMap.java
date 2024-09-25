import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class IterateInMap {
    public static void main(String[] args) {
        // Cuál es el uso de Properties
        // es una subclase de Hashtable, utilizada para almacenar PARES clave-valor (ambos string)
        // Con esto comúnmente se pueden almacenar CONFIGURACIONES Y PROPIEDADES DEL SISTEMA
        Properties props = System.getProperties();

        
        // Convertir Properties a un Map<String, String>
        Map<String, String> propMap = new HashMap<>();
        
        for (String key : props.stringPropertyNames()) {
            propMap.put(key, props.getProperty(key));
        }
        System.out.println("Properties getter: " + propMap);

        // Acceder a los valores del mapa
        String javaVersion = propMap.get("java.version");

        System.out.println("Versión de Java: " + javaVersion);
    }
}
