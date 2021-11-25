class ConditionalCheck
{
public static void main(String args[])
{
int n=24;

if(n%2!=0)
{
System.out.println("weird");
}
else if(n>2 && n>=5)
{
System.out.println("Not weird");
}
else if(n>6 && n>=20)
{
System.out.println("weird");
}
else
{
System.out.println("Not weird");
}
}
}

OUTPUT-
Not weird

