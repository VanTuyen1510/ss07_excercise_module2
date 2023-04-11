package excercise_ss07_abstract_interface.excercise_one;

public class ShapeArray {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(3,2);
        for (Shape shape : shapes){
            double percent = 100 * Math.random();
            shape.resize(percent);
        }
    }
}
