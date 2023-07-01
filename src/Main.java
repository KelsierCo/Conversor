// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        moneda Cop = new moneda();
        Ventana ventana = new Ventana();

        ventana.setVisible(true);
        System.out.println(Cop.conversion(4168, "Dolar"));
    }
}