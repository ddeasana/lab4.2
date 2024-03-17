package lab2;


/** Concrete implementation of Point*/
public class Point implements IPoint {
    private int x;
    private int y;

    /**Overriding the super method*/
    @Override
    public void setX(int x) {
        this.x = x;
    }

    /**Overriding the super method*/
    @Override
    public void setY(int y) {
        this.y = y;
    }

    /**Overriding the super method*/
    @Override
    public int getX() {
        return x;
    }

    /**Overriding the super method*/
    @Override
    public int getY() {
        return y;
    }
}
