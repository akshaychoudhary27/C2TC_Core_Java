import java.util.HashMap;
import java.util.Map;

public class Predict2 {
	public static void main(String [] args)
	{
	Map<String,String> map=new HashMap<>();
	map.put("Name","Tanay");
	map.put("Occupation","Engineer");
	map.put("Country","India");
	System.out.println(map.get("Salary"));
	}

}
