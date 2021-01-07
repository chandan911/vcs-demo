public class Square {
    int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    public int perimeter()
    {
        return (4 * sideLength);
    }
}
