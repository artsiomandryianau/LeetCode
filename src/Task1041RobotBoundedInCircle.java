public class Task1041RobotBoundedInCircle {

    /*
    On an infinite plane, a robot initially stands at (0, 0) and faces north.  The robot can receive one of three instructions:

    "G": go straight 1 unit;
    "L": turn 90 degrees to the left;
    "R": turn 90 degress to the right.

The robot performs the instructions given in order, and repeats them forever.

Return true if and only if there exists a circle in the plane such that the robot never leaves the circle.

     */
    public static boolean isRobotBounded(String instructions) {

        char direktion = 'N';
        char[] commands = instructions.toCharArray();
        int x =0;
        int y =0;

        for(int i = 0; i<commands.length; i++){
            if(commands[i]!='G'){
                direktion = changeDirection(direktion, commands[i]);
            } else {
                if(direktion == 'N'){
                    y++;
                } else {
                    if(direktion == 'E'){
                        x++;
                    } else {
                        if(direktion == 'S'){
                            y--;
                        } else {
                            x--;
                        }
                    }
                }
            }
        }



        return (x==0 && y==0) || direktion != 'N';
    }

    public static char changeDirection(char currentDirection, char instruktion){

        if(currentDirection == 'N'){
            if(instruktion == 'L') {return 'W';} else {return 'E';}
        } else {
            if(currentDirection == 'W') {
                if(instruktion == 'L') {return 'S';} else {return 'N';}
            } else {
                if(currentDirection == 'S'){
                    if(instruktion == 'L') {return 'E';} else {return 'W';}
                } else {
                    if(instruktion == 'L') {return 'N';} else {return 'S';}
                }
            }
        }
    }
}
