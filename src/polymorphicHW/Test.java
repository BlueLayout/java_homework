package polymorphicHW;

public class Test {
    public static void main(String[] args) {
        BlackWhitePrinter blackWhitePrinter = new BlackWhitePrinter();
        blackWhitePrinter.print();
        ColorPrinter colorPrinter = new ColorPrinter();
        colorPrinter.print();
        colorPrinter.print("blue","red");
    }
}
