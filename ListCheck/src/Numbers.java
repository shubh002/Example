import java.util.*;


public class Numbers {

	private int no1=10;
	private int no2=20;
	private List<Integer> list;
	
	public Numbers()
	{
		list = new ArrayList<Integer>();
		list.add(no1);
		list.add(no2);
	}
	public List<Integer> getList()
	{
		return list;
	}
	
}
