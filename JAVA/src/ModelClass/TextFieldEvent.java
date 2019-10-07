package ModelClass;

import java.awt.event.KeyEvent;
import javax.swing.JTextField;

public class TextFieldEvent {
    
    public void textKeyPress(KeyEvent evt){
        //Declaramos una variable y le asignamos un evento
        char car = evt.getKeyChar();
        
        //Condicion que nos permite ingresar datos de tipo texto
        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z') && (car != (char) KeyEvent.VK_BACK_SPACE) && (car != (char) KeyEvent.VK_SPACE)){
            evt.consume();
        }
    }
    
    public void numberKeyPress(KeyEvent evt){
        //Declaramos una variable y le asignamos un evento
        char car = evt.getKeyChar();
        
        //Condicion que nos permite ingresar datos numericos
        if ((car < '0' || car > '9') && (car != (char) KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
    }
    
    public void numberDecimalKeyPress(KeyEvent evt, JTextField textField){
        //Declaramos una variable y le asignamos un evento
        char car = evt.getKeyChar();
        
        //Condicion que nos permite ingresar datos numericos con su punto decimal
        if ((car < '0' || car > '9') && textField.getText().contains(".") && (car != (char) KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        } else if ((car < '0' || car > '9') && (car != '.') && (car != (char) KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
    }
}
