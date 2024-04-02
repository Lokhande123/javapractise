import java.util.Scanner;
class Example{
public static void main(String args[])
{
 int reverse = 0,remainder,Number;

System.out.println("Enter the number");
Scanner sc  = new Scanner(System.in);
Number = sc.nextInt();

for( ;Number!=0;Number=Number/10)
{

 remainder = Number % 10;

reverse = reverse*10+remainder;

}

System.out.println("Reverse of the number ="+reverse);
}
} 
