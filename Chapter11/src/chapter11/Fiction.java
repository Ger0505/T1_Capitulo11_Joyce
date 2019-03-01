package chapter11;

/**
 *
 * @author Gerardo A A
 */
public class Fiction extends Book{

    public Fiction(String name) {
        super(name);
        setPrice();
    }
    

    @Override
    public void setPrice() {
        this.price = 24.99;
    }
    
}
