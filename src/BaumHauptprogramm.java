import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;

public class BaumHauptprogramm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> baum = new TreeSet<Integer>();
		
		int[] fuellung = {7,12,0,5,9,3,8,2,13,10,15,1,-55,240,4,8,34,22,3,3434,21,2,34,5,467,76,88,7,0,87,6,17,7,48,67};
		
		for(int x = 0; x < fuellung.length; x++) {
			baum.add(fuellung[x]);
		}
		
		System.out.println(baum.toString());
		
		Object[] aftersort = baum.toArray();
		int[] sortiert = new int[baum.size()];
		int after = (int) aftersort[14];
		
		System.out.println(after);
		
		for(int x = 0; x < baum.size(); x++) {
			sortiert[x] = (int) aftersort[x];
		}
		
		
		for(int x = 0; x < sortiert.length; x++) {
			System.out.print(sortiert[x] + " ");
		}
		
		ArrayList<Integer> colsort = new ArrayList<Integer>();
		
		colsort.add(5);
		colsort.add(1);
		colsort.add(4);
		colsort.add(10);
		
		Collections.sort(colsort);
		
		System.out.println("\n" + colsort.toString());
		
	}

	

}
