package lab2;

/**Concreate implementaton of Line*/
public class Line implements ILine {
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    /**Overriding the super method*/
    @Override
    public void SetFirstPair(double x1, double y1) {
        this.x1 = x1;
        this.y1 = y1;
    }

    /**Overriding the super method*/
    @Override
    public void SetSecondPair(double x2, double y2) {
        this.x2 = x2;
        this.y2 = y2;
    }


}



