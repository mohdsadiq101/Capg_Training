package com.cg.OneToMany;

import jakarta.persistence.*;

@Entity
public class Answer { // Inverse Side
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int aid;
    private String answer;
    // This is Owning side annotation coz it contains
    @ManyToOne
    @JoinColumn(name = "ques_id")
    private Question ques;

    public Answer(){}

    public Answer(String answer, Question ques) {
        this.ques = ques;
        this.answer = answer;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Question getQues() {
        return ques;
    }

    public void setQues(Question ques) {
        this.ques = ques;
    }

}
