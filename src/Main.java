import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        BigDecimal number= new BigDecimal(4.2545).setScale(4, RoundingMode.HALF_UP);

        System.out.println(number);
        System.out.println(bigDecimalToDouble(number));

        BigDecimal number2= new BigDecimal(1.2345).setScale(4, RoundingMode.HALF_UP);

        System.out.println(number2);
        System.out.println(reverseBigDecimal(number2));


    }

    public static double bigDecimalToDouble(BigDecimal number){
        return number.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public static BigDecimal reverseBigDecimal(BigDecimal number){
        return BigDecimal.ZERO.subtract(number.setScale(1, RoundingMode.HALF_UP));
    }

}