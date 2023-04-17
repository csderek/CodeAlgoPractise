import java.io.*;
import java.util.*;

class Solution{
    
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);

        int t;
        t = Integer.parseInt(br.readLine());
        for(int i = 1; i <= t; i++){
            Solution s = new Solution();
            int result = s.countLap();
            out.println("Case #" + i + ": " + result);
        }
        out.close();
    }

    private int countLap() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);

        String nextln = br.readLine();
        int length = Integer.parseInt(nextln.split(" ")[0]);
        int round = Integer.parseInt(nextln.split(" ")[1]);

        String prevDir = "";

        int lap = 0;
        int remainDist = 0;
        while(round > 0){
            String nextRec = br.readLine();
            int dist = Integer.parseInt(nextRec.split(" ")[0]);
            String dir = nextRec.split(" ")[1];

            if(prevDir.equals(dir)){
                dist = dist + remainDist;
            }else{
                dist = dist - remainDist;
            }

            lap = lap + dist/length;
            remainDist = dist % length;
            prevDir = dir;
            round--;
        }

        return lap;
    }
}