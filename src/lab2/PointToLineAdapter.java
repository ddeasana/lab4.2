package lab2;

// Adapter class to adapt Point interface to Line interface

public class PointToLineAdapter implements ILine {
    private IPoint point1;
    private IPoint point2;

    public PointToLineAdapter(IPoint point1, IPoint point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    @Override
    public void SetFirstPair(double x1, double y1) {
        point1.setX((int) x1);
        point1.setY((int) y1);
    }

    @Override
    public void SetSecondPair(double x2, double y2) {
        point2.setX((int) x2);
        point2.setY((int) y2);
    }

    @Override
    public double[] GetCoordinates() {
        return null;
    }
}
