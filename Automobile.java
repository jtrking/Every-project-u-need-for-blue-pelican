public class Automobile
{   
    public Automobile(double m) 
    {
        double mpg = m;
        double gallons;
    }
    public void fillUp(double f)
    {
        gallons += f;
    }
    public void takeTrip(double t) 
    {
        gallons -= t / mpg;
    }
    public double reportFuel() 
    {
        double r = gallons;
        return r;
    }
    public double mpg;
    public double gallons;
}
