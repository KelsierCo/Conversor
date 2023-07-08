import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaRepuesta extends JFrame {

    JPanel panel;
    JLabel respuesta;
    JButton salir;

    public VentanaRepuesta(String texto){
        setSize(400, 150);
        setTitle("Conversor de moneda Alura");

        iniciarComponentes(texto);

        setLocationRelativeTo(null);
    }

    private void  iniciarComponentes(String texto){
        panel = new JPanel();

        panel.setLayout(null);
        this.getContentPane().add(panel);

        respuesta = new JLabel();
        respuesta.setText(texto);
        respuesta.setBounds(160, 20, 150, 20);
        panel.add(respuesta);


        salir = new JButton();
        salir.setText("Salir");
        salir.setBounds(150, 75, 80, 20);
        panel.add(salir);

        ActionListener salirListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        };

        salir.addActionListener(salirListener);
    }
}
