package Week3.day1;

public class Students {
	public int getStudentInfo(int id)
	{
		System.out.println(id);
		return id;
	}
	public void getStudentInfo (String name, int id)
	{
		System.out.println(name+id);
		return;
	}
	public void getStudentInfo (String name, int id, String email)
	{
		System.err.println(name+id+email);
		return;
	}
	
public static void main(String[] args) {
	Students info=new Students();
	info.getStudentInfo(420);
	info.getStudentInfo("SG " , 416);
	info.getStudentInfo("KG" , 415 , "SG@funloving.com");
}

}
