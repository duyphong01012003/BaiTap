package BTH19_5;

import java.util.Map;
import java.util.Scanner;

public class SV {
	public String MSV;
	public String HoTen;
	public String Lop;
	
	public static void Add(Map<String,SV> a) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số lượng sinh viên:");
		int n=sc.nextInt();sc.nextLine();
		for(int i =0;i<n;i++) {
			SV sinhVien= new SV();
			System.out.println("Nhập mã sinh viên:");
			sinhVien.MSV=sc.nextLine();
			System.out.println("Nhập họ và tên:");
			sinhVien.HoTen=sc.nextLine();
			System.out.println("Nhập lớp:");
			sinhVien.Lop=sc.nextLine();
			a.put(sinhVien.MSV, sinhVien);
		}
	}
	public static void HienThi(Map<String,SV> a) {
		for(Map.Entry<String,SV>std :a.entrySet()){
			System.out.printf("sinh viên:%s - mã sinh viên:%s - lớp:%s\n",std.getValue().HoTen,std.getValue().MSV,std.getValue().Lop);
		}
	}
	public static void TimLop(Map<String,SV> a) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên lớp:");
		String lop=sc .nextLine();
		boolean check= false;
		for(SV m:a.values()) {
			if(m.Lop.equals(lop)) {
				System.out.printf("sinh viên:%s - mã sinh viên:%s - lớp:%s",m.HoTen,m.MSV,m.Lop);
				check=true;
			}
		}
		if(!check)
			System.out.println("Không tìm thấy");
	}
	public static void TimMSV(Map<String,SV> a)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập mã sinh viên:");
		String MA=sc .nextLine();
		boolean check= false;
		for(Map.Entry<String,SV> std:a.entrySet()) {
			if(std.getKey().equals(MA)) {
				System.out.printf("sinh viên:%s - mã sinh viên:%s - lớp:%s\n",std.getValue().HoTen,std.getValue().MSV,std.getValue().Lop);
				check=true;
			}
			}
		if(!check)
			System.out.println("Khong tim thấy");
		}
		
	}

