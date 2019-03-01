package chapter11_;

/**
 *
 * @author Gerardo A A
 */
public class WeekDaySubscriber extends NewspaperSubscriber{
    
    public WeekDaySubscriber(){
        setRate(0.0);
    }

    @Override
    public void setRate(Double rate) {
      this.rate = 3.50;
    }

    @Override
    public String toString() {
        return "WeekDaySubscriber:\n"+super.toString();
    }
    
    
    
}
