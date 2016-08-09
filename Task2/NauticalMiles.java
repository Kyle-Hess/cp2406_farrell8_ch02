package Task2;

import javax.swing.*;

/**
 * Created by jc321662 on 9/08/16.
 */
public class NauticalMiles {
    public static void main(String[] args){
        String userInput;
        double kilometers = (1.852), miles = (0.62137);
        double conversion ;
        userInput = JOptionPane.showInputDialog(null,
                "Enter numebr","", JOptionPane.INFORMATION_MESSAGE);
        conversion = Double.parseDouble(userInput)/ miles;
        System.out.println(conversion);
    }
}
