import java.util.*;

/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
class NestedIterator implements Iterator<Integer> {
    Queue<Integer> q = new LinkedList<Integer>();
    
    public NestedIterator(List<NestedInteger> nestedList) {
        for(NestedInteger ni : nestedList){
            createQueue(ni);
        }
    }
    
    public void createQueue(NestedInteger ni){
        if(ni.isInteger()){
            q.add(ni.getInteger());
        }else{
            for(NestedInteger newNi : ni.getList()){
                createQueue(newNi);
            }
        }
    }

    @Override
    public Integer next() {
        return q.poll();
    }

    @Override
    public boolean hasNext() {
        return !q.isEmpty();
    }
    
    
}

class NestedInteger{
    Integer value;
    List<NestedInteger> list;
    
    public NestedInteger(Integer value){
        this.value = value;
    }

    public NestedInteger(List<Integer> l){
        list = new ArrayList<NestedInteger>();
        for(Integer i : l){
            list.add(new NestedInteger(i));
        }
    }

    public boolean isInteger(){
        return list == null || list.size() == 0;
    }

    public Integer getInteger(){
        return value;
    }

    public List<NestedInteger> getList(){
        return list;
    }

}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */