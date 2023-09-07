public class Main {
    public static void main(String[] args) {
        GeometryFigure figureBox = new GeometryFigure();
        Circle circle1 = new Circle(10);
        Circle circle2 = new Circle(20);
        figureBox.add(circle1);
        figureBox.add(circle2);
        Rectangle rectangle1 = new Rectangle(7, 15);
        Rectangle rectangle2 = new Rectangle(4, 8);
        figureBox.add(rectangle1);
        figureBox.add(rectangle2);
        Triangle triangle1 = new Triangle(2, 3, 4);
        Triangle triangle2 = new Triangle(5, 6, 7);
        figureBox.add(triangle1);
        figureBox.add(triangle2);

        figureBox.getInfo(0);

        figureBox.search(triangle1);
        figureBox.search(rectangle2);
        



    }
}