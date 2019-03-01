package chapter11;

/**
 *
 * @author Gerardo A A
 */
public abstract class PhoneCall {
    protected String phone_number;
    protected Double price;

    public PhoneCall(String phone_number) {
        this.phone_number = phone_number;
        this.price = 0.0;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    
    public abstract String getPhoneNumber();
    public abstract Double getPrice();
    public abstract void display();
}
