import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Prabhu on 2/9/15.
 */
public class SquareTest {
    private Square square;

    @Test
    public void shouldReturnAreaOfSquare() {
        square = new Square(1);
        assertEquals(1, square.getArea());
    }

    @Test(expected = InvalidDimensionException.class)
    public void shouldThrowExceptionForNegativeDimensions() {
        square = new Square(-1);
    }

    @Test
    public void shouldReturnSquarePerimeter() {
        square = new Square(1);
        assertEquals(4, square.getPerimeter());
    }


}
