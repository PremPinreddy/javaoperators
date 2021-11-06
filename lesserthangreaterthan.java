import java.util.Scanner;
class lesserthangreaterthan
{
    public static void main(String[] args) 
    {
       Scanner Sc=new Scanner (System.in);
       System.out.println("enter two integers");
       int a=Sc.nextInt();
       int b=Sc.nextInt();
       if(a>b)
       {
           System.out.println("a is greater than b");
       }
       else
       {
        System.out.println("a is lesser than b");
       }
    }

}