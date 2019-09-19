package edu.spbu.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by artemaliev on 07/09/15.
 */
public class IntSort {
  public static void sort (int array[]) {
    int n=array.length;
    quickSort(array,0,n-1);
  }

  public static void quickSort(int array[],int left,int right){
    if(array.length!=0)
    {
      int beg=left,end=right,med=array[(left+right)/2];
      while (beg <= end) {
        while (array[beg] < med) {
          beg++;
        }

        while (array[end] > med) {
          end--;
        }

        if (beg <= end) {//меняем местами
          int temp = array[beg];
          array[beg] = array[end];
          array[end] = temp;
          beg++;
          end--;
        }
      }
      if(left<end) quickSort(array,left,end);
      if(beg<right) quickSort(array,beg,right);


    }
  }

  public static void sort (List<Integer> list) {
    Collections.sort(list);
  }
}