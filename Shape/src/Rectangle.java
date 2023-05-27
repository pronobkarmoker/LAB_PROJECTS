public class Rectangle implements Shape{
    double side1 =5;
    double side2 = 4;
    @Override
    public double CalculateArea() {
        System.out.println("Area : " + side1 *side2 );
        return 0 ;
    }
}
