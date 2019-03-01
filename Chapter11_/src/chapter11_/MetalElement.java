package chapter11_;

/**
 *
 * @author Gerardo A A
 */
public class MetalElement extends Element{

    public MetalElement(String symbol, Integer number, Integer weight) {
        super(symbol, number, weight);
    }

    @Override
    public void describeElement() {
        System.out.println("Symbol:"+this.symbol+" Número Atómico:"+this.number+" Peso:"+this.weight);
    }
    
}
