import java.util.Scanner;

public class Bai5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,tong=0;
		while(tong<=100) {
		System.out.println("Nhap so :");
		a=sc.nextInt();
		tong+=a;
		}
		System.out.println("Tong cac so vua nhap : " + tong);
	}

}
