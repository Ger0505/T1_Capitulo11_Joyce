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
public class Loan implements LoanConstants{
    private Integer number;
    private String last_name;
    private Integer amount_loan;
    protected Double rate;
    private Integer term;

    public Loan(Integer number, String last_name, Integer amount_loan, Integer term) {
        this.number = number;
        this.last_name = last_name;
        if(amount_loan<=MAX_LOAN)
            this.amount_loan = amount_loan;
        else
            this.amount_loan = 0;
        if(term == LONG_TERM || term==MEDIUM_TERM)
            this.term = term;
        else
            this.term = SHORT_TERM;
    }

    @Override
    public String toString() {
        return "Loan{" + "number=" + number + ", last_name=" + last_name + ", amount_loan=" + amount_loan + ", rate=" + rate + ", term=" + term + '}';
    }
    
    
}
