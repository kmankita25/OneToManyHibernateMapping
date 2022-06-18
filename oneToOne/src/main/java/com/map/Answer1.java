package com.map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answer1 {
    @Id
    @Column(name = "answer_id")
    private int answer_id;
    private String answer;
    @ManyToOne
    private Question1 question;

    public int getAnswer_id() {
        return answer_id;
    }

    public void setAnswer_id(int answer_id) {
        this.answer_id = answer_id;
    }

    public String getAnswer() {
        return answer;
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }
    public Question1 getQuestion() {
        return question;
    }

    public void setQuestion(Question1 question) {
        this.question = question;
    }

    public Answer1(int answer_id, String answer) {
        this.answer_id = answer_id;
        this.answer = answer;

    }

    public Answer1() {
    }
}
