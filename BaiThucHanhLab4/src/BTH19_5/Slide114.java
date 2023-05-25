package BTH19_5;

import java.util.HashMap;
import java.util.Scanner;

public class Slide114 {

	public static void main(String[] args) {
		HashMap<String, SV> sv = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		int a = 1;
		while (a == 1) {
			System.out.println("\n1.Thêm sinh viên");
			System.out.println("2.Hiển Thị");
			System.out.println("3.Tìm sinh viên thông qua lớp");
			System.out.println("4.Tìm kiếm sinh viên qua mã sinh viên");
			int luachon;
			do {
				System.out.println("Nhập lựa chọn:");
				luachon = sc.nextInt();
			} while ((luachon < 0) || (luachon > 4));
			switch (luachon) {
			case 1:
				SV.Add(sv);
				break;
			case 2:
				SV.HienThi(sv);;
				break;
			case 3:
				SV.TimLop(sv);
				break;
			case 4:
				SV.TimMSV(sv);
				break;
			}
		}

	}

}
