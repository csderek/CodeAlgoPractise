class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total = 0;
        int remain = 0;
        //boolean canDrink = true;
        while(true){
            
            total += numBottles;
            int drink = numBottles;

            if(drink + remain <  numExchange) break;
            numBottles = (drink + remain) / numExchange;
            remain = (remain + drink) % numExchange;
            

            //System.out.println("Remain: " + remain);
            //System.out.println("numBottles: " + numBottles);
            
        }

        
        return total;
    }
}