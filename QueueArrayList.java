package Queue;
import java.util.*;
public class QueueArrayList<T> {
    List<T> queue = new ArrayList<>();
    public void push(T item){
        boolean ele = queue.add(item);
        System.out.println("Item inserted successfully");
    }
    public Object pop(){
        if (queue.isEmpty()) {
            return null;
        }
        String top = (String) queue.get(0);
        queue.remove(0);
        return (Object) top;
    }
    public Object peek(){
        if (queue.isEmpty()) {
            return null;
        }
        return (Object) queue.get(0);
    }
    public Boolean isEmpty(){
        return queue.isEmpty();
    }
    public int size() {
        return queue.size();
    }
    public int contain(Object item){
        int element = queue.indexOf(item);
        return element;
    }
}
