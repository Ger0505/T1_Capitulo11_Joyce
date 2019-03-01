/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter11_;

/**
 *
 * @author Gerardo A A
 */
public class PersonalLoan extends Loan{
    
    public PersonalLoan(Integer number, String last_name, Integer amount_loan, Integer term) {
        super(number, last_name, amount_loan, term);
        this.rate = 0.02;
    }
    
}
