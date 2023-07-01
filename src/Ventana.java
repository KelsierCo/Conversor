import javax.swing.*;

public class Ventana extends JFrame{
    public Ventana(){
        setSize(300, 300);
        setTitle("Conversor de moneda Alura");

        iniciarComponentes();

        setLocationRelativeTo(null);
    }

    private void iniciarComponentes(){
        JPanel panel = new JPanel();

        this.getContentPane().add(panel);

        JLabel texto = new JLabel("Pesos Colombianos");
        panel.add(texto);

        JTextField cantidad = new JTextField();
        panel.add(cantidad);

        String monedas[] = {"Dolar", "Euro", "Libra", "Yen", "Won"};
        JList moneda = new JList<>(monedas);
        panel.add(moneda);

        JButton convertir = new JButton("Convertir");
        panel.add(convertir);
    }
}
