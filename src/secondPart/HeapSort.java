package secondPart;

/**
 * Created by xt_fe on 2016/7/21.
 */
public class HeapSort {
    private void maxHeapify(int[] a,int i, int size ){
        int largest;
        int l = left(i);
        int r = right(i);
        if (l <= size && a[l] > a[i])
            largest = r;
        else largest = i;
        if (r <= size && a[r] > a[largest])
            largest = r;
        if (largest != i)
            exchange(a, a[i], a[largest]);
        maxHeapify(a, largest, size);
    }

    private void buildMaxHeap(int a[]){
        int size = a.length;
        for(int i = size/2; i >= 1; i--){

        }

    }

    private void exchange(int[] a, int x, int y) {
        int temp;
        temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    private int right(int i) {
        return ( i+1 ) * 2 - 1;
    }

    private int left(int i) {
        return ( i+1 ) * 2;
    }
}
