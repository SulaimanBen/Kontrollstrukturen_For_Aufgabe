import java.util.Arrays;
import java.util.Comparator;

public class test {
	
	static class MyComp implements Comparator<String> {

		@Override
		public int compare(String s1, String s2) {
			// TODO Auto-generated method stub
			return s2.compareTo(s1);
		}

	

	}
	
	public static void main(String[] args) {
		
		String[] array = {
				"bb", "pp", "ff", "jj", "fh"	
			};
			
			Arrays.sort(array);
			System.out.println("Array: " + Arrays.toString(array));
			
			/*
			 *    0   1   3   3   4
			 *  [bb, ff, fh, jj, pp]
			 */
			
			int pos = Arrays.binarySearch(array, "pp");
			System.out.println("Gesucht nach pp. Position: " + pos); // 4
			
			pos = Arrays.binarySearch(array, "aa");
			System.out.println("Gesucht nach aa. Position: " + pos); // -1
			
			// Absteigend sortieren
			
			Comparator<String> comp = new MyComp();
			Arrays.sort(array , comp);
			System.out.println(Arrays.toString(array));
			pos = Arrays.binarySearch(array, "pp");
			System.out.println("Falsch gesucht nach pp. Position: " + pos); // -6
			
			pos = Arrays.binarySearch(array, "pp",comp);
			System.out.println("Gesucht nach pp. Position: " + pos); // 0
	}
}




