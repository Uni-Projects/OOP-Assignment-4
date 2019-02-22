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
public class OpenQuestion extends Question {
    private String question;
    private String answer;
    
    public OpenQuestion(String question, String answer, int score)
    {
        super(score);
        this.question = question;
        this.answer = answer;

    }
    
    public OpenQuestion(String question, String answer){
        super(-1);
        this.question = question;
        this.answer = answer;
    }
    
    @Override
    public String toString(){
        return "Question: " + question;
    }
    
    @Override
    public boolean isCorrect(String answer){
        return this.answer.equalsIgnoreCase(answer);
    }
    
    @Override
    public String correctAnswer(){
        return "Correct answer is: " + answer;
    }
}
