import java.util.*;
class Solution {
    public int minCostConnectPoints(int[][] points) {
        List<int []> distanceList = new ArrayList<>();

        for(int i = 0; i < points.length; i++){
            for(int j = 0; j < points.length; j++){
                if(i == j) continue;

                int dist = Math.abs(points[i][0] - points[j][0]) + Math.abs(points[i][1] - points[j][1]);

                int[] distArr = {dist, i , j};

                distanceList.add(distArr);
            }
        }

        Collections.sort(distanceList, (a, b) -> Integer.compare(a[0], b[0]));

        int[] parentNode = new int[points.length];

        for(int i = 0; i < parentNode.length; i++){
            parentNode[i] = i;
        }

        int result = 0;
        int line = 0;

        for(int[] dist : distanceList){
            

            if(line == points.length - 1) break;


            

            int firstP = findParent(parentNode, dist[1]);
            int secondP = findParent(parentNode, dist[2]);

            if(firstP != secondP){
                System.out.println("Point 1: " + dist[1]);
                System.out.println("Point 2: " + dist[2]);
                parentNode[firstP] = secondP;
                result = result + dist[0];
                line++;
            }


            
        }

        return result;


    }

    public int findParent(int[] parentArr, int value){
        if(parentArr[value] == value) return value;

        parentArr[value] = findParent(parentArr, parentArr[value]);

        return parentArr[value];
    }
}