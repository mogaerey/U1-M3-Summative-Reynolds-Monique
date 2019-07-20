package com.company.WebServHW;
import java.util.*;

public class Magic {
    private String answer;
    private String question;

    public Magic(String question, String answer) {
        this.question = question;
        this.answer = answer;


    }

    public Magic(String answer) {
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
