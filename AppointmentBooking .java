package project1;

import java.util.ArrayList;
//som3
import java.util.Scanner;

class AppointmentBooking {
	//added by vikram
	private static final ArrayList<String> patientNameBooking = null;
	private static final Object password = null;
	ArrayList<String> doctorName=new ArrayList<String>();
	ArrayList<String> doctorQualification=new ArrayList<String>();
	ArrayList<String> doctorGender=new ArrayList<String>();
	ArrayList<String> doctorPassword=new ArrayList<String>();
	ArrayList<Integer> doctorAge=new ArrayList<Integer>();
	ArrayList<Long> doctorMobileNumber=new ArrayList<Long>();
	ArrayList<String> doctorCity=new ArrayList<String>();
	
	ArrayList<Integer> pationtAge=new ArrayList<Integer>();
	ArrayList<String> pationtName=new ArrayList<String>();
	ArrayList<String> pationtGender=new ArrayList<String>();
	ArrayList<String> pationPassword=new ArrayList<String>();
	ArrayList<String> pationtConfirmPassword=new ArrayList<String>();
	ArrayList<Long> pationtMobileNumber=new ArrayList<Long>();
	
	ArrayList<Integer> pationtAgeBooking= new ArrayList<Integer>();
	ArrayList<String> pationtNameooking=new ArrayList<String>();
	ArrayList<String> pationtGenderBooking=new ArrayList<String>();
	ArrayList<Byte> doctorID=new ArrayList<Byte>();
	
