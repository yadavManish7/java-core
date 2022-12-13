package day16;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimeApp {
    public static void main(String[] args) {

        ActionListener listener = new ActionListener() {  //ActionListener is an Interface
            @Override
            public void actionPerformed(ActionEvent e) {  //callback function, interface is used to create callback function
                System.out.println("Action performed called ");
            }
        };
        Timer timer = new Timer(5000,listener); //Time is in millisecond
        timer.start();
        JOptionPane.showMessageDialog(null,"Quit program"); //show pop up with message
        System.exit(0);

        //Observer pattern (RX Java library)
        //Subscribe - subscriber
    }
}
