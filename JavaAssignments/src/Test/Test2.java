package Test;


	class Bank{
		String bankName,area,phoneNo;
		
		public static void main(String args[]){
			Bank bank=new Bank();
			System.out.println(bank.bankName);
			bank.Bank();
		}
		 void Bank(){
			System.out.println("inside constructor");
		}
	}
	
	

