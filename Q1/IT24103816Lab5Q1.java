import java.util.Scanner;
    public class IT24103816Lab5Q1{
        public static void main(String[]args){
            int num1,num2,num3;
            Scanner input=new Scanner(System.in);
            System.out.print("Enter the first number:");
            num1=input.nextInt();
            System.out.print("Enter the second number:");
            num2=input.nextInt();
            System.out.print("Enter the third number:");
            num3=input.nextInt();

            System.out.print("User entered numbers are :"+num1);
            System.out.print(" "+num2);
            System.out.println(" "+num3);
            if(num1>num2 && num1>num3){
                System.out.println("The largest number is :"+num1);
            }
                else if(num2>num1 && num2>num3){
                    System.out.println("The largest number is :"+num2);
                }
                    else {
                    System.out.println("The largest number is :"+num3);
                    }
            if(num1<num2 && num1<num3){
                System.out.println("The smallest number is :"+num1);
            }
                else if(num2<num1 && num2<num3){
                    System.out.println("The smallest number is :"+num2);
                }
                    else{
                    System.out.println("The smallest number is :"+num3);
                    }
        }
    }