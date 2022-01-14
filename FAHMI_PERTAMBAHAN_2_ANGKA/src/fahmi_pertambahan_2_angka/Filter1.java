
package fahmi_pertambahan_2_angka;

import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Filter1 {
    public static void digitFilter(KeyEvent evt) {
        char input = evt.getKeyChar();
        if (! ((Character.isDigit(input) ||
                (input == KeyEvent.VK_BACK_SPACE) ||
                (input == KeyEvent.VK_DELETE))
                )) {
            new JFrame().getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Cuma Bisa DiMasukan Angka");
            evt.consume();
        }
    }
}