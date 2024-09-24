/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ucr.ac.cr.tm2100.g3.testvenana;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;

/**
 *
 * @author lab2-11
 */
public class TestVenana extends JFrame{
    
    
    
    public TestVenana() 
    {
        super("Ventana por ejemplo");
        Container contenedor=getContentPane();
        contenedor.setBackground(Color.red);
        setSize(300,300);
        setVisible(true);
        setBackground(Color.yellow);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
       TestVenana  testVenana  = new  TestVenana();
    }
}
