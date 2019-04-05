public class Rectangle{
    // Spec: 2 double data fields
    private double width; // width
    private double height; // height

    // CONSTRUCTORS
    // Default Constructor
    public Rectangle() { // Creates rectangle of 1x1
        this.width = 1;
        this.height = 1;
    }

    public Rectangle(double width, double height) {
        this.width = width; // set attribute width to input width
        this.height = height; // set attribute height to input height
    }

    // METHODS
    // Width
    public double getWidth() { // getter for width
        return this.width;
    }

    public void setWidth(double width) { // setter for width
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