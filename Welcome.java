import javax.swing.*;

public class Welcome {
    public static void main (String[] arg)  {
        String Name = JOptionPane.showInputDialog("What is your name?");
        String Adress = JOptionPane.showInputDialog("What is your adress?");
        String TN = JOptionPane.showInputDialog("What is your phone number?"); 
        String Secret = JOptionPane.showInputDialog("What is your social security number? (YY-MM-DD-XXXX)");
        String Message = Name + "\n" + Adress + "\n" + TN + "\n" + Secret;
        JOptionPane.showMessageDialog(null, Message);
    }
}