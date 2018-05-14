import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Functions extends GreenPlanet{
	//checkAnswer function
	public static void checkAnswer(String userAnswer, HashMap<String, Integer> answers, HashSet<Integer> uniqueNumber) {
		if(userAnswer.matches("a") || userAnswer.matches("b") || userAnswer.matches("c") || userAnswer.matches("d")) {
			for(int z = 0; z< 3; z++) {
				//if userAnswer doesn't match key, it will be stuck in while loop until the key matches
				//then get the value of the key
				while(!(userAnswer.matches(key))) {
					key = (String) answers.keySet().toArray()[z];
				}
			}
			//then if key matches BUT value of key doesn't match correctAnswer.get(randomQuestion).toString() then wrong
			if(answers.get(key).toString().matches("3")) 
				{System.out.println("Correct!");}
			else System.out.println("Wrong");
		}
		else if ((userAnswer.equalsIgnoreCase("s")) && !(skipCount >=3)) {
			skip(userAnswer, maxSkipped, answers, randomQuestion, uniqueNumber);
		}
		else if (userAnswer.equalsIgnoreCase("E")) {
			exit(userAnswer);
		}
	}	
	
	//skip function
	public static void skip(String userAnswer, int maxSkipped, HashMap<String,Integer> answers, int randomQuestion, HashSet<Integer> uniqueNumber) {
		ArrayList L1Q = Questions.getLevel1Q();	
		ArrayList<String>[][] L1A = Answers.getLevel1A();
		ArrayList uniqueAnswer = new ArrayList();		
		Scanner skipInput = new Scanner(System.in);
		 if ((userAnswer.equalsIgnoreCase("s")) && !(skipCount >=3)) {
			skipCount++;
		}
		 else if ((userAnswer.equalsIgnoreCase("s") && skipCount>=3)) {
			 while((userAnswer.equalsIgnoreCase("s"))&& skipCount>=3) {
					System.out.println(L1Q.get(maxSkipped));
					
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
						String showAnswer = L1A[maxSkipped][randomAnswer].toString().replaceAll("[\\[\\]]","").replace(",", "");
						System.out.println(key + "."+ showAnswer);
						
						answers.put(key, randomAnswer);
					}	
					userAnswer = skipInput.nextLine();
					checkAnswer(userAnswer, answers, uniqueNumber);
				}
			 randomQuestion = (int)(Math.random()*L1Q.size());
				
				if(uniqueNumber.contains(randomQuestion)) {
					while(uniqueNumber.contains(randomQuestion)) {
						uniqueNumber.add(randomQuestion = (int)(Math.random()*L1Q.size()));
					}	
					 if(!(uniqueNumber.contains(randomQuestion)))	uniqueNumber.add(randomQuestion);
				}
				else if(!(uniqueNumber.contains(randomQuestion)))	uniqueNumber.add(randomQuestion);
		 }
	}
	
	
	//exit function
	public static boolean exit(String userAnswer) {
		if(userAnswer.equalsIgnoreCase("e")) {
			return true;
		}
		else return false;
	}
}
