import java.util.*;
import javax.swing.JOptionPane;
public class GreenPlanet {
	static ArrayList L1Q = Questions.getLevel1Q();	
	static int skipCount = 0;
	static int randomNumber = (int)(Math.random()*L1Q.size());
	static ArrayList<String>[][] L1A = Answers.getLevel1A();
	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);					
	
		HashSet<Integer> uniqueNumber = new HashSet<Integer>();
	
		
		//LEVEL 1
		for(int x = 1; x<6; x++) {
			
			int randomNumber = (int)(Math.random()*L1Q.size());
			
			if(uniqueNumber.contains(randomNumber)) {
				while(uniqueNumber.contains(randomNumber)) {
					uniqueNumber.add(randomNumber = (int)(Math.random()*L1Q.size()));
				}				
			}
			else if(!(uniqueNumber.contains(randomNumber)))	uniqueNumber.add(randomNumber);
			
			String correctAns = "";
			System.out.println("Question " + x);
			System.out.println("Random Number: " + randomNumber);
			System.out.println(L1Q.get(randomNumber));
			for(int y = 0; y < 4; y++) {
				String divs = L1A[randomNumber][y].toString().replaceAll("[\\[\\]]","").replace(",", "");
				System.out.println(divs);
			}			
			correctAns =L1A[randomNumber][4].toString().replaceAll("[\\[\\]]","");
			
			
			System.out.println(!(skipCount>=3)?"To skip, type 'S' or 's'" + "\tSkips left: "+ skipCount + "/3": "No more skips left");
			
			String userAnswer = userinput.nextLine();
			String functions = userAnswer;
			while((userAnswer.matches("S") || userAnswer.matches("s") )&& skipCount>=3) {
				System.out.println("Question " + x);
				skip(userAnswer);
			}
			if (userAnswer.matches(correctAns)) {
				System.out.println("correct!");
			}
			else if ((functions.matches("S") || functions.matches("s") ) && !(skipCount >=3)) {
				skip(functions);
			}
			else if ((functions.matches("E")|| functions.matches("e"))) {
				exit(functions);
			}
			else {
				System.out.println("WRONG!");
			}
			if (exit(functions) == true) {
				break;
			}
		}
		
		//LEVEL 2
		
	}
	
	public static void skip(String userAnswer) {
		ArrayList L1Q = Questions.getLevel1Q();	
		ArrayList<String>[][] L1A = Answers.getLevel1A();
		Scanner skipInput = new Scanner(System.in);
		while((userAnswer.matches("S") || userAnswer.matches("s") )&& skipCount>=3) {
			System.out.println(L1Q.get(randomNumber));
			for(int y = 0; y < 4; y++) {
				String divs = L1A[randomNumber][y].toString().replaceAll("[\\[\\]]","").replace(",", "");
				System.out.println(divs);
			}	
			userAnswer = skipInput.nextLine();
		}
		 if ((userAnswer.matches("S") || userAnswer.matches("s") ) && !(skipCount >=3)) {
			skipCount++;
			System.out.println("skipCount:" + skipCount);
		}
	}
	
	public static boolean exit(String userAnswer) {
		if(userAnswer.matches("E")||userAnswer.matches("e")) {
			return true;
		}
		else return false;
	}
}

