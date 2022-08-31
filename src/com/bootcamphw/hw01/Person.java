package com.bootcamphw.hw01;

abstract public class Person {
    protected String firstName;
    protected String lastName;
    protected String emailAdress;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    abstract public String getFullName() ;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    abstract public String getGreeting();

    public void setEmailAdress(String s){
        this.emailAdress=s;
    }

    public String getEmailAdress(){
        return this.emailAdress;
    }
}

