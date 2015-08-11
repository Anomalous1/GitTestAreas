public class areas{

        //takes two parameters. computes the area of a rectangle
        public static double rectangle( double x, double y)
        {
                return (x*y);
        }

        //takes the radius. computes the area of a circle
        public static  double circle( double r )
        {
                return (Math.PI*(r*r));
        }

        //prints
        public void print(double result)
        {
                System.out.println(result);
        }
}
