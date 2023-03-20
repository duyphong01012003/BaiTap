import java.util.Scanner;

public class Bai9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a;
		System.out.println("Nhap chuoi :");
		a=sc.nextLine();
		char[] arr=a.toCharArray();
		int chuHoa = 0, chuThuong = 0, So = 0;
		for(int i=0;i<arr.length;i++) {
			char b = arr[i];
			if(Character.isUpperCase(b)) chuHoa++;
			if(Character.isLowerCase(b)) chuThuong++;
			if(Character.isDigit(b)) So++;
		}
		System.out.printf("chuoi vua nhap co %d chu hoa, %d chu thuong va %d so",chuHoa,chuThuong,So);
	}
}
