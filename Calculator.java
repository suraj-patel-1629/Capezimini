import java.util.Scanner;
class Calculator{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Calculator");
System.out.println("Enter the 1 digit");

int a = sc.nextInt();
System.out.println("Enter the opertor you need to perform");
char op= sc.next().charAt(0);
System.out.println("Enter the 2 digit");
int b = sc.nextInt();

if(op=='+'){
   System.out.println("result: ");
  System.out.print(a+b);
}
else if(op=='-'){
 System.out.println("result: ");
  System.out.println(a-b);
}else if(op=='*'){
 System.out.println("result: ");
  System.out.println(a*b);
}
else if(op=='/'){
 System.out.println("result: ");
  System.out.println(a/b);
}
else{
System.out.println("Operator does not exist");
}



}
}