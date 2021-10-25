import javax.swing.*;
import java.util.*;

public class Multiplication {
    public static void main (String[] arg)  {
        String a1 = JOptionPane.showInputDialog("Choose a number");
        String a2 = JOptionPane.showInputDialog("Choose your starting number");
        String a3 = JOptionPane.showInputDialog("How many numbers?");
        int int1 = Integer.parseInt(a1);
        int int2 = Integer.parseInt(a2);
        int int3 = Integer.parseInt(a3);
        int times = 0;
        String output = "";

        while (times < int3){
            times = times+1;
            int num = int1*int2;
            output += int1 + " * " + int2 + " = " + num + "\n";
            int2 = int2 + 1;
        }
        JOptionPane.showMessageDialog(null, output);
    }
}