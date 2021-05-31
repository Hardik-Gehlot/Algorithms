package Algorithms.Sorting;

public class SelectionSort {
    public static void main (String[] args) {
        int []a={1,7,18,5,2,15,0};
        int temp=0;
        for(int i=1; i<a.length; i++){
            int min=i;
            for(int j=i; j<a.length-1; j++){
                if(a[min]>a[j+1]){
                    min=j+1;
                }
            }
            if(a[i-1]>a[min]){
                temp=a[min];
                a[min]=a[i-1];
                a[i-1]=temp;
            }
        }
        for(int i:a){
            System.out.print (i+ " ");
        }
    }
}
