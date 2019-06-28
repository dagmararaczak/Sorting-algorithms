package sorting;

public class SortUtils {

    private SortUtils() {

    }


    public static void swap(int arr[], int i, int j) {
        int a = arr[i];
        arr[i] = arr[j];
        arr[j] = a;
    }


    public static void swap(float arr[], int i, int j) {
        float a = arr[i];
        arr[i] = arr[j];
        arr[j] = a;
    }


    public static void swap(double arr[], int i, int j) {
        double a;
        a = arr[i];
        arr[i] = arr[j];
        arr[j] = a;
    }




}
