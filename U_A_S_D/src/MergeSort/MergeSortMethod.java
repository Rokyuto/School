package MergeSort;

public class MergeSortMethod {

    public static void divide(int arr[],int left ,int right)
    {
        if (left < right)
        {
            int middle = (left + right) / 2;

            divide(arr,left,middle);
            divide(arr, middle + 1, right);

            SortAndMerge(arr, left,middle,right);
        }
    }

    public static void SortAndMerge(int arr[], int l, int m, int r)
    {
        int n1 = m - l - 1;
        int n2 = r - m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        //Пълним ляв масив
        for (int i = 0; i <= n1;i++)
        {
            L[i] = arr[l+i];
        }

        //Пълним десен масив
        for (int j = 0; j <= n2;j++)
        {
            R[j] = arr[l+j];
        }

        int i = 0, j = 0; //Старт индекси на ляв и десен масив
        int k = l; //Начален индекс на обединчшащ масиш

        while(i < n1 && j < n2)
        {
            if (L[i] <= R[j]) //Ако елемента на левия масив е по-малък от съответния елемент на десния
            {
                arr[k] = L[i]; //Първо слагаме елемента на левия масив
            }
            else
            {
                arr[k] = R[i];  //Първо слагаме елемента на десния масив
            }
            k++;
        }

        while(i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (k < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}