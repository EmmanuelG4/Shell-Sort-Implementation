import java.util.Scanner;

public class Prog1Test {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
   	MyObj a = new MyObj(1, 2, 3);
   	MyObj b = new MyObj(2, 2, 3);
 
	System.out.println(a.lessThan(b));
	System.out.println(b.lessThan(a));
	a.print();
	b.print();

	MyObj c[] = new MyObj[3];
	for (int i = 0; i < 3; i++) {
		c[i] = new MyObj();
		c[i].print();
	}

	MyObj temp = c[0];
	c[0] = c[1];
	c[1] = temp;
	System.out.println(" ");
	for (int i = 0; i < 3; i++) {
		c[i].print();
	}
	System.out.println(" ");
	ShellSort.ShellSort(c, 1);
	for (int i = 0; i < 3; i++) {
		c[i].print();
	}

    }
}

