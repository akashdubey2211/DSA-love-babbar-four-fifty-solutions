public class movezerostofirst {
    public static void main(String[] args) {
        int arr[] = {2,3,4,0,2,0};
        int n  = arr.length;
        moveZerosFirst(arr, n);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
    public static void moveZerosFirst(int arr[], int n) {
        int j = 0;
        int temp;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<=0){
                if (arr[i] != arr[j]) {
                    temp = arr[i];
                    arr[i]= arr[j];
                    arr[j] = temp;

                }
                j++;
            }
        }
    }
}
