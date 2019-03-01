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
public class Rental {
     public static final int MINUTES_PER_HOUR=60;
    public static final int HOURLY_RATE = 40;
    public static final int EXTRA_MIN = 1;
    
    private String contact_number;
    private int hours_rental;
    private int extra_minutes;
    private int price;
    private Equipment equipment;
    private Integer base;

    public Rental(String contact_number, Integer minutes,Equipment equipment) {
        setContact_number(contact_number);
        setHoursAndMinutes(minutes);
        this.equipment = equipment;
        this.price = base+this.equipment.getFee();
    }

    public Rental() {
        setContact_number("A000");
        setHoursAndMinutes(0);
    }
    
    

    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }

    public void setHoursAndMinutes(int minutes) {
        this.hours_rental = minutes/60;
        this.extra_minutes = minutes%60;
        this.base = this.hours_rental*HOURLY_RATE+this.extra_minutes;
    }

    public String getContact_number() {
        return contact_number;
    }

    public int getHours_rental() {
        return hours_rental;
    }

    public int getExtra_minutes() {
        return extra_minutes;
    }

    public int getPrice() {
        return price;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public Integer getBase() {
        return base;
    }
    
    

    @Override
    public String toString() {
        return "Rental{" + "contact_number=" + contact_number + ", hours_rental=" + hours_rental + ", extra_minutes=" + extra_minutes + ", price=" + price + '}';
    }
}
