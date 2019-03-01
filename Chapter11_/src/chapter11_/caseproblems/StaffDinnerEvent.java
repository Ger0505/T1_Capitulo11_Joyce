/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter11_.caseproblems;

import java.util.Scanner;

/**
 *
 * @author Gerardo A A
 */
public class StaffDinnerEvent {
    public static void staffDinnerEvent(){
        Integer N;
        Scanner scanner = new Scanner(System.in);
        System.out.print("No. de evento:");
        String number = scanner.next();
        System.out.print("No. de invitados:");
        Integer guests = scanner.nextInt();
        System.out.print("Menú [1-3]:");
        Integer menu = scanner.nextInt();
        DinnerEvent dinner = new DinnerEvent(number,guests,menu);
        if(dinner.getGuests()<10) N=1;
        else if(dinner.getGuests()<20) N=2;
        else N=3;
        
        for(int i =0;i<N;i++){
            System.out.println("Waitstaff "+(i+1));
            Employee empleado = new Waitstaff();
            empleado.setID(i);
            empleado.setName("Mario "+i);
            empleado.setLast_name("Acevedo "+i);
            empleado.setPay_rate(10.0);
            dinner.setEmpleados(empleado);
        }
        N = dinner.getGuests()/25;
        for(int i = 0;i<N;i++){
            System.out.println("Batender "+(i+1));
            Employee empleado = new Bartender();
            empleado.setID(i);
            empleado.setName("Kevin "+i);
            empleado.setLast_name("Gonzalez "+i);
            empleado.setPay_rate(13.0);
            dinner.setEmpleados(empleado);
        }
        Coordinator coordinator = new Coordinator();
        coordinator.setID(1);
        coordinator.setName("Timoti");
        coordinator.setLast_name("Sánchez");
        coordinator.setPay_rate(18.0);
        dinner.setEmpleados(coordinator);
        
        dinner.getEmpleados();
    }
}
