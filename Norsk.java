import javax.swing.*;

public class Norsk {
    public static void main (String[] arg)  {
        char c1 = '\u00D8';
        char c2 = '\u00F8';
        char c3 = '\u03A0';
        String Output = "" + c1 + c2 + c3;
        JOptionPane.showMessageDialog(null, Output);
    }
}