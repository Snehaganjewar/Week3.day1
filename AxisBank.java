package Week3.day1;

public class AxisBank extends BankInfo{
public void deposit()
    {
	System.out.println("I opned fixed deposit in Axis bank");
	}
public static void main(String[] args) {
	BankInfo obj=new BankInfo();
	obj.SavingAC();
	obj.fixed();
	obj.deposit();
	
	AxisBank override=new AxisBank();
	override.deposit();
}
}