	void dataAdd()
	{
		doctorName.add("Anil Jain");
		doctorName.add("Sunil Wagh ");
		doctorName.add("kiran Joshi");
		doctorName.add("Durgesh Kumar");
		doctorName.add("Anita Mahajan");
		doctorName.add("Manish Patil");
		doctorName.add("Dipali Koli");
		
		doctorQualification.add("MBBS");
		doctorQualification.add("BHMS");
		doctorQualification.add("MD");
		doctorQualification.add("BAMS");
		doctorQualification.add("MBBS,MD");
		doctorQualification.add("MBBS,MD,SURGEON");
		doctorQualification.add("MD SPEC.");
		
		doctorGender.add("male");
		doctorGender.add("male");
		doctorGender.add("male");
		doctorGender.add("male");
		doctorGender.add("Female");
		doctorGender.add("male");
		doctorGender.add("Female");
		
		doctorPassword.add("Anil123");
		doctorPassword.add("sunil123");
		doctorPassword.add("Kiran123");
		doctorPassword.add("Durgesh123");
		doctorPassword.add("Anita123");
		doctorPassword.add("Manish123");
		doctorPassword.add("Dipali123");
		
		doctorAge.add(25);
		doctorAge.add(24);
		doctorAge.add(27);
		doctorAge.add(29);
		doctorAge.add(28);
		doctorAge.add(23);
		doctorAge.add(30);
		
		doctorMobileNumber.add(123L);
		doctorMobileNumber.add(123L);
		doctorMobileNumber.add(123L);
		doctorMobileNumber.add(123L);
		doctorMobileNumber.add(123L);
		doctorMobileNumber.add(123L);
		doctorMobileNumber.add(123L);
		
		doctorCity.add("Gondiya");
		doctorCity.add("Ranchi");
		doctorCity.add("Nagpur");
		doctorCity.add("Nagpur");
		doctorCity.add("Mumbai");
		doctorCity.add("Delhi");
		doctorCity.add("Chennai");
		
	}
	void admin() throws Exception
	{
		Scanner sc=new Scanner(System.in);
		byte choice;
		boolean flag =true;
		
		while(flag)
		{
			new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
			System.out.println("\t\t   _____________________________    ");
			System.out.println("\t\t  |                             |   ");
			System.out.println("\t\t  |    Welcome Admin            |   ");
			System.out.println("\t\t  | ____________________________|   ");
			System.out.println("\t\t .Doctor list \t2.Registered Patients \t3.Pateins with Appointment \n4. Main menu \n\n                                  " );
			choice=sc.nextByte();
			switch(choice)
			{
			case 1:
				for( int i=0; i<=doctorName.size()-1;i++)
				{
					System.out.println("Name: \t "+doctorName.get(i));
					
				}
			byte menuCHoice;
			System.out.println("\n\n1.Main menu\t 2.Previous menu");
			menuCHoice=sc.nextByte();
			if(menuCHoice==1)
			{
				flag=false;
				
			}
			else
			{
				break;
			}
			break;
			
			case 2:
				
			if(pationtName.isEmpty())
			  {
				System.out.println("No Registered Patients yet.");
				Thread.sleep(3000);
				break;
				
			  }
			else
			{
				for(int i=0;i<=pationtName.size()-1;i++)
				{
					System.out.println(i+" ."+pationtName.get(i));
				}
				System.out.println("\n\n1.Main menu\t 2.Previous menu");
				menuCHoice=sc.nextByte();
				if(menuCHoice==1)
				{
					flag=false;
					
				}
				else
				{
					break;
				}
				
			}
			break;
				
			case 3:
				
					if(patientNameBooking.isEmpty())
					  {
						System.out.println("No Appoinment yet .");
						Thread.sleep(3000);
						break;
						
					  }
					else
					{
						for(int i=0;i<=patientNameBooking.size()-1;i++)
						{
							System.out.println(i+" ."+patientNameBooking.get(i));
						}
						System.out.println("\n\n1.Main menu\t 2.Previous menu");
						menuCHoice=sc.nextByte();
						if(menuCHoice==1)
						{
							flag=false;
							
						}
						else
						{
							break;
						}
				}
				break;
				
				case 4:
					flag=false;
					break;
					
					
			default:
				System.out.println("wrong choice");
				Thread.sleep(1000);
				flag=true;
				
				
		
			}
			
		}
	}
	 void patient() throws Exception
			{
				Scanner sc=new Scanner(System.in);
				boolean flag=true;
				while(flag)
				{
					new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
					System.out.println("\t\t   _____________________________    ");
					System.out.println("\t\t  |                             |   ");
					System.out.println("\t\t  |    Welcome to Patient page  |   ");
					System.out.println("\t\t  | ____________________________|   ");
					System.out.println(" ");
					System.out.println("1.login \t 2.Registration \n");
					int ch=sc.nextInt();
					switch(ch)
					{
					case 1:
						if(pationtMobileNumber.isEmpty())
						  {
							System.out.println("First register yourself then login!...");
							Thread.sleep(500);
							break;
							
						  }
						else
						{
							patient();
							flag=false;
				         }
						break;
					case 2:
						pationtRegistration();
						flag=false;
						break;
					default:
						System.out.println("\n You entered wrong choice.enter your choice again..!!!");
						flag=true;
						Thread.sleep(10000);
						break;
					}		
						
					
				}
			}
			void doctor() throws Exception
			{
				Scanner sc=new Scanner(System.in);
				int choice=0;
				
				boolean flag=true;
				while(flag)
				{
					new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
					System.out.println("\t\t   _____________________________    ");
					System.out.println("\t\t  |                             |   ");
					System.out.println("\t\t  |    Welcome to Doctor page  |   ");
					System.out.println("\t\t  | ____________________________|   ");
					System.out.println(" ");
					System.out.println("1.login \t 2.Registration \n");
					choice=sc.nextInt();
					switch(choice)
					{
					case 1:
						if(doctorMobileNumber.isEmpty())
						  {
							System.out.println("Registere First...!");
							flag=false;
							Thread.sleep(500);
							break;
							
						  }
						else
						{
							doctorLogin();
							flag=false;
				         }
						break;
					case 2:
						doctorRegistration();
						flag=false;
						break;
					default:
						System.out.println("Entered Wrong choice..");
						flag=true;
					}	
				}
			}
			void patientLogin() throws Exception
			{
				Scanner sc=new Scanner(System.in);
				boolean flag=true;
				long mobileNumber;
				byte choice;
	
					new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
					System.out.println("\t\t   _____________________________    ");
					System.out.println("\t\t  |                             |   ");
					System.out.println("\t\t  |   login					    |   ");
					System.out.println("\t\t  | ____________________________|   ");
					System.out.println(" ");
					System.out.println("Enter your UserName(mobilenumber)");
					mobileNumber =sc.nextLong();
					boolean flag1=false;
					int j;
					for (j=0;j<=pationtMobileNumber.size()-1;j++)
					{
						if ((pationtMobileNumber.get(j)).equals(mobileNumber)&&(pationPassword.get(j)).equals(password))
						{
							flag1=true;
							break;
						}
					}
					if(flag1==true)
					{
						Thread.sleep(1000);
						new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
						System.out.println("\t\t   _____________________________    ");
						System.out.println("\t\t  |                             |   ");
						System.out.println("\t\t  |   Book Appointment		    |   ");
						System.out.println("\t\t  | ____________________________|   ");
						System.out.println("\n Welcome "+pationtName.get(j)+",to book appointment,choose your doctor..");
						for(int i=0;i<=doctorName.size()-1;i++)
						{
							System.out.println((i+1)+"."+doctorName.get(i));
						}
						choice=sc.nextByte();
						doctorID.add(choice);
						while(flag)
						{
							Thread.sleep(1000);
							new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
							System.out.println("\t\t   _____________________________    ");
							System.out.println("\t\t  |                             |   ");
							System.out.println("\t\t  |   Book Appointment		    |   ");
							System.out.println("\t\t  | ____________________________|   ");
							
						}
						if(choice<=doctorName.size()&& choice>0)
						{
							System.out.println("\n\nName:\t "+doctorName.get(choice-1)+"\nAge:\t "+doctorAge.get(choice-1)+"\n");
							System.out.println("\n Enter your name: \t");
							sc.nextLine();
							patientNameBooking.add(sc.nextLine());
							System.out.println("Enter your age: \t");
							pationtAgeBooking.add(sc.nextInt());
							System.out.println("Enter your gender: \t");
							pationtGenderBooking.add(sc.next());
							System.out.println("\n Booking Successfull..");
							Thread.sleep(1000);
							flag=false;
							//break;
							
						}
						else
						{
							System.out.println("\n enter correct input..");
							flag=true;
							Thread.sleep(1000);
							
						 }
					
							
				 }
			     else
			       {
				         System.out.println("\n Login  UnSuccessfull..");
				         Thread.sleep(900);
				         flag=false;
			       }
				
                
			
        }
		void pationtRegistration() throws Exception
		{
			Scanner sc = new Scanner(System.in);
			int i=0;
			long mobileNumber;
			new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
			System.out.println("\n");
			System.out.println("\t\t | Welcome to patient Registration Page! |");
			System.out.println("\n");
			System.out.println("Please enter your name.");
			pationtName.add(sc.nextLine());
			System.out.println("enter your age :");
			pationtAge.add(sc.nextInt());
			System.out.println("Please enter your Mobile number");
			mobileNumber=sc.nextLong();
			Long mno;
			boolean flag =true,flag1=true;
			
			if(pationtMobileNumber.isEmpty())
			{
				pationtMobileNumber.add(mobileNumber);
				System.out.println("Enter password");
				pationPassword.add(sc.next());
				System.out.println("Registration is Successfully..");
				Thread.sleep(1000);
				flag1=false;
			 }
			else
			 {
				for(i=0;i<=pationtMobileNumber.size()-1;i++)
				{
					mno=pationtMobileNumber.get(i);
					
					if(mno==mobileNumber)
					{
						flag1=false;
						break;
					}
					
				  }
					if(flag1==true)
					{
					pationtMobileNumber.add(mobileNumber);
					System.out.println("Enter password");
					pationPassword.add(sc.next());
					System.out.println("Registration is Successfully..");
				    Thread.sleep(900);
				 }
			 
				    else
				   {
					System.out.println("same mobile number not allowed..");
					Thread.sleep(500);
				   }
		      }	
				
		}
			
		
		void doctorRegistration() throws Exception
		{
			Scanner sc=new Scanner(System.in);
			int i=0;
			Long mobileNumber;
			boolean flag=true,flag1=true;
			
			new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
			System.out.println("\t\t   ----------------------------------      ");
			System.out.println("\t\t  |This is doctor registration page  |     ");
			System.out.println("\t\t   ----------------------------------       ");
			System.out.println("\n");
			
			System.out.println("Please enter your name");
			doctorName.add(sc.nextLine());
			
			System.out.println("Please enter your Mobile number");
			mobileNumber=(sc.nextLong());
			
			
			Long mno;
			
			if(doctorMobileNumber.isEmpty())
			{
				doctorMobileNumber.add(mobileNumber);
				System.out.println("Enter password");
				doctorPassword.add(sc.next());
				System.out.println("Registration is Successfully..");
				Thread.sleep(900);
				flag1=false;
			 }
			 else
			   { 
				 for(i=0;i<=doctorMobileNumber.size()-1;i++)
				  {
					mno= doctorMobileNumber.get(i);
					
				  if(mno==mobileNumber)
				  {
					flag1=false;
					break;
					
				   }
				  }
		          if(flag1==true)
		          {
		    	   doctorMobileNumber.add(mobileNumber);
		    	   System.out.println("Enter age:");
		    	   doctorAge.add(sc.nextInt());
		    	   System.out.println("enter city");
		    	   doctorCity.add(sc.next());
		    	   System.out.println("Enter password:");
		    	   doctorPassword.add(sc.next());
		    	   System.out.println("Registration is Successfully.");
		    	   System.out.println("Details:Name: "+doctorName+" number:"+doctorMobileNumber);
		           Thread.sleep(900);
		        }
		    
		       
		        else 
		        {
		    	System.out.println("same mobile number is not allowed\n");
		    	int index=doctorName.size()-1;
		    	doctorName.remove(index);
		    	Thread.sleep(500);
		    	}
			}	
		}
		
			
		
