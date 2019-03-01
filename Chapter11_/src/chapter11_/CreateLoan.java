/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter11_;

import java.util.ArrayList;

/**
 *
 * @author Gerardo A A
 */
public class CreateLoan {
    public static  void createLoan(){
        ArrayList<Loan> array = new ArrayList<>(5);
        array.add(new BusinessLoan(123,"Acevedo",9000,Loan.LONG_TERM));
        array.add(new PersonalLoan(23,"Hernández",5700, Loan.SHORT_TERM));
        array.add(new BusinessLoan(100,"Arzola",9999,Loan.MEDIUM_TERM));
        array.add(new PersonalLoan(1,"Jesus",5000, Loan.SHORT_TERM));
        array.add(new BusinessLoan(111,"Ramón",800,10));
        
        for(Loan o:array){
            System.out.println(o.toString());
        }
    }
}
