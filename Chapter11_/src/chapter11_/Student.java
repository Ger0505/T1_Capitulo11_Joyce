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
public abstract class Student {
    protected String name;
    protected Boolean status;

    public Student(String name, Boolean status) {
        this.name = name;
        this.status = status;
    }
    
    
    
    public abstract void tuition();

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", status=" + status + '}';
    }
    
    
}
