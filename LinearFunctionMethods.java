public interface LinearFunctionMethods 
    { 
        double getSlope(double slope); 
        double getYintercept(double yIntc); 
        double getRoot(double slope,double yIntc); 
        double getYvalue(double x,double slope,double yIntc); //return the y value corresponding to x 
        double getXvalue(double y,double slope,double yIntc); //return the x value corresponding to y 
    } 