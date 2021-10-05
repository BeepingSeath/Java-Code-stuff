import javax.swing.*;
import java.util.*;

public class time {
    public static void main (String[] arg)  {
        String time = JOptionPane.showInputDialog("How long did it take?");
        int itime = Integer.parseInt(time);
        double seconds = itime;
        double minutes = itime / 60;
        double hours = minutes / 60;
        JOptionPane.showMessageDialog(null, seconds + " Seconds" + "\n" + minutes + " Minutes" + "\n" + hours + " Hours");
    }
}