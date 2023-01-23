package Assignment.Shapes;

public class Square extends Shape {
    private int side;
    
    public Square(int side) {
        super("Square");
        this.side = side;
    }

    public double calculateArea() {
        return side * side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
