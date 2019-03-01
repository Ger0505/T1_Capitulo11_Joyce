package chapter11_;

/**
 *
 * @author Gerardo A A
 */
public class Ford extends Auto{

    public Ford(){
        this.make = "Ford";
        setPrice();
    }
    
    @Override
    public void setPrice() {
       this.price = 22000;
    }
    
}
