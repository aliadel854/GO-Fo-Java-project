package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stra = new Scanner(System.in) ;
         Scanner set = new Scanner(System.in) ;

         int  b ,x=5,a=0,st,en,f,g=0,m,ii=0,iii=0;
            String rt ;
        ArrayList<Playground> playg= new ArrayList<>(100);
        Playground c = new Playground();
        while(ii<100)
        {
            playg.add(c);
            ii++;
        }
        Playground pla = new Playground();
            booking book =new booking();
             User[] Users = new User[100];
            System.out.println("Welcome to GoFo System");

            System.out.println("enter the number of the function you want to perform");
            System.out.println("1 - for player");
            System.out.println("2 - for playground Owner");
            System.out.println("3 - for Exit");
           x =  set.nextInt();
           if( x==1 ) {
               User use = new User() ;
               use.register();
               Users[a] = use ;
               a++;
               System.out.println("1- for booking ");
               System.out.println("2- for CancellationSlot");
               m = set.nextInt();
               if( m==1) {
                   System.out.println("enter the name of blayground ");
                   String nameoFblayground;
                   nameoFblayground = stra.nextLine();
                   System.out.println("start hour");
                   st = set.nextInt();
                   System.out.println("End hour");
                   en = set.nextInt();
                   book.bookingPlayground(nameoFblayground, st, en);
               }
               if(m==2){
                   System.out.println("enter the name of blayground ");
                   String nameoFblayground;
                   nameoFblayground = stra.nextLine();
                   System.out.println("start hour");
                   st = set.nextInt();
                   System.out.println("End hour");
                   en = set.nextInt();
                   book.CancellationSlot(nameoFblayground, st, en);
               }
           }
            if( x==2 ){
                User owner = new User();
                owner.register();
                System.out.println("1 - for adding new playground");
                System.out.println("2 - for delete playground");

                f= set.nextInt();
                if (f==1){
                    playg.get(iii);
                    book.addPlayground(playg.get(iii));

                    iii++;
                }
                if(f==2){
                    System.out.println("1 - enter the name of playground");
                    rt = stra.nextLine();
                    book.deletePlayground(rt);
                    iii--;
                }
            }
    }
}
