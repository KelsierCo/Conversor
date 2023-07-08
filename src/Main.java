import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Moneda Cop = new Moneda();
        VentanaMoneda ventanaMoneda = new VentanaMoneda();

        ventanaMoneda.setVisible(true);
        ActionListener convertirListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String respuesta = ventanaMoneda.getCantidad().getText() + " COP son " + 2000 + " " + ventanaMoneda.getMoneda().getSelectedItem()+"es" ;
                VentanaRepuesta ventanaRespuesta = new VentanaRepuesta(respuesta);

                ventanaRespuesta.setVisible(true);
            }
        };

        ventanaMoneda.convertir.addActionListener(convertirListener);
    }
}