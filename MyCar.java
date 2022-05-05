package Week3.day1;

public class MyCar {
public static void main(String[] args) {
	Vehicle v= new Vehicle();
	Car c= new Car();
	BMW b=new BMW();
	
	v.applyBreak();
	v.soundHorn();
	
	c.handBreak();
    c.turnAC();
	
	b.autoPark();
	
}
}
