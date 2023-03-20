import java.util.Scanner;

public class Bai11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Nhap so phan tu trong mang :");
		n=sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<a.length;i++) {
			System.out.printf("Nhap phan tu thu %d :",i);
			a[i]=sc.nextInt();
		}
		System.out.println("Mang vua nhap: ");
		for(int i=0;i<a.length;i++) {
			System.out.printf(a[i] + "  ");
		}
		int check;
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
				check=a[i];
				a[i]=a[j];
				a[j]=check;
				}
			}
		}
		System.out.println("\nMang da sap xep:");
		for(int i=0;i<a.length;i++) {
			System.out.printf(a[i] + "  ");
		}
	}

}
