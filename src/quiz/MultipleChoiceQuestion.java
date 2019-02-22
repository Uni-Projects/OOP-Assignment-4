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
public class MultipleChoiceQuestion extends Question {
    private String question;
    char answer;
    private String[] answers;

    public MultipleChoiceQuestion(String question, String[] answers
            , int correctAnswer, int score){
        super(score);
        this.question = question;
        this.answers = answers;
        answer = (char) (97 + correctAnswer) ;

    }
    public MultipleChoiceQuestion(String question, String[] answers
            , int correctAnswer){
        super(-1);
        this.question = question;
        this.answers = answers;
        answer = (char) (97 + correctAnswer) ;
    }
    
    @Override
    public String toString(){
        String answerList = "";
        char el = 'a';
        for(String answer : answers){
            answerList += el + " " +answer + "\n";
            el++;
        }
        return "Question: " + question + "\n" + answerList;
    }
    
    @Override
    public boolean isCorrect(String answer){
        if(answer.length() == 1)
            return this.answer == Character.toLowerCase(answer.charAt(0));
        else
            return false;
    }
    
    @Override
    public String correctAnswer(){
        return "Correct answer is: " + answer;
    }
}
