package com.map;
import javax.persistence.*;
import java.util.List;

@Entity
public class Question1 {
    @Id
    @Column(name = "question_id")
    private int questionId;
    private String question;
   @OneToMany(mappedBy="question")
    private List<Answer1> answers;

    public int getquestionId() {
        return questionId;
    }

    public void setquestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getquestion() {
        return question;
    }

    public void setquestion(String question) {
        this.question = question;
    }

    public List<Answer1> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer1> answers) {
        this.answers = answers;
    }

    public Question1(int questionId, String question, List<Answer1> answers) {
        this.questionId = questionId;
        this.question = question;
        this.answers = answers;
    }

    public Question1() {
    }
}
