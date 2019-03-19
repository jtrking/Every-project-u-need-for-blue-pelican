public class Compute_This
{
    public static void main(String args[])
    {
    double a= 3;
    int b=187;
    int c=122;
    double d=14.72;
    double f=3.801;
    double g=72;
    
    double ac=Math.toRadians(b);
    double ad=Math.toRadians(c);
    
    double bb=Math.sin(ac);
    double bc=Math.cos(ad);
    
    double ab=Math.PI;
    double ae=Math.abs(bc);
    double cc=Math.pow(d,f);
    double dd=Math.log(g);
    
    double ans=(a*ab)*(bb);
    
    System.out.println("d1 =  " + (ans+ae));
    System.out.println("d1 =  " + (cc+dd));
    
    }
}
