import java.util.Scanner;

public class Slide34 {

	public static void main(String[] args) {
		double a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a = ");
		a=sc.nextDouble();
		System.out.println("Nhap b = ");
		b=sc.nextDouble();
		System.out.println("Nhap c = ");
		c=sc.nextDouble();
		System.out.println(a+"x^2+"+b+"x+"+c+"=0");
		double delta=Math.pow(b, 2)-4*a*c,x1,x2;
		if(a==0) {
			if(b==0) {
				if(c==0) System.out.println("Phuong trinh vo so nghiem");
				else System.out.println("Phuong trinh vo nghiem");
			}
			else {
				if(c==0) {
					System.out.println("x = 0");
				}
				else {
					x1=-c/b;
					System.out.println("x = "+ x1);
				}
			}
		}
		else {
			x1=(-b-Math.sqrt(delta))/2*a;
			x2=(-b+Math.sqrt(delta))/2*a;
			if(delta>0) {
				System.out.println("phuong trinh co 2 nghiem phan biet");
				System.out.println("x1 = "+x1);
				System.out.println("x2 = "+x2);
			}
			else {
				if(delta<0) System.out.println("phuong trinh vo nghiem");
				else System.out.println("phuong trinh co nghiem kep x = "+x1);
			}
		}

	}

}
