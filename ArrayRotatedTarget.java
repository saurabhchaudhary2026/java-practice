public class ArrayRotatedTarget {
    public static int halfRotatted(int arr[], int pivot, int target) {
        int n = arr.length;
        int resultarr[] = new int[n];
        int k = 0;

        for (int i = pivot; i < n; i++) {
            resultarr[k] = arr[i];
            k++;
        }
        for (int i = 0; i < pivot; i++) {
            resultarr[k] = arr[i];
            k++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }

        }
        return -1;
    }
    // public static void arrayFoundTarget(int arr[] ,int rotated){

    // }
    public static void main(String[] args) {
        int pivot = 3;
        int arr[] = { 0, 1, 2, 4, 5, 6, 7 };
        int target =3;
         System.out.println(halfRotatted(arr, pivot,target));

        // for(int num : result){
        // System.out.print(num + " ");
        // }

    }
}
