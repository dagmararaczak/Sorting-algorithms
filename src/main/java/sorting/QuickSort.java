package sorting;

public class QuickSort {


    private int[] array;


    public QuickSort(int[] array) {
        this.array = array;
    }


    public void sort() {

        if (array == null || array.length == 0) {

            return;

        } else {

            int lastElementIndex = array.length - 1;

            quickSort(array, 0, lastElementIndex);
        }


    }


    private void quickSort(int[] array, int left, int right) {

        if (left >= right) {
            return;
        }
        int pivot = array[right];
        int border = left - 1;
        int i = left;

        while (i < right) {

            if (array[i] < pivot) {

                border++;

                if (border != i) {

                    SortUtils.swap(array, border, i);
                }


            }

            i++;

        }

        border++;

        if (border != right) {

            SortUtils.swap(array, border, right);
        }


        quickSort(array, left, border - 1);
        quickSort(array, border + 1, right);

    }

    public void printArray() {

        for (int element : array) {

            System.out.print(element + "\t");
        }
        System.out.println();
    }

}
