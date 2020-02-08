import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
 Given a list of daily temperatures T, return a list such that, for each day in the input, tells you how many days you would have to wait until a warmer temperature. If there is no future day for which this is possible, put 0 instead.

For example, given the list of temperatures T = [73, 74, 75, 71, 69, 72, 76, 73], your output should be [1, 1, 4, 2, 1, 1, 0, 0].

Note: The length of temperatures will be in the range [1, 30000]. Each temperature will be an integer in the range [30, 100].
 */
public class Task739DailyTemperatures {

    public int[] dailyTemperatures(int[] T) {
        runner(T, 0, 1);
        return T;
    }

    public void runner(int[] T, int index, int amountOfDaysToHotterWether) {

        if (!(T[index] <= T[amountOfDaysToHotterWether])) {

            if (amountOfDaysToHotterWether < T.length - 1) {
                amountOfDaysToHotterWether++;
                runner(T, index, amountOfDaysToHotterWether);
            }
        } else {
            if (index < T.length - 1) {
                T[index] = amountOfDaysToHotterWether;
                runner(T, index + 1, 1);
            }
        }


    }

}
