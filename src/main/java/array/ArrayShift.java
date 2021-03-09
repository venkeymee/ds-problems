package array;

import java.util.Arrays;

public class ArrayShift {

// Shifting the array by N-times
    // logic we need to for loop with n'no time rotations and we have to declare j and first
//  element
    public static void main(String[] args) {
        int a[]={1,2,3,4,5},n=3;


        for(int i=0;i<n;i++){
            int j,
            first=a[0];// assigning first value


            for(j=0;j<a.length-1;j++){
                a[j]=a[j+1];
            }
            a[j]=first; // appending first value to last index
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }
}
