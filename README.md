# Ex-6 Create a method to calculate power of a number raised to other
## AIM:
To write a program that define a method to calculate power of a number raised to other i.e. ab using recursion where the numbers 'a' and 'b' are to be entered by the user.
## PROCEDURE:
### STEP 1:
Create Main class within that create main and pow function.
### STEP 2:
with main function initialize two varaiable and get the value from the user.
### STEP 3:
call pow function from main.
### STEP 4:
Execute pow function it will Recursively execute untill it find pow value.
### STEP 5:
End the program.
## PROGRAM:
```java
import java.util.Scanner;
public class Main{
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
        int num=sc.nextInt();
        int exp=sc.nextInt();
        int result=pow(num,exp);
        System.out.println(num +" to the power of "+exp+" is "+result);
    }
}
```
## OUTPUT:
![image](https://github.com/Karthikeyan21001828/Java_EX06/assets/93427303/3ac423d6-a719-43fb-bf0d-4367d0e88847)
## RESULT:
A program that define a method to calculate power of a number raised to other i.e. ab using recursion where the numbers 'a' and 'b' are to be entered by the user has been executed successfully.
