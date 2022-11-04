import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

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
        List<String> x = (List<String>) exemplo.values();
        for (String string : x) {
            System.out.println("Valores do hashMap exemplo: " + string);
        }

        UIManager.getDefaults().put("OptionPane.background", new Color(217, 232, 238));
        UIManager.put("Panel.background", new Color(217, 232, 238));
    }
}
