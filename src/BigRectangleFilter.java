import java.awt.*;

public class BigRectangleFilter implements Filter
{
    @Override
    public boolean accept(Object x)
    {
        if (x instanceof Rectangle)
        {
            Rectangle r = (Rectangle) x;
            int perimeter = (r.width + r.height) * 2;
            return perimeter > 10;
        }
        return false;
    }
}
