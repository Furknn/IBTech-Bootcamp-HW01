package com.bootcamphw.hw01;

public class Test {
    public static void main(String[] args) {
        var employee= new Employee(201,"Erkan","Ocaklı",5740);
        employee.setEmailAdress("erkan@godoro.com");
        sendEmail(employee);
    }

    public static void sendEmail(Person person){
        System.out.println("Kime: "+person.getEmailAdress());
        System.out.println("Konu: "+person.getGreeting());
        System.out.println("Gövde: "+person.getFullName());

    }
}