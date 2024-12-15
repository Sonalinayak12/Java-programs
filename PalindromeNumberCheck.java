
public class PalindromeNumberCheck 

{

public static void main(String[] args)
{
int n=121,pal,r,rev=0;
pal = n;
while (n > 0)
{
r = n % 10;
rev = rev * 10 + r;
n = n / 10;
}
if (rev == pal)
{
System.out.println(" The given no is palindrome "+ rev);
}
else
{
System.out.println("The given no is not palindrome " + rev);
}
}
}