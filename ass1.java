import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;
import java.time.*;
import java.time.DayOfWeek;
import java.io.*;
import java.util.Scanner;

public class ass1 {

    public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
   
        int n;
        int month = 0;
        int day = 0;
	 float time = 9;
	 int km=0;
	int val=0;
	
	
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();

        System.out.println("");
        System.out.println("Program by Vaidehi Deshpande");
        System.out.println("Object Oriented Programming");
        System.out.println(formatter.format(date));
        System.out.println("");
        System.out.println("*************");


        do {
            System.out.println("Please Enter number between 1 to 6 for different operations");
            n = sc.nextInt();

            switch(n) {
                case 1:  System.out.println(" Here we performing  user  Details");
                    System.out.println("Enter Your name");
                    String name = sc.next();

                    System.out.println("Enter Your approximate kilometers of travel");
                     km = sc.nextInt();

                    System.out.println("Month of travel");
                    month = sc.nextInt();

                    System.out.println("On which date of this month, you wish to travel!!");
                    day = sc.nextInt();

                    System.out.println("Now enter the time of travel using 24 hour clock just like 9.00 for 9am, 13.00 for 1pm");
                    time = sc.nextFloat();
                    break;


                case 2:  System.out.println ("We are performing Display Charges under company 1");
                    LocalDate localDate = LocalDate.of(2022,month,day);
                    
                    DayOfWeek dayOfWeek = DayOfWeek.from(localDate);
			System.out.println("day when you are travel is: " + day +" " + "Month of travel is: " + month +" " + "day is: " + dayOfWeek.name());

                      val = dayOfWeek.getValue();

                    System.out.println("Int Value of "  + dayOfWeek.name()   + " - " + val);
	
			if((time>=7 && time<=9) || (time>=16 && time <=18))
			{
					System.out.println("extra charges will applied accordingly beacuse time is between 7.00 AM - 9.00 AM and 16.00PM to 18.00PM ");
					double Total_charges = 5.50 + 2.50 + 0.75*km;
					System.out.println("Total charges are: " + Total_charges+"$");
				

					}			
					
			else if(val==6 || val==7)
				{
					System.out.println("Extra charges will applied accordingly because this is weekend time");
					double Total_charges = 5.50 + 3.00 + 0.75*km;
					System.out.println("Total charges are: " + Total_charges+"$");
						
					}

						
				else
				{
					System.out.println("No Extra Charges will be applied");
					double Total_charges = 5.50 + 0.75*km;
					System.out.println("Total charges are: " + Total_charges+"$");

				}

                    break;

                case 3:  System.out.println ("We are performing Display Charges under company 2");
				
				LocalDate localDatee = LocalDate.of(2022,month,day);
                    
                    DayOfWeek dayOfWeeke = DayOfWeek.from(localDatee);
			System.out.println("Day when you travelled is: " + day +" " + "Month of travel is: " + month +" " + "day is: " + dayOfWeeke.name());

                      val = dayOfWeeke.getValue();

                    System.out.println("Int Value of "  + dayOfWeeke.name()   + " - " + val);
	
				if((time>=7 && time<=9) || (time>=16 && time <=18))
				{
					System.out.println("Extra charges will applied accordingly beacuse time is between 7.00 AM - 9.00 AM and 16.00PM to 18.00PM ");
					double Total_charges = 4.50 + 2.00 + 0.85*km;
					System.out.println("Total charges are: " + Total_charges+"$");
				

					}			
					
			else if(val==6 || val==7)
				{
					System.out.println("Extra charges will applied accordingly because of weekend rush");
					double Total_charges = 4.50 + 2.50 + 0.85*km;
					System.out.println("Total charges are: " + Total_charges+"$");
						
					}

						
				else
				{
					System.out.println("No Extra Charges will be applied");
					double Total_charges = 4.50 + 0.85*km;
					System.out.println("Total charges are: " + Total_charges+"$");

				}

                    break;

                case 4: System.out.println ("We performing  Display Charges under company 3");

					LocalDate localDateee = LocalDate.of(2022,month,day);
                    
                    DayOfWeek dayOfWeekee = DayOfWeek.from(localDateee);
			System.out.println("Day when you travelled is: " + day +" " + "Month of travel is: " + month +" " + "day is: " + dayOfWeekee.name());

                      val = dayOfWeekee.getValue();

                    System.out.println("Int Value of "  + dayOfWeekee.name()   + " - " + val);
	
				if((time>=7 && time<=9) || (time>=16 && time <=18))
				{
					System.out.println("Extra charges will applied accordingly beacuse time is between 7.00 AM - 9.00 AM and 16.00PM to 18.00PM ");
					double Total_charges = 1.00 + 3.00 + 0.85*km;
					System.out.println("Total charges1: " + Total_charges+"$");
				

					}			
					
			else if(val==6 || val==7)
				{
					System.out.println("Extra charges will applied accordingly because of weekend rush");
					double Total_charges = 5.50 + 1.50 + 0.85*km;
					System.out.println("Total charges: " + Total_charges+"$");
						
					}

						
				else
				{
					System.out.println("No Extra Charges will be applied");
					double Total_charges = 5.50 + 0.85*km;
					System.out.println("Total charges: " + Total_charges+"$");

				}

                    break;

                case 5: System.out.println("We are performing  Show Report");
				System.out.println("Expensive Company is: Company 1");
				System.out.println("Cheapest Company is: Company 3");


                    break;

                case 6: System.out.println ("Exit System");
					name = null;
					km =0;
					month=0;
					day=0;
					time=0;
			System.out.println("Good Bye !");
			System.out.println("All user details have been set null or 0");
	
                    break;	
                default:
                case 7: System.out.println("You have entered invalid value ! Please enter a valid value");
            }
        }
	 while(n!=8);


    }
}