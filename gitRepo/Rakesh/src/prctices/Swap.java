package prctices;

public class Swap {

	public static void main(String[] args) {
      int a=10;
      int b=20;
      System.out.println(a+" Before Swapping "+b);
      a=a+b;
      b=a-b;
      a=a-b;
      System.out.println(a+" After Swapping "+b);
      
	}

}