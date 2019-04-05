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

    // Height
    public double getHeight() { // getter for height
        return this.height;
    }

    public void setHeight(double height) { // setter for height
        this.height = height;
    }

    // Test Methods
    public double getArea() { // Calculates and returns the area of the rectangle object
        return this.width * this.height;
    }

    public double getPerimeter() { // Calculates and returns the perimeter of the rectangle object
        return 2*(this.width + this.height); // Same as width+width+height+height
    }

}