import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task739DailyTemperatures {

    public int[] dailyTemperatures(int[] T) {
        runner(T,0,1);
        return T;
    }
    public void runner(int [] T, int index, int amountOfDaysToHotterWether) {

        if(!(T[index] <= T[amountOfDaysToHotterWether])) {

            if(amountOfDaysToHotterWether< T.length-1){
                amountOfDaysToHotterWether++;
                runner(T, index, amountOfDaysToHotterWether);
            }
        } else {
            if(index < T.length-1){
                T[index] = amountOfDaysToHotterWether;
                runner(T, index+1, 1);
            }}


    }

}
