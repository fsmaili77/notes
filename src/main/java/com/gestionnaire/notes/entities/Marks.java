package com.gestionnaire.notes.entities;

import java.util.Scanner;

public class Marks {
    int roll_no;
    int subject1;
    int subject2;
    int subject3;


    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public int getSubject1() {
        return subject1;
    }

    public void setSubject1(int subject1) {
        this.subject1 = subject1;
    }

    public int getSubject2() {
        return subject2;
    }

    public void setSubject2(int subject2) {
        this.subject2 = subject2;
    }

    public int getSubject3() {
        return subject3;
    }

    public void setSubject3(int subject3) {
        this.subject3 = subject3;
    }

    public void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of subject1");
        this.subject1 = sc.nextInt();
        System.out.println("Enter the marks of subject2");
        this.subject2 = sc.nextInt();
        System.out.println("Enter the marks of subject3");
        this.subject3 = sc.nextInt();
        /*System.out.println("Enter the roll number");
        this.roll_no = sc.nextInt();*/
    }

    public float getAverage() {
        float avg = (getSubject1() + getSubject2() + getSubject3()) / 3;
        return avg;
    }

    public void printAverage() {
        System.out.println("The average is : " + getAverage());
    }

    /*public void printRollNum() {
        System.out.println("The roll number of the student is: " + getRoll_no());
    }*/
}
