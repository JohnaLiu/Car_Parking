
/**
 * @author Zhijiao Liu
 *
 */

	public class Public_Account extends Account {

		public int accountNum;    //provide the predetermined id of public account
	   
	   
		Public_Account(String id){
			this.card_number=""+id;
			this.accountNum=Integer.parseInt(id)-1;
			this.payflag=0; 
			System.out.println("Public Card Number: "+this.card_number+" Public Account Number: "+this.accountNum+" Public Payment State: "+this.payflag);
		}
		

	}
