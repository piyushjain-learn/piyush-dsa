import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
       int[] a = {1,2,0,4,3,0,5,0};
       System.out.println(Arrays.toString(reArrangeEvenBiggerOddLesser(a)));
}
    public static int[] bubbleSort(int[] a ){
        for(int i = 0; i < a.length-1; i++) {
          //outer loop
            for(int j = 0; j < a.length-i-1; j++) {
              // inner loop
                if(a[j]>a[j+1]){
                    int temp =a[j];
                    a[j] = a[j+1];
                    a[j+1]= temp;

                }
            }
        }
        return a;
    }

    public  static void largestThreeeElements(int[] a){
        int first,second,third;
        first =second=third = Integer.MIN_VALUE;

        for(int i = 0; i < a.length; i++) {
          //
            if(a[i]>first){
                third = second;
                second = first;
                first = a[i];
            }else if(a[i]>second && a[i] !=first){
//
                second = first;
            } else if(a[i]>third && a[i] != second) third = a[i];


        }
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

    }


    public static int secondLargest(int[] a){
    int res = 0;
    int largest = 0;
    for(int i = 1; i < a.length; i++) {
      //
        if(a[i]>a[largest]){
            res = largest;
            largest = i;
        }
         else if(a[i]>a[res] && a[i] != a[largest]){
            res = i;
        }
    }
    //
    return res;
    }

    public static boolean moveALlZeroToEnd(int[] a ){

    int count =0;
    int temp =0;
    for(int i = 0; i < a.length; i++) {
      //
        if(a[i] !=0){
            temp = a[i];
            a[i] = a[count];
            a[count] =temp;
            count++;
        }
    }
        System.out.println(Arrays.toString(a));
        return false;
    }
    public static int[] swap(int[] a, int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        return a;
    }


    public static int[] reArrangeEvenBiggerOddLesser(int[] a){
        for(int i =0;i<a.length-1;i++){
            if(i%2 ==0 && a[i]>a[i+1]){
                swap(a, i, i+1);
            }else if(i% 2 !=0 && a[i]<a[i+1]){
                swap(a, i, i+1);
            }
        }

        return a ;
    }

    public static int[] segregateEvenAndOddNumbersIEEvenComesFirst(int[]a){



        return a;
    }

}
