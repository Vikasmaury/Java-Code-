import java.util.Scanner;
class Question7{
 
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
   
  System.out.print("Input a number: ");
  int num1 = in.nextInt();
   
  for (int i=1; i<=10; i++)
      {
        
            System.out.println(num1 + " X " + (i) + " = " +(num1 * (i)));
      }
 }
}