package MyMain;

import java.io.FileWriter;
import java.io.IOException;
import java.awt.*;
import javax.swing.*;

import MyMain.Lab_4; 
public class Lab_5 {
	protected void start() {
		new Graphic().setVisible(true);
	}
}



@SuppressWarnings("serial")
class DrawingComponent extends JPanel {
	

    
    @Override
    protected void paintComponent(Graphics gh) {  
    	Lab_4 lab4 = new Lab_4();
		try(FileWriter writer = new FileWriter("C:\\Users\\fifab\\eclipse-workspace\\jsvsa\\log.txt", false))
        {
            //ArrayList
    		long fill_mid_10 = lab4.ArrList(writer, 10); 
    		
    		long fill_mid_100 = lab4.ArrList(writer, 100); 
    		
    		long fill_mid_1000 = lab4.ArrList(writer, 1000); 
    		
    		long fill_mid_10000 = lab4.ArrList(writer, 10000); 
    		
    		//LinkedList
    		
    		long ll_fill_mid_10 = lab4.LinkList(writer, 10); 
    		
    		long ll_fill_mid_100 = lab4.LinkList(writer, 100); 
    		
    		long ll_fill_mid_1000 = lab4.LinkList(writer, 1000); 

    		long ll_fill_mid_10000 = lab4.LinkList(writer, 10000); 
    		
    		int arr_y1 = 170;
    		int arr_y2 = (int) (((double)fill_mid_100 / fill_mid_10) * arr_y1);
    		int arr_y3 = (int) (((double)fill_mid_1000 / fill_mid_100) * arr_y2);
    		int arr_y4 = (int) (((double)fill_mid_10000 / fill_mid_1000) * arr_y3);
    		
    		System.out.println(fill_mid_10 + " " + fill_mid_100 +  " " + fill_mid_1000 + " " + fill_mid_10000 + '\n');
    		System.out.println(arr_y1 + " " + arr_y2 +  " " + arr_y3 + " " + arr_y4 + '\n');
    		int ll_y1 = (int) (((double)ll_fill_mid_10 / fill_mid_10) * arr_y1);
    		int ll_y2 = (int) (((double)ll_fill_mid_100 / ll_fill_mid_10) * ll_y1);
    		int ll_y3 = (int) (((double)ll_fill_mid_1000 / ll_fill_mid_100) * ll_y2);
    		int ll_y4 = (int) (((double)ll_fill_mid_10000 / ll_fill_mid_1000) * ll_y3);
    		
    		System.out.println(ll_fill_mid_10 + " " + ll_fill_mid_100 +  " " + ll_fill_mid_1000 + " " + ll_fill_mid_10000 + '\n');
    		System.out.println(ll_y1 + " " + ll_y2 +  " " + ll_y3 + " " + ll_y4 + '\n');
    		int xg[] =  {20, 150, 280, 410};
    		int yg[] =  {arr_y1, arr_y2, arr_y3, arr_y4};
    		int yg1[] =  {ll_y1, ll_y2, ll_y3, ll_y4};
    		int ng = 4;
    		Graphics2D drp = (Graphics2D)gh;
    		drp.drawLine(20, 340, 20, 20);
    		drp.drawLine(20, 340, 460, 340);
    		drp.drawPolyline(xg, yg, ng);
    		drp.drawPolyline(xg, yg1, ng);
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
		
    }
}