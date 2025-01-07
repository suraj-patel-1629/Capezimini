import java.util.Scanner;
class PrimeNumber{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter the number need to check wheather it is prime or not");
int n = sc.nextInt();

if(n==1){
System.out.println("number is not a prime number");
return;

}
int count =0;


int i=1;
while(i<=n/2){

if(n/i==0){
  count++;
}
i++;
}

if(count==2){
    System.out.println("number is not a prime number");
}
else{
System.out.println("The given Number " +n+" is prime number"); 

}
}
}