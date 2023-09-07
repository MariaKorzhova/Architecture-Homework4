public class Rectangle implements IShape{
    private double s1;
    private double s2;

    public Rectangle(double s1, double s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    @Override
    public double getArea() {
        return s1 * s2;
    }

    @Override
    public double getPerimeter() {
        return (s1 + s2) * 2;
    }

}
