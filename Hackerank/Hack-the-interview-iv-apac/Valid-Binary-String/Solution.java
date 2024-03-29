import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'minimumMoves' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER d
     */

    public static int minimumMoves(String s, int d) {
        int l = d - 1;
        int count = 0;
        while(l < s.length()){
            String sub = s.substring(l - d + 1, l + 1);
            if(sub.lastIndexOf('1') > -1){
                l = l - d + 1 + sub.lastIndexOf('1') + d;
            }else{
                count++;
                l = l + d;
            }
        }
        
        return count;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int d = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.minimumMoves(s, d);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
