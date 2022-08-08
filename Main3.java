package StudentProject.atmproject;
import java.util.*;
import java.util.Map.Entry;
 class Country {
	 private HashMap<String, String> M1;
		
		public Country() {
			M1 = new HashMap<String, String>();
		}
		
		public HashMap<String, String> saveCountryCapital(String countryName, String capital) {
			M1.put(countryName, capital);
			return M1;
		}
	
	 String getCountryName(String country)
	{
		String cap="";
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			
			if (me.getValue().equals(country))
				return me.getKey();
		}
		
		return "Country not found";
	}
   String getCapitalName(String capital)
  {
	  String c="";
	  
	 
		 c=M1.get(capital); 
	  
	return c;
  }
   public HashMap<String, String> swap() {
		HashMap<String, String> M2 = new HashMap<String, String>();
		
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> ite = set.iterator();
		
		while (ite.hasNext()) {
			Map.Entry<String, String> swp = ite.next();
			M2.put(swp.getValue(), swp.getKey());
		}
		
		return M2;
	}
}
 
public class Main3
{
	
	public static void main(String args[])
	{
		Country ob=new Country();
		HashMap<String,String> H1=new HashMap<String,String>();
		ob.saveCountryCapital("India","Delhi");
		ob.saveCountryCapital("Japan","Tokyo");
		ob.saveCountryCapital("France", "Paris");
		ob.saveCountryCapital("Italy", "Rome");
		System.out.println(ob.getCountryName("Paris"));
		System.out.println(ob.getCapitalName("India"));
		HashMap<String, String> M2 = ob.swap();
		System.out.println(M2);
		
	}

}
