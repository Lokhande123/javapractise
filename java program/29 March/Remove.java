import java.util.Scanner;

 class Example

{
public static void main(String[] args)
{
 Scanner sc =new Scanner(System.in);

System.out.print("Enter String : ");

String str = sc.nextLine();

str=str.replaceAll("[^a-zA-Z]","");

System.out.println("String with only alphabets: "+str);
 }

}

 