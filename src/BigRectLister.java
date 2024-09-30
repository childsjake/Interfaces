import java.awt.*;
import java.util.ArrayList;

public class BigRectLister
{

    public static void main(String[] args)
    {
        ArrayList<Rectangle> rectangles= new ArrayList<>();
        rectangles.add(new Rectangle(1,1));
        rectangles.add(new Rectangle(1,2));
        rectangles.add(new Rectangle(2,2));
        rectangles.add(new Rectangle(3,1));
        rectangles.add(new Rectangle(4,4));
        rectangles.add(new Rectangle(5,5));
        rectangles.add(new Rectangle(2,4));
        rectangles.add(new Rectangle(4,2));
        rectangles.add(new Rectangle(6,3));
        rectangles.add(new Rectangle(3,3));

        Filter filter = new BigRectangleFilter();

        System.out.println("Rectangles with big perimeter (>10) are: ");

        for (Rectangle rectangle : rectangles)
        {
            if(filter.accept(rectangle))
            {
                System.out.println("Rectangle: Width= " + rectangle.getWidth() + ", Height= " + rectangle.getHeight());
            }
        }
    }


}
