
public class loopy {

	/**
	 * Aven Stewart
	 * 09/29/13
	 */
	
	public static void tophalf() {
			int wall = 8;
			System.out.println("#==================#");
			for (int count = 0;count <= 12;count=count+4){
				System.out.print("|");   // prints pipe
				wall = wall - 2;           // increments wall space by -2
				for (int space = wall;space>=0;space--){  // prints <wall> number of spaces
					System.out.print(" ");  
				}
				System.out.print("<>");                        
				for (int count_a = count;count_a>0;count_a--){
					System.out.print(".");
				}
				System.out.print("<>");
				for (int space2 = wall;space2>=0;space2--){  // prints <wall> number of spaces
					System.out.print(" ");  
				}
				System.out.print("|");
				System.out.println();
			}
	}
	public static void bottomhalf() {
			int wall = 0;
			// print out start at 12
			for (int count = 12;count >= 0;count=count-4){
				System.out.print("|");   // prints pipe
				
				for (int space = wall;space>=0;space--){  // prints <wall> number of spaces
					System.out.print(" ");  
				}
				System.out.print("<>");                        
				for (int count_a = count;count_a>0;count_a--){
					System.out.print(".");
				}
				System.out.print("<>");
				for (int space2 = wall;space2>=0;space2--){  // prints <wall> number of spaces
					System.out.print(" ");  
				}
				wall = wall + 2;
				System.out.print("|");
				System.out.println();
			}
			System.out.println("#==================#");
		
	}
	public static void main(String[] args) {
		tophalf();
		bottomhalf();
	}

}
