

public class GumballMachineTestDrive {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(5);

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.insertDime();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertDime();
		gumballMachine.insertDime();
		gumballMachine.insertNickel();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		System.out.println("IS Gumball In slot: " + gumballMachine.isGumballInSlot());
		gumballMachine.takeGumballFromSlot();
		System.out.println("IS Gumball In slot: " + gumballMachine.isGumballInSlot());

		System.out.println(gumballMachine);
	}
}
