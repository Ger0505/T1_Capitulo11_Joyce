package chapter11_;

/**
 *
 * @author Gerardo A A
 */
public class DemoTurners2 {
     public static void demoTurners(){
         Leaf leaf = new Leaf();
         Page page = new Page();
         Pancake pancake = new Pancake();
         Leaf leaf1 = new Leaf(){
             @Override
             public void turn() {
                 System.out.println("Pooping!!");
             }
            
         };
         Leaf leaf2 = new Leaf(){
             @Override
             public void turn() {
                 System.out.println("Piping!!");
             }
            
         };
         leaf.turn();
         page.turn();
         pancake.turn();
         leaf1.turn();
         leaf2.turn();
     }
}
