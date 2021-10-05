import javax.swing.*;
import java.util.*;

public class moms {
    public static void main (String[] arg)  {
       String price = JOptionPane.showInputDialog("How much does it cost");
       double iprice = Double.parseDouble(price);
       double momsprice = iprice / 1.25;
       double moms = iprice - momsprice;
       JOptionPane.showMessageDialog(null, momsprice + "\n" + moms);     
    }
}