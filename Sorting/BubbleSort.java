package Algorithms.Sorting;

public class BubbleSort {
    public static void main(String [] val){
        int []a={1,2,13,4,3,6,7,18};
        int temp=0;
        int flag=0;
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a.length-1; j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flag=1;
                }
            }
            if(flag==0){
                break;
            }
            flag=0;
        }
        for(int i: a){
            System.out.print (i+" ");
        }
    }
}
