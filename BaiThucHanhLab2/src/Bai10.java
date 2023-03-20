import java.util.Scanner;

public class Bai10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a;
		do {
			System.out.println("Nhap chuoi :");
			a=sc.nextLine();
			if(a.length() >80) System.out.println("Khong hop le!");
		}while(a.length() > 80);
		char[] arr=a.toCharArray();
		System.out.println("Nhap ky tu muon tim :");
		String b = sc.nextLine();
		char c=b.charAt(0);
		int dem =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == c) dem++;
		}
		System.out.println("So lan xuat hien cua ky tu can tim: "+dem);
	}

}
