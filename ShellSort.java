import java.util.Scanner;

public class ShellSort {
    
    public static int[]  ShellSort(MyObj[] arr, int code) {
    	int hlist[] = {};
		
    	// Generating the hlist
    	if(code == 0) {
    		hlist = new int[1];
			hlist[0] = 1;
    	}
    	else if(code == 1) {
    		int size = 0;
			int h = 1;
			while(((int)Math.pow(2, h) - 1) < arr.length) {
				h++;
				size++;
			}
			hlist = new int[size];
			int exp = size;
			for(int f = 0; f < size; f++) {
				hlist[f] = ((int)Math.pow(2, exp)) - 1;
				exp--;
			}
    	}
    	else if(code == 2) {
    		int size = 0;
			int h = 1;
			while((((int)Math.pow(3, h)) - 1)/2 < arr.length) {
				h++;
				size++;
			}
			hlist = new int[size];
			int exp = size;
			for(int f = 0; f < size; f++) {
				hlist[f] = (((int)Math.pow(3, exp)) - 1)/2;
				exp--;
			}
    	}
    	else if(code == 3) {
    		int tempList[] = new int [250];
    		tempList[0] = 1;
    		int h = 1, p = 1, o = 1, size = 1, endOfList = 1;
			while(true) {
				h = endOfList * 2;
				p = endOfList * 3;
				o = endOfList * 6;
				
				if(h < arr.length) {
					tempList[size] = h;
					size++;
				}
				else {
					break;
				}
				if(p < arr.length) {
					tempList[size] = p;
					size++;
				}
				if(o < arr.length) {
					tempList[size] = o;
					size++;
				}
				
				if(o < arr.length) {
					endOfList = o;
				}
				else if(p < arr.length) {
					endOfList = p;
				}
				else {
					endOfList = h;
				}
			}
			
			hlist = new int[size];
			for(int i = 0; i < size; i++) {
				hlist[i] = tempList[i];
			}
    	}
    	else {
    		System.out.println("Error: Invalid Code.");
			System.exit(0);
    	}
    	
    	// Reversing the hlist
    	int len = hlist.length;
    	for(int i = 0; i < (len/2); i++) {
    		int temp = hlist[i];
    		hlist[i] = hlist[len - 1 - i];
    		hlist[len - 1 - i] = temp;
    	}
    	
		// Performing insertion sort 
		for(int k = 0; k < hlist.length; k++){
	        for(int j = 1; j < arr.length; j++){
	            int i = j;
	            while ((i >= hlist[k]) && (arr[i].lessThan(arr[i - hlist[k]]))){
	                MyObj temp = arr[i];
	                arr[i] = arr[i - hlist[k]];
	                arr[i - hlist[k]] = temp;
	                i = i - hlist[k];
	            } 
	        }
	    }
		
		// Printing out the hlist
		System.out.println("Hlist: ");
		for(int i = 0; i < hlist.length; i++) {
			System.out.print(hlist[i] + " ");
		}
		System.out.println();
		
        return hlist;
    }
}
