public class LeastTwiceInArray {
    public static Boolean AtLeastTwiceInArray(int arr[]) {

        for (int i = 1; i < arr.length; i++) {

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1 };
        int arr1[] = { 1, 2, 3, 4 };
        int arr2[] = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        System.out.println(AtLeastTwiceInArray(arr));
        System.out.println(AtLeastTwiceInArray(arr1));
        System.out.println(AtLeastTwiceInArray(arr2));

    }

}