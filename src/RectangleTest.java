import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

/**
 * Created by Prabhu on 2/9/15.
 */
public class RectangleTest {
    private Rectangle rectangle;

    @Test
    public void shouldReturnRectangleArea() {
        rectangle = new Rectangle(1, 1);
        assertEquals(1, rectangle.getArea());
    }

    @Test(expected = InvalidDimensionException.class)
    public void shouldThrowExceptionForNegativeDimensions() {
        rectangle = new Rectangle(-1, 1);
    }

    @Test
    public void shouldReturnRectanglePerimeter() {
        rectangle = new Rectangle(1, 1);
        assertEquals(4, rectangle.getPerimeter());
    }


}
