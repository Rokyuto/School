package QuickSort;

public class QuickSortMethods
{
    static void QuickSort(int[] myArr, int first, int last)
    {
        if(first < last)
        {
            //Create two sub-arrays using Partition Method
            int childs = Partition(myArr,first,last);

            //Quick Sort for the start array
            QuickSort(myArr, first, childs-1);

            //Quick Sort for the end array
            QuickSort(myArr, childs+1,last);
        }
    }

    private static int Partition(int[] myArr,int low, int high)
    {
        int Pivot = myArr[high]; //Set the last element for Pivot

        int element = low - 1; // Set place for Partiotion index

        for (int i = low; i <= high - 1; i++)
        {
            if (myArr[i] < Pivot) //Check if current element is smaller than the last(Pivot)
            {
                element++;
                //Switch positions
                int temp = myArr[i];
                myArr[i] = myArr[element];
                myArr[element] = temp;
            }
        }

        //Update element value
        element++;

        //Update Pivot - move to the next element after the last element is on the right place
        int temp = myArr[element];
        myArr[element] = Pivot;
        myArr[high] = temp;

        return element;
    }
}