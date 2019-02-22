/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

/**
 *
 * @author jubi
*/
public class ThisThatQuestion extends Question {
    private String question;
    private String answer;
    private String a1;
    private String a2;
    public ThisThatQuestion(String question, String answer1, String answer2
            , int correctAnswer, int score){
        super(score);
        this.question = question;
        if(correctAnswer == 1)
            answer = answer1;
        else
            answer = answer2;
        a1 = answer1;
        a2 = answer2;
    }
    
    public ThisThatQuestion(String question, String answer1, String answer2
            , int correctAnswer){
        super(-1);
        this.question = question;
        if(correctAnswer == 1)
            answer = answer1;
        else
            answer = answer2;
        a1 = answer1;
        a2 = answer2;
    }

    @Override
    public String toString() {
        return "Question: " + a1 + " " + a2 + ": " + question;
    }

    @Override
    public boolean isCorrect(String answer) {
        return this.answer.equalsIgnoreCase(answer);
    }

    @Override
    public String correctAnswer() {
        return "Correct answer is: " + answer;
    }
}
