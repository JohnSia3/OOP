import java.util.Scanner;

public class RPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int evilGen, winCount=0, round=0, evilWinCount=0, popUp=1;
		char again; //this was for to try again. but uh??
		String chooseMove;
		evilGen = (int)(Math.random() * 3 + 1);
		
Scanner input = new Scanner(System.in);
System.out.println("OH NO Evil_DevilP0lluter16 IS TAKING OVER THE PROGRAM! \n\nDEFEAT HIM BY"+
" PLAYING IN ROCK, PAPER, SCISSORS!!"); //use window pane to produce message "error" after this. 

System.out.print("Choose your move! \"Rock\", \"Paper\", \"Scissors\"\n\n>");
//put the above in a loop so that user enter a word and next message gets printed

while((winCount<=2||evilWinCount<=2)&&popUp<=1) { //ive tried input.hasNextInt()&input.hasNext() to make it try again. but none worked. help me
while(round<=3 ) { //exit loop
//while(winCount<3 && round<3 ) { 
	chooseMove = input.next();

	if(chooseMove.equalsIgnoreCase("Rock")) {
System.out.print("You chose rock"); //put ASCII art of rock here
if(evilGen == 1) {
	
	System.out.println("\nEvil also chose \"Rock\". No one wins this round :( ");
	
} else if(evilGen == 2) {
	
	System.out.println("\nEvil chose \"Scissors\". You WIN this round!! Yippee ");
	winCount++;
	round++;
} else {
System.out.println("\nEvil chose \"Paper\". You lost this round :'(");
round++;

	}}
	else if(chooseMove.equalsIgnoreCase("Scissors")) {
		System.out.print("You chose scissors"); //put ASCII art ofscissors etc here
		if(evilGen == 1) {
			
			System.out.println("\nEvil chose \"Rock\". You lost this round :'( ");
			round++;
		} else if(evilGen == 2) {
			
			System.out.println("\nEvil also chose \"Scissors\". No one wins this round :( ");
		
		} else {
		System.out.println("\nEvil chose \"Paper\". You WIN this round!! Yippee ");
		winCount++;
		round++;}
	} else if(chooseMove.equalsIgnoreCase("Paper")) {
			System.out.print("You chose paper"); //put ASCII art of paper etc here
			if(evilGen == 1) {
				
				System.out.println("\nEvil chose \"Rock\". You WIN this round!! Yippee");
				round++;
				winCount++;
			} else if(evilGen == 2) {
				
				System.out.println("\nEvil chose \"Scissors\". You lost this round :'(  ");
				round++;
			} else {
			System.out.println("\nEvil also chose \"Paper\". No one wins this round :( ");
			}}	System.out.print("Choose your move! \"Rock\", \"Paper\", \"Scissors\"\n\n"+winCount+"/3"+"\n>");}
//System.out.println("You just destroyed humanity.......... :(.");}
//not too sure how to make it that the user can try again solli boss & how to make what evil answered at the end of the final round


if(winCount==2) {
	System.out.println("You defeated EVILDEVIL_POLLUTER16!! You won a very luxurious car worth $19999996 :D"); //pop up window saying "yay"
	popUp++;
} else {
	System.out.println("You just destroyed humanity :(. Would you like to try again? Enter Y to continue or number 2 to exit.");
	popUp++;
	
}
	}}} //this one is not the right way of course
