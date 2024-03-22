package Assignment1.Q2;

public class Rectangle {
    private double length;
    private double width;

    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    
    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    
    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    
    public double calculateArea() {
        return length * width;
    }

   
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    
    public static void main(String[] args) {
        
        Rectangle rectangle = new Rectangle(5, 4);

        
        rectangle.setLength(6);
        rectangle.setWidth(3);

        
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }

}
