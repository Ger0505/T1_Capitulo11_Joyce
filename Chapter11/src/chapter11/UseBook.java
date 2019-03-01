package chapter11;

/**
 *
 * @author Gerardo A A
 */
public class UseBook {
    public static void useBook(){
        Fiction fiction = new Fiction("NADA");
        NonFiction nonFiction = new NonFiction("DON QUIJOTE DE LA MANCHA");
        
        System.out.println(fiction.toString());
        System.out.println(nonFiction.toString());
    }
}
