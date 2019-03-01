package chapter11_;

/**
 *
 * @author Gerardo A A
 */
public abstract class Auto {
    protected String make;
    protected Integer price;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public Integer getPrice() {
        return price;
    }

    public abstract void setPrice();
    
    
}
