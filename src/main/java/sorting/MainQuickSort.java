package sorting;

public class MainQuickSort {

    public static void main(String[] args) {

        int[] array = {2,4,5,1,3,9,7,6};



        QuickSort quickSort = new QuickSort(array);

        System.out.println("Tablica przed sortowaniem : ");
        quickSort.printArray();

        quickSort.sort();

        System.out.println("Tablica po sortowaniu : ");
        quickSort.printArray();
    }


}
