/**
 * @program: 2022-3-8
 * @description
 * @author: WJJ
 * @create: 2022-03-08 20:21
 **/
class Shape{
    public void draw(){

    }
}
class Cycle extends Shape{
    @Override
    public void draw() {
        System.out.println("画一个圆");
    }
}
class React extends Shape{
    @Override
    public void draw() {
   System.out.println("画一个矩形");
    }
}


public class TestDemo {
    public static void drawShape(Shape shape) {
        shape.draw();
    }

    public static void main(String[] args) {
       Shape shape1=new Cycle();
       Shape shape2=new React();
       shape1.draw();
       shape2.draw();
    }
    public static void drawShapes() {
        // 我们创建了一个 Shape 对象的数组.
        Shape[] shapes = {new Cycle(), new React(), new Cycle(),
                new React()};
        for (Shape shape : shapes) {
            shape.draw();
        }
    }

}
 