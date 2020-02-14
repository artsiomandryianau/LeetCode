public class Task319BulbSwitcher {

    /*
    There are n bulbs that are initially off. You first turn on all the bulbs. Then, you turn off every second bulb.
    On the third round, you toggle every third bulb (turning on if it's off or turning off if it's on).
    For the i-th round, you toggle every i bulb.
    For the n-th round, you only toggle the last bulb. Find how many bulbs are on after n rounds.
     */
    public static int bulbSwitch(int n) {
        int result = 0;
        boolean[] lights = new boolean[n];
        for (int i =0; i<n; i++) { //first step
            lights[i] = true;
        }
        int step = 2;
        for(int i =1; i<n; i++){
            for(int j = step -1; j<n; j=j +step){
                lights[j] =changeState(lights[j]);
            }
            step++;
        }

        for (boolean state: lights) {
            if(state) result++;
        }
        return result;
    }

    public static boolean changeState(boolean light){
        if(light) {return  false;}
        else {
            return true;
        }
    }
}
