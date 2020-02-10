public class Task1103DistributeCandiesToPeople {
    /*
    We distribute some number of candies, to a row of n = num_people people in the following way:

We then give 1 candy to the first person, 2 candies to the second person, and so on until we give n candies to the last person.

Then, we go back to the start of the row, giving n + 1 candies to the first person, n + 2 candies to the second person, and so on until we give 2 * n candies to the last person.

This process repeats (with us giving one more candy each time, and moving to the start of the row after we reach the end) until we run out of candies.  The last person will receive all of our remaining candies (not necessarily one more than the previous gift).

Return an array (of length num_people and sum candies) that represents the final distribution of candies.
     */
    public static int[] distributeCandies(int candies, int num_people) {
        int [] result = new int[num_people];
        for(int i =0; i < num_people; i++){
            result[i] = 0;
        }
        int portion = 0;
        //all the loops until we have enough candies for hole loop
        while(candies > portion * num_people + ((1+num_people)/2)*num_people) {
            for(int i =0; i < num_people; i++){

                    result[i] += ++portion;
                    candies-= portion;
            }
        }
        int index =0;
        //last loop
        while (candies > 0){    //last loop
            if(candies > portion){
                result[index] += ++portion;
                candies -= portion;
            } else {
                result[index]+= candies;
                candies =0;
            }
            index++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] bom = new int[4];
        bom = distributeCandies(16,4);
        for(int i =0 ; i< 4; i++) System.out.println(bom[i]);

    }
}
