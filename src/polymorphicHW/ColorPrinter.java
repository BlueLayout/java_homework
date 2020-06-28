package polymorphicHW;

/**
 * @author devin
 */
public class ColorPrinter extends BlackWhitePrinter {


    @Override
    void print() {
        super.print();
    }

    void print(String... colors){
        System.out.println("colour printing");
        for (String color:colors
             ) {
            System.out.println(color);
        }
    }

}
