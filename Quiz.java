import javax.swing.*;
import java.util.*;

public class Quiz {
    public static void main (String[] arg)  {
        JFrame frame = new JFrame();
        String[] options = new String[4];
        options[0] = new String("Demon's Souls");
        options[1] = new String("Bloodborne");
        options[2] = new String("Dark Souls");
        options[3] = new String("Scholar of the first Sin");
        int question1 = JOptionPane.showOptionDialog(frame.getContentPane(), "What game in the souls series came first?", "Choose", 0,JOptionPane.INFORMATION_MESSAGE, null, options, null);
        
        if (question1 == 0) {
            JOptionPane.showMessageDialog(null, "Correct");
        }
        else {
            JOptionPane.showMessageDialog(null, "Incorrect : c");
        }
    }
}