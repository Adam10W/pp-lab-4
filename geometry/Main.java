package geometry;

public class Main {
    public static void main(String[] args) {
        Point center = new Point();
        ColoredCircle coloredCircle = new ColoredCircle(center, 5.0, "Żółty");

        System.out.println("Właściwości kolorowego koła:");
        System.out.println("Środek koła: (" + coloredCircle.getCenter().getX() + ", " + coloredCircle.getCenter().getY() + ")");
        System.out.println("Promień koła: " + coloredCircle.getRadius());
        System.out.println("Kolor koła: " + coloredCircle.getColor());
        System.out.println("Obwód koła: " + coloredCircle.calculatePerimeter());
    }
}
