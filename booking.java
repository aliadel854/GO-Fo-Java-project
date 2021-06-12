package com.company;
import java.util.ArrayList;
public class booking {
    ArrayList<Playground>Grounds= new ArrayList<>(100);
    private  int coun;
    booking() {
        int i=0 ;
        Playground c = new Playground();
        while(i<100)
        {
            Grounds.add(c);
            i++;
        }

        coun = 0 ;
    }

    public void addPlayground( Playground x  )
    {

        Grounds.get(coun).PlayRejected();
        coun++;
        System.out.println("playGround added successfully");
    }
    public boolean deletePlayground(String nam)
    {
        int c = 0;
        int t = 0;
        while (t < coun) {
            if (Grounds.get(t).getName() == nam) {
                c = 1;
            }
            if (c == 1) {
                System.out.println("no playground with the name ");
                return false ;
            }
            else {
            Grounds.get(t).delete();

                System.out.println("playGround deleted successfully");
                return true;


        }
        }
        return true;
    }
    public void CancellationSlot (String nam, int sta , int en )
    {
        int x= 0;
        int i= 0 ;
        while ( i < coun ){
            if (Grounds.get(i).getName() == nam){
                Grounds.get(i).Cancellation(sta,en);
                x=1;
            }
            i++;
        }
        if ( x==0  ){
            System.out.println("no playground with the name ");
        }
    }
   public boolean bookingPlayground ( String nam, int sta , int en  )
   {
       int x= 0;
       int i= 0 ;
       while ( i < coun ){
           if (Grounds.get(i).name == nam){
               Grounds.get(i).bookingslot(sta , en);
               x=1;
           }
          i++;
       }
       if ( x==0 ){
           System.out.println("no playground with the name ");
           return false;
       }
       System.out.println("booking succeeded ");
       return true;
   }

}

