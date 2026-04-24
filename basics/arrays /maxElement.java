java
  class MaxElement {
    public static void main(string[]args)
    {
      int[] arr = {10,45,67,23,89};
      int max = arr[0];
      for (int i = 1; i < arr.length; i++) {
        if (arr[i] > max){
          max = arr[i];
        }
      }
      System.out.println("max: " + max);
    }
  }
