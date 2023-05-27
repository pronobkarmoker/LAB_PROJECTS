public class Circle implements Shape{
    final double pi= 3.1416;
    double side = 5;

    @Override
    public double CalculateArea() {
        System.out.println("Area : " + pi * side *side );
        return 0 ;
    }
}
