//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package conditionals;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		String input=JOptionPane.showInputDialog("do you like bananas"); 
		//2. if they say no,
		
			//tell them they are crazy 
		if(input.equals("no")){
		JOptionPane.showMessageDialog(null, "you're crazy! like why not there are heathy");
		}
		if(input.equals("yes")){
			
        String hobby = JOptionPane.showInputDialog("what is you're favarite hobby");
		JOptionPane.showMessageDialog(null,  hobby + " is much better with bananas");
		//and end quiz
		
		
		
		}
		//3. if they say yes
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"

		//4. OPTIONAL: if they say something other than 
		//	show a pop up that says You are bananas!
	
	}

}
