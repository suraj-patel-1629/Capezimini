import java.util.Scanner;

class Calculator {
  public static void main(String args[]) {
    System.out.println("Calculator");
    System.out.println("enter the operator you need to perform");
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    char op = sc.nextChar();
    int b = sc.nextInt();

    if (op == "+") {
      System.out.println(a + b);
    } else if (op == "-") {
      System.out.println(a - b);

    } else if (op == "*") {
      System.out.println(a * b);

    } else if (op == "/") {
      System.out.println(a / b);

    } else {
      System.out.println("operator does not exist");
    }

  }
}