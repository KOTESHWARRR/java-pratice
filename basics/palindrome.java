java
  class palindrome {
    public static void main(string[]args)
    {
      int num = 121, rev = 0, temp = num;
      while(num > 0) {
        int digit = num % 10;
        rev = rev * 10+digit;
        num /=10;
      }
      if (temp == rev)
        System.out.println("palindrome");
      else
        System.out.println("Not palindrom");
    }
  }
