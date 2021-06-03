package Algorithms.Sorting;
class SortBy2Array{
    public static void sort(){
        //this only works with 2 sorted arrays
        int []a={1,3,9,20};//sorted array1
        int []b={2,6,11,22,30,36,44,51};//sorted array2
        int []c=new int [a.length+b.length];

        int i,j,k;
        i=j=k=0;

        while (i<a.length && j<b.length){
            if (a[i]<b[j]){
                c[k]=a[i];
                i++;
            }
            else{
                c[k]=b[j];
                j++;
            }
            k++;
        }
        while(i<a.length){
            c[k]=a[i];
            i++;
            k++;
        }
        while(j<b.length){
            c[k]=b[j];
            j++;
            k++;
        }
        for(int m:c){
            System.out.print (m+" ");
        }
    }
}
public class MergeSort {
    public static void merge(int []a, int low,int mid, int high){
        int[] b =new int[a.length];
        int i,j,k;
        i=low;
        j=mid+1;
        k=low;
        while (i<=mid && j<=high){
            if (a[i]<a[j]){
                b[k]=a[i];
                i++;
            }
            else{
                b[k]=a[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            b[k]=a[i];
            i++;
            k++;
        }
        while(j<=high){
            b[k]=a[j];
            j++;
            k++;
        }
        for(k=low;k<=high;k++){
            a[k]=b[k];
        }
    }
    public static void sort(int []a, int low,int high){
        if(low<high){
            int mid=(low+high)/2;
            sort(a, low, mid);
            sort (a, mid+1, high);
            merge (a, low, mid, high);
        }
    }
    public static void main (String[] args) {
        int[] a ={2,9,14,25,36,41,55,5,9,20,26,47,58,69,70};
        int low=0;
        int high=a.length-1;
        sort (a,low,high);
        for(int m:a){
            System.out.print (m+" ");
        }
    }
}