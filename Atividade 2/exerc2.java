import java.util.Scanner;
import javax.swing.JOptionPane;

public class exerc2 {
    public static void main(String[] arguments) {
        String texto = JOptionPane.showInputDialog("INFORME VALOR 1");
        int n1 = Integer.parseInt(texto);

        texto = JOptionPane.showInputDialog("INFORME O VALOR 2");
        int n2 = Integer.parseInt(texto);

        if (n1 > n2) {
            JOptionPane.showMessageDialog(null, "O valor é: " + (n1 - n2));
        } else {
            JOptionPane.showMessageDialog(null, "O valor é:" + (n2 - n1));
        }
    }
}
