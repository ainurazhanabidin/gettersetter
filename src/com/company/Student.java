package com.company;

public class Student {
    private String name;
    private String email;
    private int year;

    void setName(String a){
        name=a;

    }
    String getName(){
        return name;
    }
    void setEmail(String b){
        email=b;
    }
    String getEmail(){
        return email;
    }
    void setYear(int k) {
        if (k < 0) {
            System.out.println("jashy ters san bolbosh kerek");
        }else {
            year=k;
        }
    }
    int getYear(){
        return year;
    }

}
