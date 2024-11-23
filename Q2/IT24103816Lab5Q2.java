import java.util.Scanner;
    public class IT24103816Lab5Q2{
        public static void main(String[]args){
            int member;
            Scanner input=new Scanner(System.in);
            System.out.print("Enter the number of new members introducted:");
            member=input.nextInt();
                if(member<0){
                        System.out.print("Input must be a number 0 or greater");
                    }
                    else              
                            switch(member){
                                    case 0 : System.out.print("No prize");
                                          break;
                                    case 1 : System.out.print("The prize is Pen");
                                         break;
                                    case 2 : System.out.print("The prize is Umbrella");
                                         break;
                                    case 3 : System.out.print("The prize is Bag");
                                        break;
                                    case 4 : System.out.print("The prize is Travelling Chair");
                                        break;
                            default :
                                 System.out.print("The prize is Headphone");
            }
        }
    }