/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter11.caseproblems;

/**
 *
 * @author Gerardo A A
 */
public class Waitstaff extends Employee{

    public Waitstaff(){
        setJob_title();
    }
    
    

    @Override
    public void setPay_rate(Double pay_rate) {
        if(pay_rate<=10)
            this.pay_rate=pay_rate;
    }

    @Override
    public void setJob_title() {
        this.job_title = "Waitstaff";
    }
    
}
