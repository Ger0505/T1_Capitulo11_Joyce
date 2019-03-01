package chapter11_;

/**
 *
 * @author Gerardo A A
 */
public abstract class Element {
    protected String symbol;
    protected Integer number;
    protected Integer weight;

    public Element(String symbol, Integer number, Integer weight) {
        this.symbol = symbol;
        this.number = number;
        this.weight = weight;
    }
    
    public abstract void describeElement();
    
}
