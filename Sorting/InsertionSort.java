package Algorithms.Sorting;

public class InsertionSort {
    public static void main (String[] args) {
        int []a={1,2,13,4,3,6,7,18};
        int temp=0;
        int j=0;
        for(int i=1; i<a.length; i++){
            temp=a[i];
            j=i;
            while(j>0 && a[j-1]>temp){
                a[j]=a[j-1];
                j--;
            }
            a[j]=temp;
        }
        for(int i:a){
            System.out.print (i+" ");
        }
    }
}