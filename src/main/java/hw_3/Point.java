package hw_3;

public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void print() {
        System.out.println(getX() + "," + getY());
        // TODO: тут лучше через геттеры или обращаться напрямую к переменным?
    }

}
