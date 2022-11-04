import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class princ {
    public static void main(String[] args) {
        Map<String, String> exemplo = new HashMap<String, String>();
        exemplo.put("10", "João");

        for (String key : exemplo.keySet()) {
            String value = exemplo.get(key);
            System.out.println(key + " = " + value);
        }

        // Pegar valores com suas chaves
        String v = exemplo.get("10");
        System.out.println(v);

        // Pegar chave com seus valores
        Collection <String> x = exemplo.values();
        for (String string : x) {
            System.out.println("Valores do hashMap exemplo: " + string);
        }

        
    }
}
