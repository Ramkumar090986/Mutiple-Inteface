package org.bank;

public class ICICI implements RBI,SBI{

	@Override
	public void saving() {
		System.out.println("Savings is 3%");
		
	}

	@Override
	public void deposit() {
		System.out.println("Deposit is 4%");
		
	}



	@Override
	public void fixed() {
		System.out.println("Fixed is 5%");
		
	}

	@Override
	public void recurringDeposit() {
		System.out.println("Deposit is 7%");
		
	}
	public static void main(String[] args) {
		ICICI ic=new ICICI();
		ic.saving();
		ic.deposit();
		ic.fixed();
		ic.recurringDeposit();
	}
}
