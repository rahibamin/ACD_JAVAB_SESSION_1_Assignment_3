// Author Rahib Amin
// Session 1 Assignment 3


import java.util.Scanner;

public class BitwiseandLogical {

	public static void main(String[] args) {
	
	byte x,y;
	
	Scanner sc = new Scanner(System.in);

	System.out.print("Input value for x: ");
	x = sc.nextByte();
	System.out.print("Input value for x: ");
	y = sc.nextByte();
	
	
	if (x == y && y == x) {
		
		System.out.println();
		System.out.println("Bitwise");
		System.out.println("X and Y are Equal to X,Y");
			
	}
	else {
		System.out.println();
		System.out.println("X and Y are NOT Equal to X,Y");
		
	}
	
	System.out.println();
	int z = x&y;
	System.out.println("Logical: " + z);	
		
	}

}
