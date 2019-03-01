package chapter11_;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gerardo A A
 */
public class Subscribers {
   public static void suscribers(){
       int option;
       String a;
       ArrayList<NewspaperSubscriber> person = new  ArrayList<>();
       Scanner scanner = new Scanner(System.in);
       do{
           System.out.println("----------");
           System.out.println("1. SevenDay");
           System.out.println("2. WeekDay");
           System.out.println("3. Weekend");
           System.out.println("4. Quit");
           System.out.println("----------");
           System.out.print("Opción:");
           option = scanner.nextInt();
           switch(option){
               case 1: SevenDaySubscriber seven = new SevenDaySubscriber();
                        System.out.print("Dirección:");
                        a = scanner.next();
                        seven.setAdress(a);
                        if(!isEquals(person, seven)){
                            person.add(seven);
                        }else
                            System.out.println("Direccion ya utilizada");
                       break;
               case 2:  WeekDaySubscriber week= new WeekDaySubscriber();
                        System.out.print("Dirección:");
                        a = scanner.next();
                        week.setAdress(a);
                        if(!isEquals(person, week))
                            person.add(week);
                        else
                            System.out.println("Direccion ya utilizada");
                       break;
                case 3:  WeekendSubscriber weekend = new WeekendSubscriber();
                        System.out.print("Dirección:");
                        a = scanner.next();
                        weekend.setAdress(a);
                        if(!isEquals(person, weekend))
                            person.add(weekend);
                        else
                            System.out.println("Direccion ya utilizada");
                       break;
                case 4: break;
           }
       }while(option !=4);
       
       for(NewspaperSubscriber n:person){
           System.out.println(n.toString());
       }
   } 
   
   private static Boolean isEquals(ArrayList<NewspaperSubscriber> persons,NewspaperSubscriber person){
       Boolean aux = false;
       for(NewspaperSubscriber p:persons){
           if(p.equals(person))
               aux=true;
       }
       return aux;
   }
}
