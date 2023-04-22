class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == 0) return 0;
        if(divisor == 1) return dividend;
        if(dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        if(divisor == -1) return -dividend;


        int negative = ((dividend < 0 && divisor > 0) || (divisor < 0 && dividend > 0)) ? -1 : 1; 

        int count = 0;


        int pdividend = dividend < 0 ? dividend : -dividend ;
        int pdivisor =  divisor < 0 ? divisor : -divisor;

        //System.out.println(pdividend);
        //System.out.println(divisor);

        while(pdividend <= pdivisor){
            pdividend = pdividend - pdivisor ;
            count++;
        } 

        return negative * count;
    }
}