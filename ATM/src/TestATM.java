public class TestATM {
	
	public static void main(String[] args){
		
		ATMMachine atmMachine = new ATMMachine();
		
		atmMachine.insertCard("1234 5678 0000 1111");
		
		atmMachine.ejectCard();
		
		atmMachine.insertCard("1234 5678 0000 2222");
		
		atmMachine.insertPin(1234);
		
		atmMachine.requestCash(2000);
               
                atmMachine.ejectCard();
		
		atmMachine.insertCard("1234 5678 0000 2222");
		

		
	}	
}