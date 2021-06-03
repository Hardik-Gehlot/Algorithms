package Algorithms.Sorting;

public class QuickSort {
    public static int partition(int[]a, int low, int high){
        int pivot=a[low];
        int start=low;
        int end=high;
        while(start<end){
            while(start<a.length && a[start]<=pivot){
                start++;
            }
            while(a[end]>pivot){
                end--;
            }
            if(start<end){
                int temp=a[start];
                a[start]=a[end];
                a[end]=temp;
            }
        }
        int temp=a[low];
        a[low]=a[end];
        a[end]=temp;
        return end;
    }
    public static void quickSort(int[]a, int low, int high){
        if(low<high){
            int loc = partition (a, low, high);
            quickSort(a, low, loc-1);
            quickSort (a, loc+1, high);
        }
    }
    public static void main (String[] args) {
        int[] a={2,5,1,6,3,8,4,9,0,7};
        int low=0;
        int high=a.length-1;
        quickSort (a, low, high);
        for(int m: a){
            System.out.print (m+" ");
        }
    }
}