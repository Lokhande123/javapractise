
class Example{
public static void main(String args[])
{
int num =10;
 int a= 0 , b = 1;
System.out.println(a+" ,"+b+",");
int nextTerm;
 for(int i = 0; i<=num; i++)
{
nextTerm = a+b;
a = b ; 
b = nextTerm; 
System.out.println(nextTerm+ " ");
}
}
}