import javax.swing.*;
import java.util.*;

public class Busticket {
    public static void main (String[] arg)  {
        String age = JOptionPane.showInputDialog("How old are you?");
        short sage = Short.parseShort(age);
        
        if (sage < 7) {
            JOptionPane.showMessageDialog(null, "It's for free! : D");
        }
        else if (sage >= 7 && sage < 19) {
            JOptionPane.showMessageDialog(null, "The ticket will cost 15 kr");
        }
        else if (sage >= 19 && sage < 27) {
            JOptionPane.showMessageDialog(null, "The ticket will cost 21 kr");
        }
        else if (sage >= 27 && sage < 64) {
            JOptionPane.showMessageDialog(null, "The ticket will cost 28 kr");
        }
        else if (sage >= 65 && sage < 727) {
            JOptionPane.showMessageDialog(null, "The ticket will cost 21 kr");
        }
        else if (sage == 727) {
            JOptionPane.showMessageDialog(null, "Your ticket will cost 727 kr");
        }
        else {
            JOptionPane.showMessageDialog(null, "You should not be alive and therefore I will give you 10 stones");
        }     
    }
}