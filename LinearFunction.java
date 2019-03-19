public class LinearFunction implements LinearFunctionMethods{
        public double getSlope(double slope)
        {double slop= slope;
        return slop;} 
        public double getYintercept(double yIntc)
        {double yint= yIntc;
        return yint;} 
        public double getRoot(double slope,double yIntc)
        {double root = slope / yIntc;
        return root;} 
        public double getYvalue(double x,double slope,double yIntc)
        {double kr=slope*x+yIntc;
        return kr;} //return the y value corresponding to x 
        public double getXvalue(double y,double slope,double yIntc)
        {double mt=y-yIntc/slope;
        return mt;}//return the x value corresponding to y
}