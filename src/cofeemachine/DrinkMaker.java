package cofeemachine;

public class DrinkMaker {

	public void forwardsMessageToCoffeMachine(String input){
		CoffeeMachine.receiveOrderFromDrinkMaker("M:"+input);
	}
}
