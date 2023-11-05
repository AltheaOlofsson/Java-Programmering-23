package exercises.solutionslocal;

class Circle {
    double radius = 1;

    Circle(double radius){
        this.radius = radius;
    }

    double computeArea(){
        double area = radius * radius * 3.14159;
        return area;

    }

    double computeCircum(){
        double circum = radius * (2*3.14159);
        return circum;
    }
    
}
class Rectangle{
    int base = 1;
    int height = 3;

    Rectangle(int base, int height){
        this.base = base;
        this.height = height;
    }

    int computeArea(){
        int area = height * base;
        return area;

    }
    int computePerimeter(){
        int perim = 2* (base * height);
        return perim;
    }


}
public class Geometry{
    public static void main(String[] args) {
        
        Circle c = new Circle(5);

        System.out.println(c.computeArea());

        System.out.println(c.computeCircum());

        Rectangle r = new Rectangle(2,5);

        System.out.println(r.computeArea());

        System.out.println(r.computePerimeter());

    }

}
