import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public class Moneda {
    private String nombre;
    private Map<String, Double> valores;

    public Moneda() {
        nombre = "Peso Colombiano";
        valores = new HashMap<>();

        valores.put("Dolar", 0.00024);
        valores.put("Euro", 0.00022);
        valores.put("Libra", 0.00019);
        valores.put("Yen", 0.035);
        valores.put("Won", 0.32);
    }

    public Moneda(String nombre, Map valores) {
        this.nombre = nombre;
        this.valores = valores;
    }

    public Map<String, Double> getValores() {
        return valores;
    }

    public void setValores(Map<String, Double> valores) {
        this.valores = valores;
    }

    public String conversion(int cantidad, String moneda){
        Double valor = cantidad * this.valores.get(moneda);
        if(valor == 0) { return "Por favor, ingrese un numero valido";}
        return cantidad + " " + this.nombre + " son " + valorFormateado(valor) + " " + moneda + "es";
    }

    public String valorFormateado(Double valor){
        DecimalFormat df = new DecimalFormat("#.##");
        return df.format(valor);
    }
}
