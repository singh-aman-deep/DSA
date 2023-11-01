package com.dsa.codingninjas;

public class LinearSearch {

    public static void main(String[] args) {
        int[] x = {1,2,3,4};
        System.out.print(linearSearch(x,4));

    }

    static  int linearSearch(int[] arr, int num){
        boolean flag = false;
        int i;
        for(i = 0;i < arr.length;i++){
            if(num == arr[i])
            {
                flag = true;
                break;
            }
        }

        if(!flag)
            return -1;
        else
            return i;
    }
}
