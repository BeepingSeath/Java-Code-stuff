import javax.swing.*;
import java.util.*;

public class Grade {
    public static void main (String[] arg)  {
        String grade = JOptionPane.showInputDialog("How many points did you get?");
        short sgrade = Short.parseShort(grade);
        
        if (sgrade < 25) {
            JOptionPane.showMessageDialog(null, "You got an F, maybe study a bit more next time?");
        }
        else if (sgrade >= 25 && sgrade < 30) {
            JOptionPane.showMessageDialog(null, "You got an E, good job! Next time you maybe reach a D!");
        }
        else if (sgrade >= 30 && sgrade < 35) {
            JOptionPane.showMessageDialog(null, "You got a D, Nicely done, maybe even a C next time?");
        }
        else if (sgrade >= 35 && sgrade < 40) {
            JOptionPane.showMessageDialog(null, "You got a C, Very good job, You are on the right track for that B!");
        }
        else if (sgrade >= 40 && sgrade < 45) {
            JOptionPane.showMessageDialog(null, "You got a B, Amazingly done! Almost at the top!");
        }
        else if (sgrade >= 45 && sgrade < 50) {
            JOptionPane.showMessageDialog(null, "You got an A, Outstanding job there champ! You almost aced the test too!");
        }
        else {
            JOptionPane.showMessageDialog(null, "You aced the test!!! A perfect performance! Your reward is one chocolate bar : )");
        }     
    }
}