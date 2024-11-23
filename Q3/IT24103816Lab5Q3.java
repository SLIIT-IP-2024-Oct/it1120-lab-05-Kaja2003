import java.util.Scanner;
    public class IT24103816Lab5Q3{
        public static void main(String[]args){
            Scanner input=new Scanner(System.in);
            final double Room_charges_per_day=48000;
            final double Discount_for_3_To_4_days=10;
            final double Discount_for_5_or_more_days=20;

            double St_date, En_date, No_date, Payment, Payment1, Payment2;
            System.out.print("Enter the Start Date(1-31):");
            St_date=input.nextInt();
            if( St_date >31 || St_date<1){
                System.out.println("Error:Start Date must be less than End date.");
                return;
            }
            System.out.print("Enter the End Date(1-31):");
            En_date=input.nextInt();
            if(En_date>31 || En_date<1 || St_date>En_date ){
                System.out.println("Error:Days must be between 1 and 31 & End date greater than Start date.");
                return;
            }
            No_date=En_date-St_date;

            System.out.println("Room charge per day:Rs. "+Room_charges_per_day);
            System.out.println("Number of days Reserved:"+No_date);
            if(No_date>3 && No_date<4){
                Payment=((No_date*Room_charges_per_day) - (No_date*Room_charges_per_day*10/100));
                System.out.println("Total Amount to be paid:"+Payment);
            } else if(No_date>=5){
                Payment1=((No_date*Room_charges_per_day) - (No_date*Room_charges_per_day*20/100));
                System.out.println("Total amount to be paid:"+Payment1);
            } else {
                Payment2=(No_date*Room_charges_per_day);
                System.out.println("Total amount to be paid:"+Payment2);
            }
        }
    }