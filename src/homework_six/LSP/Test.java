package homework_six.LSP;
// Здесь показано, что Rectangle является подтипом QuadRangle,
// заменяется объектам Square, который тоже является подтипом QuadRangle, без негативных последствий
//для функциональности программы.
public class Test {
    public static void main(String[] args) {
        QuadRangle quadRangle = new Rectangle(5, 3);
        System.out.println("Rectangle" + " " + quadRangle.area());
        quadRangle = new Square(5);
        System.out.println("Square" + " " + quadRangle.area());

    }
}
