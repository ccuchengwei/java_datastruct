import java.util.Arrays;
public class QuickSort {

    public static void main(String []args) {
       int [] Array = {9,6,5,3,1,2,4,7,8};
       int [] SortedArray = QuickSortFunc(Array, 0, Array.length - 1);
       System.out.println(Arrays.toString(SortedArray));
    }

    public static int [] QuickSortFunc(int [] A, int Left, int Right)
    {
        try
        {
            int i, j, pivot;
            if(Left < Right)
            {
                i = Left;
                j = Right + 1;
                pivot = A[Left];
                do{
                    //find A[i] biger than pivot
                    do i++; while( i < A.length && A[i] < pivot);
                    //find a[j] smaller than pivot
                    do j--; while(j > 0 && A[j] > pivot);

                    if( i < j) Swap(A, i, j);

                }while( i < j); 

                Swap(A, Left, j);
                QuickSortFunc(A, Left, j-1);
                QuickSortFunc(A, j+1, Right);
            }
            
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
        return A;
    }

    public static void Swap(int [] A, int Index1, int Index2)
    {
        try {
            int tmp = A[Index1];
            A[Index1] = A[Index2];
            A[Index2] = tmp;
            
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e.toString());
        }
    }
 }