import javax.swing.*;
import java.util.*;

public class BallBounce {
    public static void main (String[] arg)  {
        String s = JOptionPane.showInputDialog("How high do you drop the ball? (cm)");
        int h = Integer.parseInt(s);
        int times = 0;
        int minh = 1;
        while (h != minh){
            h *= 0.3;
            times += 1;
        }
        JOptionPane.showMessageDialog(null, times);
    }
}