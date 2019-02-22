
package quiz;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Paolo Scattolin s1023775 
 * @author Johan Urban s1024726
 */

public class InOut {
    private String input;
    private int scoreRound1;
    private int scoreRound2;
    Scanner scan = new Scanner(System.in);
    List<Question> questions = new LinkedList<>();
    List<Question> incorrectlyAnswered = new LinkedList<>();
    
    public InOut(){

        questions.add(new OpenQuestion("What is the  complexity of a "
                + "binary search?", "O(log N)", 2));
        questions.add(new OpenQuestion("What is the minimal amount of "
                + "constructors for a Java class?", "0"));
        questions.add(new MultipleChoiceQuestion(
                "What is the best achievable complexity of in situ sorting ?",
                new String [] { "O(N^2)", "O(N log N)", "O(N)", "O(log N)"}
                ,1, 4));
        questions.add(new ThisThatQuestion("Is there a difference between an"
                + " interface and an abstract class?", "Yes", "No", 1));
    }
        
    public void start(){
        System.out.println("ROUND 1\n");
        
        for (Question q : questions){
            System.out.println(q);
            input = scan.nextLine();
            if(!q.isCorrect(input)){
                incorrectlyAnswered.add(q.duplicate());
            }
            else{
                System.out.println("Correct! You get " + q.getPoints() 
                        + " points!");
                scoreRound1 += q.getPoints();
            }
         }
        
        System.out.println("ROUND 2\n");
        
        for(Question q : incorrectlyAnswered){
            System.out.println(q);
            input = scan.nextLine();
            if(!q.isCorrect(input)){
                System.out.println(q.correctAnswer());
            }
            else{
                System.out.println("Correct! You get " + q.getPoints() 
                        + " points!");
                scoreRound2 += q.getPoints();
            }
        }
        int totalScore = scoreRound1 + scoreRound2;
        System.out.println("\nRound 1: " + scoreRound1 + "\nRound 2: " 
                + scoreRound2 + "\nTOTAL: " + totalScore);
    }
}
