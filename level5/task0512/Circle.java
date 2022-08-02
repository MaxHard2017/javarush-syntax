package level5.task0512;

public class Circle
{
    int centerX = 0;
    int centerY = 0;
    int radius = 0;
    int width = 0;
    int color =0;
    public void initialize(int centerX, int centerY, int radius)
    {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }
    public void initialize(int centerX, int centerY, int radius, int width)
    {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
    }
    public void initialize(int centerX, int centerY, int radius, int width, int color)
    {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }


    public static void main(String[] args) {
        Circle cl = new Circle();
        cl.initialize(1, 1, 1, 1, 1);
        cl.centerX = 2;

    }    
}
