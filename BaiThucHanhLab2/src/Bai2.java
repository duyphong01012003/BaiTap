import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Nhap so :");
		a=sc.nextInt();
		if(a%2==0) System.out.println("so vua nhap la so chan");
		else System.out.println("so vua nhap la so le");
	}

}