		void doctorLogin() throws Exception
		{
			Scanner sc=new Scanner(System.in);
			Long mobileNumber;
		    //Thread.sleep(500);
			
			new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
			System.out.println("\t\t   ----------------------------------      ");
			System.out.println("\t\t  |This is doctor login page        |      ");
			System.out.println("\t\t   ----------------------------------       ");
			
			System.out.println(" enter your Username(mobileNumber)");
			mobileNumber=sc.nextLong();
			
			
			System.out.println("Please enter your password");
			String password =sc.next();
	        int i=0;
	        byte choice;
	        boolean flag=false;
	        
	        boolean flag11=true;
	        for(i=0;i<=doctorMobileNumber.size()-1;i++)
	        {
	        	if((doctorMobileNumber.get(i)).equals(mobileNumber)&& (doctorPassword.get(i)).equals(password))
	        	{
	        		flag=true;
	        		break;
	        	}
	        }
	        if(flag==true)
	        {
	        	while (flag11)
	        	{
	        		new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
	    			System.out.println("\t\t   ----------------------------------      ");
	    			System.out.println("\t\t  |welcome Doctor "+doctorName.get(i)+"|   ");
	    			System.out.println("\t\t   ----------------------------------      ");
	    			System.out.println("\n\n1.Appointment.\n2.Logout");
	    			choice=sc.nextByte();
	    			byte j=0;
	    			switch(choice)
	    			{
	    			case 1:
	    				if((doctorID.isEmpty()!=true))
	    				{
	    					while(j<=doctorID.size()-1)
	    					{
	    						if((i+1)==doctorID.get(j))
	    						{
	    							System.out.println("patientName: "+patientNameBooking.get(j));
	    							j++;
	    						}
	    					}
	    					Thread.sleep(4000);
	    					
	    				}
	    				else
	    				{
	    					System.out.println("No Appointment..");
	    					Thread.sleep(3000);
	    					flag11=true;
	    					
	    				}
	    				break;
	    			case 2:
	    				flag11=false;
	    				break;
	    				
	    			}
	    			
	        		
	        	}
	        }
	        else
	        {
	        	System.out.println("Login Unsuccessfull..");
	        }
			
			
		}
		
		
	
 //}
//class Java
//{
	public static void main(String[] args)throws Exception
	{
		AppointmentBooking ap =  new AppointmentBooking();
		Scanner sc =new Scanner(System.in);
		ap.dataAdd();
		boolean flag=true;
		while(flag=true)
		{
			new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
			System.out.println("-------------------------------------------------------");
			System.out.println("\t\t | Welccome to Doctor AppointmentBooking |");
			System.out.println("----------------------------------------------------------");
			System.out.println("\n 1.Doctor \t 2. Patient \t 3. Admin \t 4. Exit");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				ap.doctor();
				flag=true;
				break;
			case 2:
				ap.patient();
				flag=true;
				break;
			case 3:
				ap.admin();
				flag=true;
				break;
			default:
				System.exit(0);
				
			}
		}
		
	}

}