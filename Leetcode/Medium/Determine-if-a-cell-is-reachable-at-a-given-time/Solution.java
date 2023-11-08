import java.util.*;

class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {


        int xDist = Math.abs(sx - fx);
        int yDist = Math.abs(sy - fy);

        if(xDist == 0 && yDist == 0 && t == 1) return false;

        return t >= xDist && t >= yDist; 
    }
}