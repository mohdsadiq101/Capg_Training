package com.cg.OneToMany;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Question { // Owning Side
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int qid;
    private String quesName;
    private String level;
    // This is Inverse Side annotation coz its mapping the answer which is inverse side
    @OneToMany(mappedBy = "ques", cascade = CascadeType.ALL) // mapped by creates a bidirectional relation which maps the ques object directly with the answer thus not creating a 3rd table, but it's not a good practice
    private List<Answer> answer;

    public Question(){}

    public Question(String quesName, String level) {
        this.quesName = quesName;
        this.level = level;
    }

    public int getQid() {
        return qid;
    }

    public void setQid(int qid) {
        this.qid = qid;
    }

    public String getQuesName() {
        return quesName;
    }

    public void setQuesName(String quesName) {
        this.quesName = quesName;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public List<Answer> getAnswer() {
        return answer;
    }

    public void setAnswer(List<Answer> answer) {
        this.answer = answer;
    }
}
