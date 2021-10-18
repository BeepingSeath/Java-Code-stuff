import javax.swing.*;
import java.util.*;


public class MathOne {
    public static void main (String[] arg)  {
        	String s = JOptionPane.showInputDialog("Insert number!");
            int n = Integer.parseInt(s);
            int sum=0;
            int k=1;
            int l=1;
            while (k <= n) {
                sum = sum + l;
                k = k + 1;
                l = k*k;
            }
            JOptionPane.showMessageDialog(null, "The sum is " + sum);
    }
}