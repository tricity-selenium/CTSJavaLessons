package lesson_17_Interface;

public class ICICI implements Bank {

	@Override
	public double getRateOfInterst() {
		// TODO Auto-generated method stub
		return 7.5;
	}

	@Override
	public double getRateOfDeposit() {
		// TODO Auto-generated method stub
		return 4.5;
	}

	public static void main(String[] args) {
	
		ICICI i1 = new ICICI();
		System.out.println(i1.getRateOfDeposit());

	}

}
