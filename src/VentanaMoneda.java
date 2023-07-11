import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaMoneda extends JFrame{

    JPanel panel;
    JButton convertir;
    JTextField cantidad;
    JComboBox moneda;
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
        iniciarField();
        iniciarComboBox();
        iniciarBoton();


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

    private void iniciarField(){
        cantidad = new JTextField();
        cantidad.setBounds(50, 70, 200, 20);
        panel.add(cantidad);
    }

    private void iniciarComboBox(){
        String monedas[] = {"Dolar", "Euro", "Libra", "Yen", "Won"};
        moneda = new JComboBox(monedas);
        moneda.setBounds(50, 140, 200, 20);
        panel.add(moneda);
    }

    private void iniciarBoton(){
        convertir = new JButton("Convertir");
        convertir.setBounds(90, 200, 130, 20);
        panel.add(convertir);
    }

    public int getCantidad() {
        try {
            int cantidad = Integer.parseInt(this.cantidad.getText());
            return cantidad;
        } catch (NumberFormatException e){
            return 0;
        }
    }

    public String getMoneda() {
        return moneda.getSelectedItem().toString();
    }
}