package BankingApplication;

import java.util.Scanner;

public class BankingApplication 
{
  public static void main(String args[])
  {
	  BankAccount obj = new BankAccount("Ajay Devgan","AD00001");
	  obj.showMenu();
  }
}

class BankAccount
{
  private static final int CostomerA = 0;
private static final int C = 0;
int Balance;
  int PreviousTransiction;
  String CostomerName;
  String CostomerId;

  
  BankAccount(String cName,String cId)
  {
	  CostomerName=cName;
	  CostomerId=cId;
	 
	
  }
	  

	


void deposit(int amount)
   {
	   if(amount !=0)
	   {
		   Balance= Balance+amount;
		   PreviousTransiction=amount;
		 
	   }
   }
   void withdraw(int amount)
   {
	   if (amount != 0)
	   {
		 Balance= Balance-amount;
		 PreviousTransiction=-amount;
		 
	   }
   }
   void getPreviousTransiction()
   {
	  if (PreviousTransiction>0) 
	  {
		System.out.println("deposit: " +(PreviousTransiction));
	  }
   
   else if (PreviousTransiction<0)
   {
	   System.out.println("withdraw: " +Math.abs(PreviousTransiction));
   }
   else {
	   System.out.println("No Transiction Occured");
	   
   }
   }
   void showMenu()
   {
	   char option = '\0';
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("welcome: " + CostomerName);
	   System.out.println("yourId : " +  CostomerId);
	   System.out.println("\n");
	   
	   System.out.println("A : check your balance");
	   System.out.println("B : deposit");
	   System.out.println("C : withdraw");
	   System.out.println("D :PreviousTransiction ");
	   System.out.println("E : exit the system");
	   
	 do {
		 System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		 System.out.println("Enter your option");
		 System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=**=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		 option=sc.next().charAt(0);
		 System.out.println("\n");
		 
		 switch (option)
		 {
		 case  'A':
		 System.out.println("--------------------------------------------------------------");
		 System.out.println(" balance=" +Balance);
		 System.out.println("---------------------------------------------------------------");
	     System.out.println("\n");
	     break;
		 case  'B':
		 System.out.println("--------------------------------------------------------------");
	     System.out.println(" Enter amount to deposit");
		 System.out.println("---------------------------------------------------------------");
		 int amount= sc.nextInt();
		 deposit (amount);
		 System.out.println("\n");
		 break;
		 
		 case  'C':
		 System.out.println("--------------------------------------------------------------");
		 System.out.println(" Enter an amount to withdraw");
		 System.out.println("---------------------------------------------------------------");
		 int amount2=sc.nextInt();
		 withdraw (amount2);
		 System.out.println("\n");
		 break;
		 
		 case  'D':
		 System.out.println("----- ---------------------------------------------------------");
		 getPreviousTransiction();
		 System.out.println("---------------------------------------------------------------");
		 System.out.println("\n");
		 break;   
		   
		 case  'E':
		System.out.println("====================================================================");
	     break;
	     
	     default:
	    System.out.println("invalid option ! please Enter correct option");
	    break;
	    
		 }
		 }
        while(option!='E');
	 System.out.println("Thank you for the using our servicess.....!!");
	 
}
}
  