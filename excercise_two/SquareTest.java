package excercise_ss07_abstract_interface.excercise_two;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(6);
        System.out.println(square);

        square.howToColor();
    }

}
