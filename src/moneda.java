import java.util.HashMap;
import java.util.Map;

public class moneda {
    private String nombre;
    private Map<String, Double> valores;

    public moneda() {
        nombre = "Peso Colombiano";
        valores = new HashMap<>();

        valores.put("Dolar", 0.00024);
    }

    public moneda(String nombre, Map valores) {
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
        Double a = cantidad * this.valores.get(moneda);
        return cantidad + " " + this.nombre + " en " + moneda + " es " + a;
    }
}
