import java.util.*;

class SmallestInfiniteSet {
    PriorityQueue<Integer> removedInt; 
    PriorityQueue<Integer> addedInt; 
    int smallest;
    public SmallestInfiniteSet() {
        removedInt = new PriorityQueue<Integer>(Collections.reverseOrder()); 
        addedInt = new PriorityQueue<Integer>();
    }
    
    public int popSmallest() {
        
        if(removedInt.size() == 0){
            removedInt.add(1);
            addedInt.remove(1);
            return 1;
        }else{
            int next;
            if(addedInt.size() == 0){
                next = removedInt.peek() + 1;
            }else{
                //System.out.println("Added: " + addedInt.toString());
                //System.out.println("Removed: " + removedInt.toString());
                if(addedInt.peek() <= removedInt.peek() + 1){
                    next = addedInt.poll();
                }else{
                    next = removedInt.peek() + 1;
                }
            }
            removedInt.add(next);
            return next;
        }
    }
    
    public void addBack(int num) {
        if(removedInt.contains(num)){
            removedInt.remove(num);
            addedInt.add(num);
        }
        
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */