package com.company;
import java.util.Scanner;

public class Playground {
    public String name;
    public String address;
    public double PricePerHour;
    public String OwnerName;
    int[] Hours = new int[24];
    Scanner sin = new Scanner(System.in);
    Scanner cin = new Scanner(System.in);
    Playground(){
        name="null";
        address="null";
        PricePerHour=0.0;
        OwnerName ="null";

        int i= 0 ;
   while (  i < 24   )
        {
            Hours[i]= 0;
            i++;
        }
 }


    public void setName(String nam )
    {
        name =nam;
    }
    public String getName()
    {
        return name;
    }
    public void setAddress(String addre )
    {
        address =addre;
    }
    public String getAddress()
    {
        return address;
    }
    public void setPricePerHour(String addre )
    {
        address =addre;
    }
    public double getPricePerHour()
    {
        return PricePerHour;
    }
    public void setNameOwner(String nam )
    {
        OwnerName =nam;
    }
    public String getNameOwner()
    {
        return OwnerName;
    }
    public void PlayRejected()
    {
        System.out.println(" please  Enter Name ");
        name  = cin.nextLine();
        System.out.println(" please  Enter address ");
        address  = cin.nextLine();
        System.out.println(" please  Enter price ");
        PricePerHour  = sin.nextInt();
        System.out.println(" please  Enter name owner ");
        OwnerName = cin.nextLine();

    }
    public void showPlaygroundinfo() {
        System.out.println(" Name :" + name);
        System.out.println(" Address : " + address);
        System.out.println(" Price per hour : " + PricePerHour );
        System.out.println(" Owner Name: " + OwnerName);

    }
    public boolean bookingslot(int start , int end ){
        int x= start-1  ;
        while (x < end ){
            if (Hours[x] == 1) {
               System.out.println("Unavailable");
               return false ;
            }
            x++;
        }
        x= start ;
        while (x<end){
            Hours[x]=1 ;
            x++;
        }
        return true;
    }
    public void Cancellation(int start , int end ){
        int x= start-1  ;
        while (x<end ){
          Hours[x]=0;
          x++;
        }
        System.out.println("Cancellation succeeded");
    }
 public void equal (Playground x ){
      name =x.name;
      address=x.address;
      PricePerHour= x.PricePerHour;
      OwnerName=x.OwnerName;
      int i = 0;
   while (i<24) {
       Hours[i]= x.Hours[i];
       i++;
   }
 }
 public void delete(){
     name="";
     address="";
     PricePerHour=0.0;
     OwnerName ="";

     int i= 0 ;
     while (  i < 24   )
     {
         Hours[i]= 0;
         i++;
     }
 }

}
