package Package_IntList;

import java.util.Arrays;

public class IntArrayList implements IntList{


    private int[] numbers = new int[10];
    private static int counter=0;



    public int[] getNumbers() {
        return numbers;
    }



    public static int getCounter() {
        return counter;
    }

    @Override
    public void addNumber(int number) {
        if(counter<numbers.length) {
            numbers[counter] = number;
        }else{

            int[] numbers2 = new int[(int)(1.5*numbers.length)];
            for(int i=0;i<numbers.length;i++){
                numbers2[i]=numbers[i];
            }
            numbers2[counter] = number;
            numbers = numbers2;
        }
        counter++;
    }

    @Override
    public int getNumber(int id) {
        return numbers[id];
    }


}
