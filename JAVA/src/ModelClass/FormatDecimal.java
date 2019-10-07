package ModelClass;

import java.text.DecimalFormat;
import java.text.ParseException;
import javax.swing.JOptionPane;

public class FormatDecimal {
    
    DecimalFormat formateador = new DecimalFormat("###,###,###.00");
    Number numero;
    
    public String decimal(double formato){
        return formateador.format(formato);
    }
    
    public double reconstruir(String formato){
        try {
            numero = formateador.parse(formato);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }
        
        return numero.doubleValue();
    }
}
