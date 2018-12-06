import java.util.*; 

class BTMain
{
	public static void main(String[] args)
	{ 
		BTree bt = new BTree(); 
		int currentNode = 0; 
		Scanner user = new Scanner(System.in);
		boolean foundChar = false; 
		String input = "";
		String newCharacter = "Godzilla"; 
		String newQuestion = ""; 
		String move = ""; 
		bt.setData(currentNode, newCharacter); 
		
		while(foundChar == false)
		{
			
			if(bt.checkLeft(currentNode) == false && bt.checkRight(currentNode) == false)
			{
				System.out.println("You were thinking of " + bt.toString(currentNode));
				input = user.nextLine();
				
				if(input.equals("no") || input.equals("No"))
				{
					currentNode = bt.find(0, newCharacter);
					bt.addRight(currentNode, newCharacter);
				
					System.out.println("I was wrong. Who were you thinking of?"); 
					newCharacter = user.nextLine(); 
					bt.addLeft(currentNode, newCharacter); 

					System.out.println("Enter a yes/no question distinguishing your character");
					newQuestion = user.nextLine(); 
					bt.setData(currentNode, newQuestion);

					currentNode = 0;  
				}
				else if(input.equals("yes") || input.equals("Yes"))
				{
					foundChar = true; 
				}
				else
				{
					System.out.println("Not valid input");
				}
			}
			else
			{
				System.out.println(bt.toString(currentNode)); 
				input = user.nextLine();

				if(input.equals("no") || input.equals("No")) 
				{
					move = bt.moveRight(currentNode);

					currentNode = bt.find(0, move); 
				}
				else if(input.equals("yes") || input.equals("Yes"))
				{
					move = bt.moveLeft(currentNode);

					currentNode = bt.find(0, move); 
				}
			}
		}	

		// bt.setData(currentNode, "The Tick");
		// /*...*/
		// currentNode = bt.find(0, "The Tick"); 
		// bt.addLeft(currentNode, "Cinderella"); 
		// bt.addRight(currentNode, "The Tick"); 
		// bt.setData(currentNode, "Are you a female?"); 
		// /*...*/ 
		// currentNode = bt.find(0, "Cinderella");
		// bt.addLeft(currentNode, "Katniss"); 
		// bt.addRight(currentNode, "The Tick"); 
		// bt.setData(currentNode, "Are you an archer."); 

		// System.out.println(bt.find(0, "Katniss"));
		// System.out.println(bt.find(0, "Cinderella"));  	
		// System.out.println(bt.find(0, "The Tick"));
		// System.out.println(bt.find(0, "Batman"));
	}
}