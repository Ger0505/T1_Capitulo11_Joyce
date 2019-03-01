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
public abstract class Employee {
    protected Integer ID;
    protected String last_name;
    protected String name;
    protected Double pay_rate;
    protected String job_title;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPay_rate() {
        return pay_rate;
    }

    public abstract void setPay_rate(Double pay_rate);

    public String getJob_title() {
        return job_title;
    }

    public abstract void setJob_title();

    @Override
    public String toString() {
        return "Employee{" + "ID=" + ID + ", last_name=" + last_name + ", name=" + name + ", pay_rate=" + pay_rate + ", job_title=" + job_title + '}';
    }
    
    
    
}
