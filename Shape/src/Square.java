public class Square implements Shape{
    double side = 5;
    @Override
    public double CalculateArea() {
        System.out.println("Area : " +  side *side );
        return 0 ;
    }
}
