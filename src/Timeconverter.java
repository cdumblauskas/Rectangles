//  Clark Dumblauskas
//  2/12/15
//  Purpose: To convert time to seconds.

import javax.swing.JOptionPane;

public class TimeConverter {

	public static void main(String[] args) {

		int totalSeconds = 0;
		String timestring;
		int counter = 0;

		timestring = JOptionPane.showInputDialog("Enter the time in the correct format.");

		while(!timestring.equals("0"))
		{

			totalSeconds = SecondCalculator(timestring);
			System.out.println(timestring + " is " + totalSeconds + " seconds.");
			counter ++;
			timestring = JOptionPane.showInputDialog("Enter the time in the correct format.");
		}
		System.out.println(counter + " Coversions have been done.");
	}

	public static int SecondCalculator (String timestring)
	{
		int ret = 0;
		ret = ret + (Integer.parseInt(timestring.substring(0, 2)) * 3600);
		ret = ret + (Integer.parseInt(timestring.substring(3, 5)) * 60);
		ret = ret + (Integer.parseInt(timestring.substring(6, 8)) * 1);
		System.out.println();
		return ret;

	}




}

