package encapsulation;

public class RectangleClient {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.height=10;
        rect.lenght=20;

        Point p = new Point();
        p.x=2;
        p.y=3;

        rect.bottomLeft=p;

        System.out.println(rect.area());
        rect.perimeter();
        rect.topRightCoordinates();
    }
}
