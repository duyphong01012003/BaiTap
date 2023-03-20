import java.util.Scanner;

public class Bai6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,tich = 1;
		System.out.println("Nhap 1 so :");
		a=sc.nextInt();
		while(a>0) {
			tich*=a;
			a--;
		}
		System.out.println("giai thua = " + tich);
	}

}
