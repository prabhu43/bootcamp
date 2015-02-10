/**
 * Created by Prabhu on 2/9/15.
 */
public class Rectangle extends Shape{
    int length, breadth;

    public Rectangle(int length, int breadth) throws InvalidDimensionException {
        if (length < 0 || breadth < 0) {
            throw new InvalidDimensionException("Dimension Values should be greater than 0!!");
        }
        this.length = length;
        this.breadth = breadth;

    }

    @Override
    public int getPerimeter() {
        if (length < 0 || breadth < 0) {
            //throw Exception
            throw new NumberFormatException();
        }
        return 2 * (length + breadth);
    }

    @Override
    public int getArea() {
        if (length < 0 || breadth < 0) {
            //throw Exception
            throw new NumberFormatException();
        }
        return length * breadth;
    }
}
