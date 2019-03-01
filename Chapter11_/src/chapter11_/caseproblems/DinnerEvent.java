/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter11_.caseproblems;

import java.util.ArrayList;

/**
 *
 * @author Gerardo A A
 */
public class DinnerEvent extends Event{
    public static final String[] menu1 ={"Sopa","Carne","Pastel"};
    public static final String[] menu2 ={"Sopa","Pescado","Pastel"};
    public static final String[] menu3 ={"Sopa","Ensalada","Pastel"};
    public static final String[][] menus ={menu1,menu2,menu3};
    private Integer no_menu;
    public static ArrayList<Employee> empleados = new ArrayList<>();

    public DinnerEvent(String event_number, Integer guests,Integer menu){
        super(event_number, guests);
        this.no_menu=menu;
    }

    public Integer getNo_menu() {
        return no_menu;
    }
    
    public void getMenu(){
       for(String s:menus[this.no_menu-1]){
           System.out.println(s);
       }
    }

    public void getEmpleados() {
        for(Employee emp:empleados){
            System.out.println(emp.toString());
        }
    }

    public void setEmpleados(Employee empleado) {
        empleados.add(empleado);
    }

    
    
    @Override
    public String toString() {
        return "DinnerEvent{" + "menu=" + menus[no_menu-1] + "}\n"+super.toString();
    }
    
}
