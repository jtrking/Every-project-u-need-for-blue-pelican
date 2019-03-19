
public class Circle
    {
    public double radius;
    public Circle(double r)
    {
    radius = r;
    }
    public double diameter()
    {
    return radius*2;
    }
    public double area()
    {
     
            double a = Math.PI * radius * radius;
            return a;
     
    }
     public double circumference( ) 
    {
        double c = 2 * Math.PI * radius;
        return c;
    }
}