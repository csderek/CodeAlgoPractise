// We have populated the solutions for the 10 easiest problems for your support.
// Click on the SUBMIT button to make a submission to this problem.

import java.util.*;

class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int transaction = sc.nextInt();
        double saving = sc.nextDouble();
        
        if(transaction % 5 == 0 && transaction + 0.5 <= saving){
            System.out.println(saving - transaction - 0.5);
        }else{
            System.out.println(saving);
        }
        
    }
}

