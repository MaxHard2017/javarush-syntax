package level5.task0513;

public class Rectangle
{
    int top;
    int left;
    int width;
    int height;
    
    public void initialize (int top, int left, int width, int height)
    {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public void initialize (int top, int left)
    {
        this.top = top;
        this.left = left;
        this.width = 0;
        this.height = 0;
    }
    public void initialize (int top, int left, int width)
    {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = width;
    }
    public void initialize (Rectangle r)
    {
        this.top = r.top;
        this.left = r.left;
        this.width = r.width;
        this.height = r.height;
    }


}

