public class Triangle implements IShape {
    private double s1;
    private double s2;
    private double s3;
    

    public Triangle(double s1, double s2, double s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    @Override
    public double getArea() {
        double p = (s1 + s2 + s3) / 2;
        return Math.sqrt(p * (p - s1) * (p - s2) * (p - s3));
    }

    @Override
    public double getPerimeter() {
        return s1 + s2 + s3;
    }

}
