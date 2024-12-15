public class PatternNumberSequence
{ 
public static void main(String[] args)
{
int a = 3;
int b = 4;
int n = 8;
for (int i = 1; i <= n; i++)
{
int c = a + b;
System.out.print(a + " " + b + " " + c);
System.out.println(" ");
a = c;
b = b + 1;
}
}
}
