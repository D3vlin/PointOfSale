package ModelClass;

import java.text.DecimalFormat;
import java.text.ParseException;
import javax.swing.JOptionPane;

public class FormatDecimal {
    
    DecimalFormat formater = new DecimalFormat("###,###,###.00");
    Number number;
    
    public String decimal(double formato){
        return formater.format(formato);
    }
    
    public double rebuild(String formato){
        try {
            number = formater.parse(formato);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }
        
        return number.doubleValue();
    }
}
