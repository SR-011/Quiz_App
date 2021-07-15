package com.shakib.bdlabit.quiz.database;

import io.realm.RealmObject;

public class QuestionDB extends RealmObject {

    private String correctAns;
    private String explanation;
    private String mark;
    private String options1;
    private String options2;
    private String options3;
    private String options4;
    private String qsn;
    private String qsnNumber;


    public QuestionDB() {
    }

    public String getCorrectAns() {
        return correctAns;
    }

    public void setCorrectAns(String correctAns) {
        this.correctAns = correctAns;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getOptions1() {
        return options1;
    }

    public void setOptions1(String options1) {
        this.options1 = options1;
    }

    public String getOptions2() {
        return options2;
    }

    public void setOptions2(String options2) {
        this.options2 = options2;
    }

    public String getOptions3() {
        return options3;
    }

    public void setOptions3(String options3) {
        this.options3 = options3;
    }

    public String getOptions4() {
        return options4;
    }

    public void setOptions4(String options4) {
        this.options4 = options4;
    }

    public String getQsn() {
        return qsn;
    }

    public void setQsn(String qsn) {
        this.qsn = qsn;
    }

    public String getQsnNumber() {
        return qsnNumber;
    }

    public void setQsnNumber(String qsnNumber) {
        this.qsnNumber = qsnNumber;
    }
}
