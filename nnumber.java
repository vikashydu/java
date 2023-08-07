import java.util.*;
public class dowhiles{
    public static void main(String args[]){
        int number,i=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("PLease enter last number you want to print ");
        number=sc.nextInt();
        do {
            System.out.println(i);
            i++;
        }while(i<=number);
    }
}