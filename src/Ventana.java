import javax.swing.*;

public class Ventana extends JFrame{
    public Ventana(){
        setSize(300, 300);
        setTitle("Conversor de moneda Alura");

        iniciarComponentes();

        setLocationRelativeTo(null);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponentes(){
        JPanel panel = new JPanel();

        panel.setLayout(null);
        this.getContentPane().add(panel);

        JLabel texto = new JLabel();
        texto.setText("Pesos Colombianos");
        texto.setBounds(50, 5, 200, 20);
        panel.add(texto);

        JTextField cantidad = new JTextField();
        cantidad.setBounds(50, 50, 200, 20);
        panel.add(cantidad);

        String monedas[] = {"Dolar", "Euro", "Libra", "Yen", "Won"};
        JList moneda = new JList<>(monedas);
        moneda.setBounds(50, 100, 200, 20);
        panel.add(moneda);

        JButton convertir = new JButton("Convertir");
        convertir.setBounds(50, 150, 100, 20);
        panel.add(convertir);
    }
}
