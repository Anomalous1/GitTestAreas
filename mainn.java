public class mainn
{
    public static void main(String[] args)
    {
        double X = 2, Y = 5;
        double R = 5;

        double rectangleArea;
        double circleArea;

        rectangleArea = areas.rectangle(X, Y);
        circleArea = areas.circle(R);
        System.out.println(rectangleArea);
        System.out.println(circleArea);
    }
}
