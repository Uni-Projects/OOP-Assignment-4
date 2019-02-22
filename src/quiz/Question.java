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
public abstract class Question {
    protected int score;
    private Question copy;

    public Question(int score){
        setScore(score);
        copy = this;
    }
    
    @Override
    public abstract String toString();
    
    public abstract boolean isCorrect(String answer);
            
    public abstract String correctAnswer();
    
    public void setScore(int s){
        if( s < 1 || s > 5)
            score = 3;
        else
            score = s;
    }
    
    public Question duplicate(){
        return copy;
    }
    
    public int getPoints(){
        return score;
    }
}
