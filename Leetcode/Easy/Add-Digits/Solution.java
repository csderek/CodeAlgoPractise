class Solution {
    public int addDigits(int num) {
        while(num >= 10){
            int newN = num;
            int cur = 0;
            while(newN > 0){
                cur = cur + newN % 10;
                newN = newN / 10;
            }

            num = cur;

        }
        return num;
    }
}