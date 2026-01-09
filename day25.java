 
class MaximumMinimum
{
public static void main(String args[])
{
int a = 30;
int b = 40;
int c = 100;


    int max, min;

    
    if (a >= b && a >= c)
        max = a;
    else if (b >= a && b >= c)
        max = b;
    else
        max = c;

   
    if (a <= b && a <= c)
        min = a;
    else if (b <= a && b <= c)
        min = b;
    else
        min = c;

    System.out.println("Maximum = " + max);
    System.out.println("Minimum = " + min);
}

}