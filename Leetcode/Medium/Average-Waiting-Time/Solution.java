class Solution {
    public double averageWaitingTime(int[][] customers) {
        double totalwaittime = 0;
        int lastTime = 0;

        for(int i = 0; i < customers.length; i++){
            if(lastTime > customers[i][0]){
                double waittime = lastTime + customers[i][1] - customers[i][0];
                totalwaittime += waittime;
                lastTime += customers[i][1];
            }else{
                totalwaittime += customers[i][1];
                lastTime = customers[i][0] + customers[i][1];
            }
        }

        return totalwaittime / (double) customers.length;
    }
}