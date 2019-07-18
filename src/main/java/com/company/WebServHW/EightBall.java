package com.company.WebServHW;
import java.util.*;

public class EightBall {
    Scanner scan = new Scanner(System.in);
    private String question = scan.nextLine();
    private String answer;


    public EightBall(){

    }

    public EightBall(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public EightBall(String answer) {
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
