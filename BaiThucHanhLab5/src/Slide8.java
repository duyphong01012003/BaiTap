
public class Slide8 {

	public static void main(String[] args) {
		try {
			int a[] = new int[5];
			a[5] = 30/0;
		}
		catch(ArithmeticException e) {
			System.out.println("task1 is competed");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("task 2 competed");
		}
		catch(Exception e) {
			System.out.println("common task competed");
		}
		System.out.println("res of the code ...");
	}

}
