public class Square {
    private int sideLength;

    public Square(int sideLength) 
    {
        this.sideLength = sideLength;
    }

    public int perimeter()
    {
        return (4 * sideLength);
    }
    public int area()
    {
    		return (sideLength*sideLength);
    }
}
