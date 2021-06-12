package com.company;
import java.util.Scanner;

public class User {

    Scanner cin = new Scanner(System.in);
    protected String Name;
    protected String Mail;
    protected String PhoneNumber;
    protected String Password;
    protected String Address;
    protected String ID;
    protected String DateOfBirth;

    User(){
        Name = "";
        Mail = "";
        Password="";
        PhoneNumber = "";
        Address = "";
        ID = "";
        DateOfBirth = "";
    }

    public void register() {
        System.out.println("please enter your name: \n");
        Name = cin.nextLine();
        System.out.println("please enter your Password: \n");
        Password = cin.nextLine();
        System.out.println("please enter your mail: \n");
        Mail = cin.nextLine();
        System.out.println("please enter your PhoneNumber: \n");
        PhoneNumber = cin.nextLine();
        System.out.println("please enter your address: \n");
        Address = cin.nextLine();
        System.out.println("please enter your governmental ID: \n");
        ID = cin.nextLine();
        System.out.println("please enter your birthdate: \n");
        DateOfBirth = cin.nextLine();
        System.out.println("login successful \n");




    }

}