package chapter11_;

/**
 *
 * @author Gerardo A A
 */
public class WeekendSubscriber extends NewspaperSubscriber{
    
    public WeekendSubscriber(){
        setRate(0.0);
    }

    @Override
    public void setRate(Double rate) {
        this.rate = 2.00;
    }

    @Override
    public String toString() {
        return "WeekendSubscriber:\n"+super.toString();
    }
    
    
    
}
