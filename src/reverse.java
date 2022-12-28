public class reverse {
    public static void rev(int arr[]) {
        int start = 0 ;
        int end =  arr.length -1;
        while (start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,3};
        for (int i : arr) {
            System.out.print(arr[i] + "  ");
        }
        rev(arr);
        System.out.println("after reversing --");
        for (int i =0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
    }
}
