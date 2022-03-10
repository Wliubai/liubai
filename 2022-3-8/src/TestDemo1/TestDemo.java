package TestDemo1;

/**
 * @program: 2022-3-8
 * @description  抽象类
 * @author: WJJ
 * @create: 2022-03-09 13:38
 **/
abstract class Shape{
    public void draw(){

    }
}
class Cycle extends Shape {
    @Override
    public void draw() {
        System.out.println("画一个圆");
    }
}
class React extends Shape {
    @Override
    public void draw() {
        System.out.println("画一个矩形");
    }
}
public class TestDemo {
    public static void drawMap(Shape shape){
        shape.draw();
    }
    public static void main(String[] args) {
        Shape shape1=new Cycle();
        Shape shape2=new React();
        drawMap(shape1);
        drawMap(shape2);

    }

}
