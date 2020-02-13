public class Task1154DayOfTheYear {

    /*
    Given a string date representing a Gregorian calendar date formatted as YYYY-MM-DD, return the day number of the year.

    date.length == 10
    date[4] == date[7] == '-', and all other date[i]'s are digits
    date represents a calendar date between Jan 1st, 1900 and Dec 31, 2019.

     */

    class Solution {
        public int dayOfYear(String date) {
            int result = 0;
            int[] daysInMounthes = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
            String[] dateTable = date.split("-");
            int[] dateTableInt = new int[3];
            for (int i = 0; i<3; i++) {
                dateTableInt[i] = Integer.parseInt(dateTable[i]);
            }
            for(int i = 1; i<dateTableInt[1]; i++){
                result+=daysInMounthes[i-1];
            }
            if(dateTableInt[1]>2 && dateTableInt[0]%4==0 && dateTableInt[0] > 1900) result++;

            return result+dateTableInt[2];
        }
    }
}
