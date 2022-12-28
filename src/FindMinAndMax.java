public class FindMinAndMax {
    public static void main(String[] args) {
        int arr[] = {1,2,42,1};
        findMinAndMax(arr);
    }
    public static void findMinAndMax(int arr[]){
        //edge cases handles
        if(arr.length == 0 || arr == null) return;
        int min = arr[0];
        int max = arr[0];
        for (int index = 1; index < arr.length; index++) {
            if(arr[index] < min){
                min = arr[index];
            }else if (arr[index] > max) {
                max = arr[index];
            }
        }
        System.out.println(min + ": minimum " + max +": maximum");
    }
}
