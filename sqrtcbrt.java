import java.util.Scanner;

public class sqrtcbrt {

	private static Scanner s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n; 
        System.out.print("enter a number:");
		s = new Scanner(System.in);
        n = s.nextInt();
        System.out.println("enter the square root of n: "+sqrt(n));
        System.out.println("enter the qube root of n: "+cbrt(n));
	}

	private static int cbrt(int n) {
		// TODO Auto-generated method stub
		return n*n*n;
	}

	private static int sqrt(int n) {
		// TODO Auto-generated method stub
		return n*n;
		
	}

}
