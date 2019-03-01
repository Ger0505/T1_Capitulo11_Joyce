package chapter11_;

/**
 *
 * @author Gerardo A A
 */
public abstract class Division {
    protected String name;
    protected Integer number;

    public Division(String name, Integer number) {
        this.name = name;
        this.number = number;
    }
    
    public abstract void display();
}
