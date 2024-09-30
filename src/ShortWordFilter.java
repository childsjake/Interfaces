public class ShortWordFilter implements Filter
{


    @Override
    public boolean accept(Object x)
    {
        if (x instanceof String)
        {
            String s = (String)x;
            return s.length() < 5;
        }
        return false;
    }
}
