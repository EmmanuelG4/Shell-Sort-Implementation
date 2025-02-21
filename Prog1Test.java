import java.util.Scanner;

public class Prog1Test {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
	   	MyObj a = new MyObj(1, 2, 3);
	   	MyObj b = new MyObj(2, 2, 3);
	   	
		System.out.println(a.lessThan(b));
		System.out.println(b.lessThan(a));
		System.out.print("A: "); // added
		a.print();
		System.out.print("B: "); // added
		b.print();
		System.out.println(); // added line
		
		System.out.println("original array of 10:");
		MyObj c[] = new MyObj[10]; // used to have 3
		for (int i = 0; i < 10; i++) { // used to have 3
			c[i] = new MyObj();
			c[i].print();
		}
		System.out.println(); // added line
	
		System.out.println("swapped array of 10:");
		MyObj temp = c[0];
		c[0] = c[1];
		c[1] = temp;
		System.out.println(" ");
		for (int i = 0; i < 10; i++) { // used to have 3
			c[i].print();
		}
		System.out.println(" ");
		System.out.println(); // added line
		
		System.out.println("sorted array:");
		ShellSort.ShellSort(c, 3); // used to be 1
		for (int i = 0; i < 10; i++) { // used to have 3
			c[i].print();
		}
		System.out.println();
		System.out.println("Count: " + c[0].getCount()); // not sure about this

    }
}

