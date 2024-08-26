package JavaInterviewProgramms;

public class SwappingOfTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
int b=20;
  System.out.println("Before swapping values are "+a+" "+b);
  //Logic1: Without Using Third Variable
a=a+b;
b=a-b;
a=a-b;
System.out.println("After Swapping values are "+a+" "+b);
	}

}
