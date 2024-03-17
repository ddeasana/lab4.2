package lab2;


 public class Main {

     public static void main(String[] args) {

                // Create a Point
                IPoint point1 = new Point();
                IPoint point2 = new Point();
                point1.setX(10);
                point1.setY(20);
                point2.setX(30);
                point2.setY(40);


                // Create a Line and adapt the Point to Line interface
                ILine line = new PointToLineAdapter(point1, point2);
                line.SetFirstPair(11.5, 22.5); // Here we're setting X using double value
                line.SetSecondPair(33.5, 44.5); // Here we're setting Y using double value

                // You can also access the point's coordinates after adaptation
                System.out.println("Point coordinates after adaptation:");
                System.out.println("X: " + point1.getX()); // Cast to access specific methods
                System.out.println("Y: " + point1.getY());

     }
 }
