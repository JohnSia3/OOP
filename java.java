import java.util.Scanner;

import javax.swing.JOptionPane;

public class java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int evilGen, winCount=0, round=0, evilWinCount=0, popUp=1;
		char again; //this was for to try again. but uh??
		String chooseMove;
		winCount++;
		evilWinCount++;
		String userInput = "no";
		
		
Scanner input = new Scanner(System.in);
JOptionPane.showMessageDialog( null, "ERROR ERROR", "ERROR", JOptionPane.ERROR_MESSAGE); 
do {
System.out.println("OH NO Evil_DevilP0lluter16 IS TAKING OVER THE PROGRAM! \n\nDEFEAT HIM BY"+
" PLAYING IN ROCK, PAPER, SCISSORS!!"); //use window pane to produce message "error" after this. 
System.out.println("   , ,, ,                              \n" + 
		"   | || |    ,/  _____  \\.             \n" + 
		"   \\_||_/    ||_/     \\_||             \n" + 
		"     ||       \\_| . . |_/              \n" + 
		"     ||         |  L  |                \n" + 
		"    ,||         |`==='|                \n" + 
		"    |>|      ___`>  -<'___             \n" + 
		"    |>|\\    /             \\            \n" + 
		"    \\>| \\  /  ,    .    .  |           \n" + 
		"     ||  \\/  /| .  |  . |  |           \n" + 
		"     ||\\  ` / | ___|___ |  |     (     \n" + 
		"  (( || `--'  | _______ |  |     ))  ( \n" + 
		"(  )\\|| (  )\\ | - --- - | -| (  ( \\  ))\n" + 
		"(\\/  || ))/ ( | -- - -- |  | )) )  \\(( \n" + 
		" ( ()||((( ())|         |  |( (( () )hjm");
System.out.print("Choose your move! \"Rock\", \"Paper\", \"Scissors\"\n\n>");
//put the above in a loop so that user enter a word and next message gets printed

while((winCount<=2||evilWinCount<=2)&&winCount!=3&&popUp<=1) { //ive tried input.hasNextInt()&input.hasNext() to make it try again. but none worked. help me
while(round<3 ) { //exit loop
//while(winCount<3 && round<3 ) { 
	chooseMove = input.next();

	if(chooseMove.equalsIgnoreCase("Rock")) {
		evilGen = (int)(Math.random()*3+1);
		System.out.print("You chose rock"); //put ASCII art of rock here
		if(evilGen == 1) {
			evilGen = (int)(Math.random()*3+1);
			System.out.println("\nEvil also chose \"Rock\". No one wins this round :( ");
	
		} else if(evilGen == 2) {
			evilGen = (int)(Math.random()*3+1);
			System.out.println("\nEvil chose \"Scissors\". You WIN this round!! Yippee ");
			winCount++;
			round++;
		}	 else {
			evilGen = (int)(Math.random()*3+1);
			System.out.println("\nEvil chose \"Paper\". You lost this round :'(");
			round++;

	}
		}
	else if(chooseMove.equalsIgnoreCase("Scissors")) {
		evilGen = (int)(Math.random()*3+1);
		System.out.print("You chose scissors"); //put ASCII art ofscissors etc here
		if(evilGen == 1) {
			evilGen = (int)(Math.random()*3+1);
			System.out.println("\nEvil chose \"Rock\". You lost this round :'( ");
			round++;
		} else if(evilGen == 2) {
			evilGen = (int)(Math.random()*3+1);
			System.out.println("\nEvil also chose \"Scissors\". No one wins this round :( ");

		} else {
			evilGen = (int)(Math.random()*3+1);
		System.out.println("\nEvil chose \"Paper\". You WIN this round!! Yippee ");
		winCount++;
		round++;}
	} else if(chooseMove.equalsIgnoreCase("Paper")) {
			evilGen = (int)(Math.random()*3+1);
			System.out.print("You chose paper"); //put ASCII art of paper etc here
			if(evilGen == 1) {
				evilGen = (int)(Math.random()*3+1);
				System.out.println("\nEvil chose \"Rock\". You WIN this round!! Yippee");
				round++;
				winCount++;
			} else if(evilGen == 2) {
				evilGen = (int)(Math.random()*3+1);
				System.out.println("\nEvil chose \"Scissors\". You lost this round :'(  ");
				round++;
			} else if(evilGen == 3) {
				evilGen = (int)(Math.random()*3+1);
			System.out.println("\nEvil also chose \"Paper\". No one wins this round :( ");
			}
	}else {
		System.out.println("INVALID");
		
	}	
		System.out.print("Choose your move! \"Rock\", \"Paper\", \"Scissors\"\n\n"+winCount+"/3"+"\n>");
	}
		userInput = input.next();
	}
		//System.out.println("You just destroyed humanity.......... :(.");}
		//not too sure how to make it that the user can try again solli boss & how to make what evil answered at the end of the final round
		System.out.println("You just destroyed humanity :(. Would you like to try again? Enter Yes to try again or No to exit.");
		popUp++;
	}

		while (userInput.equalsIgnoreCase("yes"));
		if(winCount==2) {
			JOptionPane.showMessageDialog(null,"WHIPPIEEEE!");
			System.out.println("You defeated EVILDEVIL_POLLUTER16!! You won a very luxurious car worth $19999996 :D"); //pop up window saying "yay"
			popUp++;
		} 
	}
}

 //this one is not the right way of course