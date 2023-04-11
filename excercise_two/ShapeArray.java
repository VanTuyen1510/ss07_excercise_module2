package excercise_ss07_abstract_interface.excercise_two;

public class ShapeArray {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Square();

        for (Shape shape: shapes) {
            if(shape instanceof Circle){
                System.out.println("Diện tích hình tròn " + ((Circle) shape).getArea());
                ((Circle) shape).howToColor();
            }else if(shape instanceof Rectangle){
                System.out.println("Diện tích hình chữ nhật " + ((Rectangle) shape).getArea());
                ((Rectangle) shape).howToColor();
            }else if(shape instanceof Square){
                System.out.println("Diện tích hình vuông " + ((Square) shape).getArea());
                ((Square) shape).howToColor();
            }else {
                System.out.println("Do not display information !    ");
            }
        }
    }

}
