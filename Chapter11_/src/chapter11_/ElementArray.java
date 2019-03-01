package chapter11_;

/**
 *
 * @author Gerardo A A
 */
public class ElementArray {
    public static void elementArray(){
        MetalElement metalElement = new MetalElement("Ag",12,12);
        NonMetalElement nonMetalElement = new NonMetalElement("O",16,2);
        metalElement.describeElement();
        nonMetalElement.describeElement();
    }
}
