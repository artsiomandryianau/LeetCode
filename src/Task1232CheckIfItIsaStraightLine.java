import java.math.BigDecimal;
import java.math.RoundingMode;

/*

You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate of a point.
Check if these points make a straight line in the XY plane.
 */
public class Task1232CheckIfItIsaStraightLine {

    public static boolean checkStraightLine(int[][] coordinates) {

        if(coordinates.length == 2) return true;
        BigDecimal cosinusFirst = BigDecimal.valueOf((coordinates[1][0] -coordinates[0][0])/
                Math.sqrt(Math.pow(coordinates[1][1]-coordinates[0][1],2)+ Math.pow(coordinates[1][0]-coordinates[0][0], 2))).setScale(4, RoundingMode.HALF_UP);
        BigDecimal cosinusIndex = new BigDecimal(0.0);
        for(int i = 2; i < coordinates.length; i++){
            cosinusIndex =  BigDecimal.valueOf(((coordinates[i][0] -coordinates[0][0])/
                    Math.sqrt(Math.pow(coordinates[i][1]-coordinates[0][1],2)+ Math.pow(coordinates[i][0]-coordinates[0][0], 2)))).setScale(4, RoundingMode.HALF_UP);
            if(!cosinusFirst.equals(cosinusIndex)) return false;

        }
        return true;
    }


}
