class Solution {
    public int myAtoi(String s) {
        char[] cArr = s.toCharArray();
        boolean hasfirstInteger = false;
        boolean negative = false;
        long result = 0;
        for(char c : cArr){
            if(!hasfirstInteger && c == '-'){
                negative = !negative;
                hasfirstInteger = true;
            }else if (!hasfirstInteger && c == '+'){
                hasfirstInteger = true;
                continue;
            }else if(c >= '0' && c <= '9'){
                hasfirstInteger = true;
                int num = negative ? -(c - '0') : (c - '0');
                result = result * 10 + num;
                if(result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
                if(result < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            }else if(hasfirstInteger  || c != ' '){
                break;
            }
        }
        return Math.toIntExact(result);
    }
}