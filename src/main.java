import java.util.Scanner;

//root function of Java Project
public static void main(Strings []args) {

  // Taking User Input through Scanner
  Scanner sc = new Scanner(System.in);
  int num1 = sc.nextInt();
  int num2 = sc.nextInt();

  int result = num1 + num2;
  System.out.print(result);
}  

// Adding Subtraction function
public static int sub(int num1, int num2) {
  int result = num1 - num2;
  return result;
}

// Check if number is even or odd
public static String evenOrOdd(int num) {

  boolean flag = false;
  if(num % 2 == 0) {
      flag = true;
  }

  if(flag) {
       return "Number is Even"
  }
  return "Number is Odd"
}
