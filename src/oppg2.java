import java.util.ArrayList;
public class oppg2 {

	public static void main(String[] args) {
		ArrayList<Integer> liste = new ArrayList<>();
		
		for(int i = 0; i < 5; i++)
		{
			if(i != 3)
				liste.add(i);
			else
				liste.add(4);
		}
		for(Integer k : liste)
		{
			System.out.println(k);
		}
		liste.set(2,3);
		for(Integer k : liste)
		{
			System.out.println(k);
		}
		liste.clear();
		if(liste.isEmpty())
			System.out.println("Tom");
		
		
	}

}
