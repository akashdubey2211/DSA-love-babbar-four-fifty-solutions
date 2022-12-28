import java.util.HashSet;

public class Que_9_findUnionOfTwoArray {
    public static void main(String[] args) {
        int a[] = {12,1,42,1};
        int n = a.length;
        int b[] = {12,1,3,2};
        int m = b.length;
        System.out.println(findUnion(a,b,n,m));;

    }
    public static int findUnion(int a[] , int b[], int n, int m) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(a[i]);
        }
        for (int i = 0; i < m; i++) {
            set.add(b[i]);
        }
        return set.size();
    }
}
