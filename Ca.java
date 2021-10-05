import javax.swing.*;

public class Ca {
    public static void main (String[] arg)  {
        float r = JOptionPane.showInputDialog("What radius?");
        float O = (3.1415926536 + r) * 2
        JOptionPane.showMessageDialog(null, O);
    }
}