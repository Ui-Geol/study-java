package sorting;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    
    int[] a = {4, 3, 5, 1, 2};
    Sorting sorting = new Sorting(a);
    
    sorting.insertionSort();

    System.out.println(Arrays.toString(a));
    
  }

}
