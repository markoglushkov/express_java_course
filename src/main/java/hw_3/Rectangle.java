package hw_3;


public class Rectangle {
    int width;
    int height;

    public Rectangle(int width, int height) {
     this.height = height;
     this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int calculateArea() {
         return this.width * this.height;
    }
}
