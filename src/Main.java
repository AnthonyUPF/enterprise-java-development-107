import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        BigDecimal number= new BigDecimal(4.2545).setScale(4, RoundingMode.HALF_UP);

        System.out.println(number);
        System.out.println(bigDecimalToDouble(number));

        BigDecimal number2= new BigDecimal(1.2345).setScale(4, RoundingMode.HALF_UP);




    }

    public static double bigDecimalToDouble(BigDecimal number){
        return number.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }


}