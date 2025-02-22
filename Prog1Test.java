import java.util.Scanner;

public class Prog1Test {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
        MyObj c[] = {};
        int code[] = {0, 1, 2, 3};
        int hlist[] = {};
        for(int b = 0; b < code.length; b++) {
        	long listOfCompares[] = new long[100];
        	long compares = 0;
            double avgCompares = 0.0, sum = 0.0, strdDev = 0.0;
	        for(int i = 0; i < 100; i++) {
				c = new MyObj[1000]; 
				for (int j = 0; j < 1000; j++) { 
					c[j] = new MyObj();
				}
				hlist = ShellSort.ShellSort(c, code[b]);
				listOfCompares[i] = c[0].getCount();
				compares += c[0].getCount();
				c[0].reset();
	        }
			
			// Printing the hlist
			System.out.println("Code: " + code[b]);
			System.out.print("Hlist: ");
			for(int i = 0; i < hlist.length; i++) {
				System.out.print(hlist[i] + " ");
			}
			System.out.println();
			
			avgCompares = compares / 100.0;
			System.out.printf("Average Number of Comparisons for case %d: %.2f%n", 
					(code[b] + 1), avgCompares);
			
			for(int i = 0; i < listOfCompares.length; i++) {
				sum += Math.pow(listOfCompares[i] - avgCompares, 2);
			}
			strdDev = Math.sqrt(sum/listOfCompares.length);
			System.out.printf("Standard Deviation of Comparisons for case %d: %.2f%n", 
					(code[b] + 1), strdDev);
			System.out.println();
        }
    }
}


