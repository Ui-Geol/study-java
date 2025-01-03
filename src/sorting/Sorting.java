package sorting;

import java.util.Arrays;

public class Sorting {
  int A[];
  
  public Sorting(int B[]) {
    A = B;
  }
  
  public void selectionSort() {
    // 제일 큰 수를 찾아 맨 뒤의 인덱스로 보내고
    // 
    int k; int tmp;
    for(int last = A.length - 1; last >= 1; last--) {
      k = theLargest(last);
      tmp = A[k]; A[k] = A[last]; A[last] = tmp;
    }
    
  }
  
  private int theLargest(int last) {
    // A[]에서 가장 큰 수의 인덱스를 리턴
    int largest = 0;
    for(int i = 0; i <= last; i++) {
      if (A[i] > A[largest]) largest = i;
    }
    return largest;
  }
  
  public void bubbleSort() {
    int tmp = 0;
    for (int last = A.length-1; last >= 2; last--) {
      for (int i = 0; i <= last-1; i++) {
        System.out.println(Arrays.toString(A));
        if (A[i] > A[i+1]) {
          tmp = A[i]; A[i] = A[i+1]; A[i+1] = tmp;
        }
      }
    }
  }
  
  public void insertionSort() {
    for(int i = 1; i <= A.length-1; i++) {
      int loc = i - 1;
      int newItem = A[i];
      while(loc >= 0 && newItem < A[loc]) {
        A[loc+1] = A[loc];
        loc--;
      }
      A[loc+1] = newItem;
    }
  }
  
  public void mergeSort() {
    int[] B = new int[A.length];
    mSort(0, A.length-1, B);
  }
  
  private void mSort(int p, int r, int[] B) {
    if (p < r) {
      int q = (p+r)/2;
      mSort(p, q, B);
      mSort(q+1, r, B);
      merge(p, q, r, B);
    }
  }
  
  private void merge(int p, int q, int r, int[] B) {
    int i = p; int j = q+1; int t = 0;
    while (i <= q && j <= r) {
      if(A[i] <= A[j]) B[t++] = A[i++];
      else B[t++] = A[j++];
    }
    while (i <= q)
      B[t++] = A[i++];
    while (j <= r)
      B[t++] = A[j++];
    while (i <= r)
      A[i++] = B[t++];
  }

}
