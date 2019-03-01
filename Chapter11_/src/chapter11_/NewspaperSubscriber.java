package chapter11_;

/**
 *
 * @author Gerardo A A
 */
public abstract class NewspaperSubscriber {
    protected String adress;
    protected Double rate;

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Double getRate() {
        return rate;
    }

    public abstract void setRate(Double rate);
    
    public Boolean equals(NewspaperSubscriber subscriber){
       if(subscriber.getAdress().equals(this.adress)){
           return true;
       }else
           return false;
    }

    @Override
    public String toString() {
        return "NewspaperSubscriber{" + "adress=" + adress + ", rate=" + rate + '}';
    }
    
    
}
