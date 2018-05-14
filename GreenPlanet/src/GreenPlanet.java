import java.util.*;
import javax.swing.JOptionPane;
import java.io.IOException;
public class GreenPlanet {
	static ArrayList L1Q = Questions.getLevel1Q();	
	static int skipCount = 0;
	static int randomQuestion = (int)(Math.random()*L1Q.size());
	static int maxSkipped = 0;
	static String key = "";
	
	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);	
		ArrayList<String>[][] L1A = Answers.getLevel1A();
		ArrayList uniqueAnswer = new ArrayList();
		HashMap<String, Integer> answers = AnswerSequence.getAnswers();
		HashSet<Integer> uniqueNumber = new HashSet<Integer>();		
		
		
		//LEVEL 1
		for(int x = 1; x<16; x++) {		
			uniqueAnswer = new ArrayList();
			//randomizing questions appearing
			int randomQuestion = (int)(Math.random()*L1Q.size());
			
			if(uniqueNumber.contains(randomQuestion)) {
				while(uniqueNumber.contains(randomQuestion)) {
					uniqueNumber.add(randomQuestion = (int)(Math.random()*L1Q.size()));
				}	
				 if(!(uniqueNumber.contains(randomQuestion)))	uniqueNumber.add(randomQuestion);
			}
			else if(!(uniqueNumber.contains(randomQuestion)))	uniqueNumber.add(randomQuestion);
			
			//Printing questions
			int correctAns = 0;
			System.out.println("Question " + x);
			System.out.println(L1Q.get(randomQuestion));
			
			//Printing answers
			for(int y = 0; y < 4; y++) {
				//randomizing answers appearing
				key = (String) answers.keySet().toArray()[y];
				int randomAnswer = (int)(Math.random()*4);	
				if(uniqueAnswer.contains(randomAnswer)) {
					while(uniqueAnswer.contains(randomAnswer)) {
						randomAnswer = (int)(Math.random()*4);
					}
					if (!(uniqueAnswer.contains(randomAnswer))) uniqueAnswer.add(randomAnswer);
				}
				else if (!(uniqueAnswer.contains(randomAnswer))) uniqueAnswer.add(randomAnswer);	
				String showAnswer = L1A[randomQuestion][randomAnswer].toString().replaceAll("[\\[\\]]","").replace(",", "");
				System.out.println(key + "."+ showAnswer);
				answers.put(key, randomAnswer);						
			}						
			System.out.println(!(skipCount>=3)?"To skip, type 'S' or 's'" + "\tSkips left: "+ skipCount + "/3": "No more skips left");
			
			String userAnswer = userinput.nextLine();
			
			while((userAnswer.equalsIgnoreCase("S"))&& skipCount>=3) {
				//when user has used up all skips
				//maxSkipped is to keep showing the same question even if the user keeps pressing 's'
				maxSkipped = randomQuestion;
				System.out.println("Question " + x);
				Functions.skip(userAnswer, maxSkipped, answers, randomQuestion, uniqueNumber);
			}
			//checking user's answer
			Functions.checkAnswer(userAnswer, answers, uniqueNumber);
		}
		//LEVEL 2
	}
}

