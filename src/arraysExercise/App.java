package arraysExercise;

public class App {

	public static void main(String[] args) {
	int [] intArray = {1,2,3,4,5,6,7,8,9,10};
	System.out.println("Arrays (1):");
	for (int i : intArray) {
		System.out.println(i);
	}
	System.out.println();
	
	System.out.println("Arrays (2a):");
	for (int i =0; i<intArray.length; i++) {
		int j=intArray[i]*2;
		intArray[i] = j;
		System.out.println(j);
	}
	System.out.println();
	
	System.out.println("Arrays (2b):");
	for (int i =0; i<intArray.length; i++) {
		int j=intArray[i]*10;
		intArray[i] = j;
		System.out.println(j);
	}
	}

}
