import java.util.Scanner;
public class P2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double smallest=0;
		int header = sc.nextInt();
		smallest = sc.nextDouble();
			for (int i=1; i<header; i++) {
				double w = sc.nextDouble();
					if (w<smallest)
						smallest = w;
			}
		System.out.println(smallest);
		}
}
