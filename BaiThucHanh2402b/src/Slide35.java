import java.util.Scanner;

public class Slide35 {

	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so thu nhat: ");
		a=sc.nextInt();
		System.out.println("Nhap so thu hai: ");
		b=sc.nextInt();
		if(a>b) System.out.println("so nho nhat la: "+b);
		else System.out.println("so nho nhat la: "+a);
	}

}
