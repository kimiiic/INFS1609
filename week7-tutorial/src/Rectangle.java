public class Rectangle{
    // 2 double data fields with width and height
    private double width;
    private double height;

    // Constructors
    public Rectangle() {

    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Methods
    // width
    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // height
    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // test methods
    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return 2*(this.width + this.height);
    }

}