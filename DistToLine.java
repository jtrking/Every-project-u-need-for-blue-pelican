
public class DistToLine
{
    public static double A,B,C;
    
    public static double getDist(double a, double b)
    {
        double getDist = Math.abs(A*a +B*b + C) / Math.sqrt( Math.pow(A,2)+Math.pow(B,2)); 
        return getDist;
    }
}