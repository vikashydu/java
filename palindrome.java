import java.util.*;
class palindrome{
    public static void main(String args[]){
        int n,number;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        n=sc.nextInt();
        int sum=0,r;
        number=n;
        while(number>0)
        {
            r=number%10;
            sum=(sum*10)+r;
            number=number/10;
        }
        if (n==sum)
        System.out.println("Number is palindrome");
        else
        System.out.println("Number is not a palindrome");
    }
}