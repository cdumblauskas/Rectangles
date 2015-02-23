//  Clark Dumblauskas
//  2/12/15
//  Purpose: To calculate the areas of multiple rectangles

import javax.swing.JOptionPane;
import java.util.Random;

public class Rectangles
{
	public static void main(String[] args)
	{

		Random generator = new Random();

		String input;
		int length = 0;
		int width = 0;
		int area=0 ;
		int counter = 1;


		input = JOptionPane.showInputDialog("Do you want to produce a rectangle?");
		while(input.toLowerCase().equals("yes") || input.toLowerCase().equals("y"))
		{
			length = generator.nextInt(16)+10;
			width = (int) (Math.random()*7 + 1);
			area = ComputeArea(length,width);
			System.out.println("Rectangle #" + counter + ": Length = " + length + "\tWidth = " + width + "\tarea = " + area); 
			counter ++;
			input = JOptionPane.showInputDialog("Do you  want to produce a rectangle?");
		} 
	}


	private static Integer ComputeArea(int length, int width)
	{
		int a;
		a = (length * width);
		return a;
	}
}