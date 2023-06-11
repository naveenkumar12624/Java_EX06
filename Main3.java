import java.util.Scanner;
public class Main3{
    public static int pow(int num,int exp)
    {
        if(exp==1)
        {
            return num;
        }
        else
        {
            return num*pow(num,exp-1);
        }
    }
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Base Value: ");
        int num=sc.nextInt();
        System.out.print("Enter Power Value: ");
        int exp=sc.nextInt();
        int result=pow(num,exp);
        System.out.println(num +" to the power of "+exp+" is "+result);
    }
}
