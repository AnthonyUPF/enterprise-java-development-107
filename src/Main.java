import Package_Car.Car;
import Package_Car.Sedan;
import Package_Car.UtilityVehicle;
import Package_Car.Truck;


import Package_Video.TvSeries;
import Package_Video.Video;
import Package_Video.Movie;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.logging.SocketHandler;

public class Main {
    public static void main(String[] args) {
        BigDecimal number= new BigDecimal(4.2545).setScale(4, RoundingMode.HALF_UP);

        System.out.println(number);
        System.out.println(bigDecimalToDouble(number));

        BigDecimal number2= new BigDecimal(1.2345).setScale(4, RoundingMode.HALF_UP);

        System.out.println(number2);
        System.out.println(reverseBigDecimal(number2));

        Car car1=new Sedan(12345,"EU","M01",100);
        Car car2=new UtilityVehicle(34567,"Spain","M02",2000,true);
        Car car3=new Truck(34567,"Canada","M03",2000,500);

        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());

        Video video1=new Movie("Movie 1","HD",150,"Company 1",5,"Nexflix");
        Video video2=new TvSeries("Movie 2","4K",350,"Company 2","TV-5",1800);

        System.out.println(video1.toString());
        System.out.println(video2.toString());





    }

    public static double bigDecimalToDouble(BigDecimal number){
        return number.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public static BigDecimal reverseBigDecimal(BigDecimal number){
        return BigDecimal.ZERO.subtract(number.setScale(1, RoundingMode.HALF_UP));
    }



}