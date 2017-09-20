//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package conditionals;

import java.util.spi.CalendarDataProvider;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		String answer = JOptionPane.showInputDialog( null, "Do you like bananas?");
		//2. if they say no, 
		if (answer.equalsIgnoreCase("no")){
			JOptionPane.showMessageDialog(null, "YOUR CRAZY!!!!!!!!!!!!!!!!!!");
		}
			//tell them they are crazy 
			//and end quiz
		//3. if they say yes
		else if (answer.equalsIgnoreCase("yes")){
			String hobby = JOptionPane.showInputDialog(null, "WHAT IS YOUR FAVORIT HOBBY?");
				JOptionPane.showMessageDialog(null, hobby+" sounds like a fun thing to do");
		}
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"

		//4. OPTIONAL: if they say something other than â€œyesâ€� or â€œnoâ€�
		//	show a pop up that says â€œYou are bananas!â€�
	FruitQuiz apple = new FruitQuiz();
	}



}
