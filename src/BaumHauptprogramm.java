import java.util.Collection;
import java.util.TreeSet;

public class BaumHauptprogramm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> baum = new TreeSet<Integer>();
		
		int[] fuellung = {7,12,0,5,9,3,8,2,13,10,15,1,-55,240,4,8};
		
		for(int x = 0; x < fuellung.length; x++) {
			baum.add(fuellung[x]);
		}
		
		System.out.println(baum.toString());
		
		Object[] aftersort = baum.toArray();
		int after = (int) aftersort[14];
		
		System.out.println(after);
		
	}

	

}
