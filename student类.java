package com.zhynb.orgn;

public class student {
    private String number;
    private String name;
    private String xin;
    private int age;
    private double score;
    public student() {
    }
    public student(String number, String name, String xin, int age, double score) {
        this.number = number;
        this.name = name;
        this.xin = xin;
        this.age = age;
        this.score = score;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getXin() {
        return xin;
    }

    public void setXin(String xin) {
        this.xin = xin;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
