import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaRepuesta extends JFrame {

    JPanel panel;
    JLabel respuesta;
    JButton salir;

    public VentanaRepuesta(String texto){
        setSize(200, 200);
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
        respuesta.setBounds(20, 20, 150, 20);
        panel.add(respuesta);


        salir = new JButton();
        salir.setText("Salir");
        salir.setBounds(40, 40, 50, 20);
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
