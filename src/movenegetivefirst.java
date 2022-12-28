public class movenegetivefirst {
    public static void main(String[] args) {
        int arr[] = {1,232,1,32,1,-1,1 ,-100};
        int n =  arr.length;
        sortEl(arr, n);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void sortEl(int arr[] , int n) {
        int j = 0 , temp;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0){
                if (arr[i] != arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
              
            }
          
        }
    }
}
