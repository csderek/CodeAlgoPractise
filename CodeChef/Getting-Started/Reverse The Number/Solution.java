import java.util.*;

class Solution{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int count = sc.nextInt();
        
        while(count-->0){
            int num = sc.nextInt();
            int result = 0;
            while(num > 0){
                result = result * 10 + num%10;
                num = num / 10;
            }
            System.out.println(result);
        }
    }
}