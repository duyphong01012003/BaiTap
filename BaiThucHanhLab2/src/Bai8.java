import java.util.Scanner;

public class Bai8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,tong=0;
		System.out.println("Nhap so :");
		a=sc.nextInt();
		for(int i=1;i<=a;i++) {
			tong+=i;
		}
		System.out.println("TBC = " + (tong*1.0)/a);
	}

}
