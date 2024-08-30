import java.util.Scanner;

 class MovieTicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String []movielist = {"FAST X ","ANT-MAN and THE WASP:QUANTUMANIA ","VASH "};
        String[] theaters = {"PVR", "INOX", "Conplex Smart Theatre"};
        String[][] categories = {
                {"Recliner", "Prime Plus", "Prime"},
				 {"Recliner", "Prime Plus", "Prime"},
				  {"Recliner", "Prime Plus", "Prime"}
               
        };
        int[][] prices = {
                {500, 400, 350},
                {600, 500,400},
                {400, 380,320}
        };
        String[][] languages = {
                {"English", "Hindi"},
                {"English", "Hindi"},
                {"English", "Hindi"}
        };
        String[][][] seats = new String[10][10][20];
		
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 20; k++) {
                    seats[i][j][k] = ""+(k+1);
                }
            }
        }
		System.out.println("Wellcome To Book My Show ");
		System.out.println("Book My Show Wants To Detect Your Location!  (Y/N)");
		String per = sc.nextLine();
		 if (per.equalsIgnoreCase("Y"))
		 {
			 System.out.println("Your Location Is Ahmedabad ");
			 System.out.println("Select Movie:");
			 for(int i = 0;i<movielist.length;i++)
			 {
				 System.out.println((i + 1) + ". " +movielist[i]);
			 }
			  int MovieIndex = sc.nextInt() - 1;
			 
        System.out.println("Select Theater:");
        for (int i = 0; i < theaters.length; i++) {
            System.out.println((i + 1) + ". " + theaters[i]);
        }
        int theaterIndex = sc.nextInt() - 1;

        System.out.println("Select Category:");
        for (int i = 0; i < categories[theaterIndex].length; i++) {
            System.out.println((i + 1) + ". " + categories[theaterIndex][i] + " - " + prices[theaterIndex][i] + " INR");
        }
        int categoryIndex = sc.nextInt() - 1;

        System.out.println("Select Language:");
        for (int i = 0; i < languages[theaterIndex].length; i++) {
            System.out.println((i + 1) + ". " + languages[theaterIndex][i]);
        }
        int languageIndex = sc.nextInt();
		if(languageIndex>2)
		{
			System.out.println("Plz Select From Above Language");
		}
		System.out.print("\nHow many tickets would you like to book? (0 to exit) ");
          int   numTickets = sc.nextInt();
		  int row =0;
		  int seat= 0;
		  
        while (true)
			{ 
            
             if (numTickets == 0) {
				System.out.println("THnx For Using Book My Show !");
				System.exit(0);
			 }
            System.out.println("\nSeating Chart:");
			System.out.println("                RECLINER           ");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 20; j++) {
                    System.out.print(seats[theaterIndex][categoryIndex][j] + " ");
                }
                System.out.println();
			}
			System.out.println("                PRIME PLUS           ");
				 for (int i = 2; i < 7; i++) {
                for (int j = 0; j < 20; j++) {
                    System.out.print(seats[theaterIndex][categoryIndex][j] + " ");
                }
                System.out.println();	
            }
			System.out.println("              PRIME         ");
				 for (int i = 8; i < 10; i++) {
                for (int j = 0; j < 20; j++) {
                    System.out.print(seats[theaterIndex][categoryIndex][j] + " ");
				}
                System.out.println();	
            }
		
		 System.out.println();
		 System.out.println("  ------------------------------------");
		System.out.println("  ------------------------------------");
		System.out.println("         All Eyes This Way Please  ");
		  for (int i = 0; i < numTickets; i++) {
                System.out.print("\nSelect seat for ticket " + (i + 1) + " (row seat): ");
                row = sc.nextInt() - 1;
                seat = sc.nextInt() - 1;
				
		  }
			break;
			}
			
        System.out.println();
		 double Amount=(prices[theaterIndex][categoryIndex] * numTickets);
		 double ConvienceFee = (Amount*18)/100 ;
		 double TotalAmount= Amount+ConvienceFee;
		 
		 System.out.println("Total Ticket You have Book is:"+numTickets);
        System.out.println("Amount without Convience Fee: "+Amount);
        System.out.println("Convience Fee: "+ConvienceFee);
        System.out.println("Total Price: " + TotalAmount + " INR");

        System.out.println("Select Payment Method:");
        System.out.println("1. NetBanking");
        System.out.println("2. GooglePay");
		int ch = sc.nextInt();
		if(ch==1)
		{     Scanner scanner  = new  Scanner(System.in);    
            System.out.print("Enter card number: ");
            String cardNumber = scanner.next();
            System.out.print("Enter expiry date (MM/YY): ");
            String expiryDate = scanner.next();
            System.out.print("Enter CVV: ");
            String cvv = scanner.next();
			System.out.println("ENTER AMOUNT TO PAY ");
			  int amountpay = sc.nextInt();
			  if(amountpay==TotalAmount)
			  {
				  System.out.println("YOUR PAYMENT IS SUCCESFULLY DONE");
				  System.out.println("SEAT HAS BEEN BOOKED ");
				  System.out.println("Payment successful!");
				  System.exit(0);
			  }
        
		else
			{
  
            System.out.printf("Booking Not confirmed. Please Enter Correct Amount . WE APOLOGIAZE    ");
			
			}
		}
			if(ch==2)
			{
				Scanner scanner  = new  Scanner(System.in);    
				System.out.println("ENTER YOUR UPI ID ");
				String UpiId= scanner.next();
				System.out.println("ENTER AMOUNT TO PAY ");
			  int amountpay = sc.nextInt();
				if(amountpay==TotalAmount)
			  {
				  System.out.println("YOUR PAYMENT IS SUCCESFULLY DONE");
				  System.out.println("SEAT HAS BEEN BOOKED ");
				  System.out.println("Payment successful!");
				  System.exit(0);
			  }
			  else{
				  System.out.printf("Booking Not confirmed. Please Enter Correct Amount .WE APOLOGIAZE    ");
			  }
			}
	}
	else{System.exit(0);}
	}
 }