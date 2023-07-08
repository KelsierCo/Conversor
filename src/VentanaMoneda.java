import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaMoneda extends JFrame{

    JPanel panel;
    public VentanaMoneda(){
        setSize(300, 300);
        setTitle("Conversor de moneda Alura");

        iniciarComponentes();

        setLocationRelativeTo(null);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponentes(){
        panel = new JPanel();

        panel.setLayout(null);
        this.getContentPane().add(panel);

        iniciarLabel();

        JTextField cantidad = new JTextField();
        cantidad.setBounds(50, 70, 200, 20);
        panel.add(cantidad);

        String monedas[] = {"Dolar", "Euro", "Libra", "Yen", "Won"};
        JComboBox moneda = new JComboBox(monedas);
        moneda.setBounds(50, 140, 200, 20);
        panel.add(moneda);

        JButton convertir = new JButton("Convertir");
        convertir.setBounds(90, 200, 130, 20);
        panel.add(convertir);

        ActionListener convertirListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(moneda.getSelectedItem());
            }
        };

        convertir.addActionListener(convertirListener);
    }

    private void iniciarLabel(){
        JLabel texto = new JLabel();
        texto.setText("Pesos Colombianos");
        texto.setBounds(90, 35, 200, 20);
        panel.add(texto);

        JLabel texto2 = new JLabel();
        texto2.setText("Convertir a: ");
        texto2.setBounds(120, 105, 200, 20);
        panel.add(texto2);
    }
}
