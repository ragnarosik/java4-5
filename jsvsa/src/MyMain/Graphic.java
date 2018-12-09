package MyMain;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Graphic extends JFrame{
public Graphic () {  
       super("My_Graph");
       JPanel jcp = new JPanel(new BorderLayout());
       setContentPane(jcp);
       jcp.add(new DrawingComponent (), BorderLayout.CENTER);     
       jcp.setBackground(Color.white);
       setSize(500, 400);
       setLocationRelativeTo(null);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
   }
}
