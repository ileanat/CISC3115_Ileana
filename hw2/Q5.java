import java.util.Scanner;
public class P2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=0;
		while (sc.hasNextInt()) {
			int k = sc.nextInt();
			if (k==0) {
				System.out.print(count+" ");
				count=0;
		} else if (k<0)
				count++;
			}
	}
}
