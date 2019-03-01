package chapter11_;

/**
 *
 * @author Gerardo A A
 */
public abstract class GeometricFigure {
    protected Integer height;
    protected Integer width;
    protected String figure;
    protected Double area;
  
    
    public abstract Double area();

    @Override
    public String toString() {
        return "GeometricFigure{" + "height=" + height + ", width=" + width + ", figure=" + figure + ", area=" + area + '}';
    }
    
    
}
