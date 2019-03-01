package chapter11;

/**
 *
 * @author Gerardo A A
 */
public class OutgoingPhoneCall extends PhoneCall{
    private Integer time;

    public OutgoingPhoneCall(String phone_number,Integer time) {
        super(phone_number);
        this.time = time;
        this.price = 0.04;
    }    
    
    @Override
    public String getPhoneNumber() {
        return this.phone_number;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }

    @Override
    public void display() {
        System.out.println("Numero:"+this.phone_number+" Precio:"+this.price+" Total: $"+this.price*this.time);
    }
}
