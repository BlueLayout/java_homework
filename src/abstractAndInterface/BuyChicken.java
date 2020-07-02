package abstractAndInterface;

/**
 * @author devin
 */
public class BuyChicken {
    public static void main(String[] args) {
        int count = 0;
        for (int cock=0;cock<=20;cock++){
            for (int hen=0;hen<=33;hen++){
                for (int chicken=0;chicken<=300;chicken=chicken+3){
                    if (cock+hen+chicken==100&&5*cock+3*hen+chicken/3==100){
                        count++;
                        System.out.println("case"+count+":");
                        System.out.println("cock:"+cock+",hen:"+hen+",chicken:"+chicken);
                    }
                }
            }
        }
    }
}
