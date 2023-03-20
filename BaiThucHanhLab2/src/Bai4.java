import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Nhap so :");
		a=sc.nextInt();
		switch(a) {
			case 1 : System.out.println("Thang Mot");break;
			case 2 : System.out.println("Thang Hai");break;
			case 3 : System.out.println("Thang Ba");break;
			case 4 : System.out.println("Thang Tu");break;
			case 5 : System.out.println("Thang Nam");break;
			case 6 : System.out.println("Thang Sau");break;
			case 7 : System.out.println("Thang Bay");break;
			case 8 : System.out.println("Thang Tam");break;
			case 9 : System.out.println("Thang Chin");break;
			case 10 : System.out.println("Thang Muoi");break;
			case 11 : System.out.println("Thang Muoi Mot");break;
			case 12 : System.out.println("Thang Muoi Hai");break;
			default : System.out.println("Khong phai thang trong nam");
		}
	}

}
