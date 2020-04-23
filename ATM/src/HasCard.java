public class HasCard implements ATMState {
	
	ATMMachine atmMachine;
	
	public HasCard(ATMMachine newATMMachine){
		
		atmMachine = newATMMachine;
		
	}

        @Override
	public void insertCard() {
		
		System.out.println("You can only insert one card at a time");
		
	}
        
        public void insertCard(String string){
        String s = string;
        System.out.println("Card Inserted: "+s);
        }

        @Override
	public void ejectCard() {
		
		System.out.println("Your card is ejected");
		atmMachine.setATMState(atmMachine.getNoCardState());
		
	}

        @Override
	public void requestCash(int cashToWithdraw) {
		
		System.out.println("You have not entered your PIN");
		
		
	}

    /**
     *
     * @param pinEntered
     */
    @Override
	public void insertPin(int pinEntered) {
		
		if(pinEntered == 1234){
			
			System.out.println("You entered the correct PIN");
			atmMachine.correctPinEntered = true;
			atmMachine.setATMState(atmMachine.getHasPin());
			
		} else {
			
			System.out.println("You entered the wrong PIN");
			atmMachine.correctPinEntered = false;
			System.out.println("Your card is ejected");
			atmMachine.setATMState(atmMachine.getNoCardState());
			
		}	
	}	
}