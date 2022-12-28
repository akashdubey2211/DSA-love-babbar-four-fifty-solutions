import java.util.*;
public class PriorityOue {
    public static void main(String[] args) {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        pq.add(2);
        pq.add(5);
        System.out.println(pq.size() + " size ");
        while (!pq.isEmpty()) {
            System.out.print(pq.peek() +" print ");
            pq.poll();
        }
    }
}
