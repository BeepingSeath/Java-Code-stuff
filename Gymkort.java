import javax.swing.*;
import java.util.*;

public class Gymkort {
    public static void main (String[] arg)  {
        long yearprice = 86400000000l;
        long ticket = 8000000000l;

        JOptionPane.showMessageDialog(null, "Year card " + yearprice + "\n" + "Ticket Price " + ticket );
        String times = JOptionPane.showInputDialog("How many times?");
        int itimes = Integer.parseInt(times);
        if (itimes >= 10) {
            JOptionPane.showMessageDialog(null, "Worth");
        }
        else {
            JOptionPane.showMessageDialog(null, "Not Worth");
        }

    }
}