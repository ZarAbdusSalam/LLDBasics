package encapsulation;

public class Rectangle {

    int lenght;
    int height;
//    int x;
//    int y;
    Point bottomLeft;

    double area(){
        System.out.println("area = " + (lenght*height));
        return 3.14*lenght*height;
    }

    void perimeter(){
        System.out.println("perimeter = " + (2*(lenght+height)));
    }

    void topRightCoordinates(){
        System.out.println("x = " + (bottomLeft.x + lenght));
        System.out.println("y = " + (bottomLeft.y + height));
    }

}
