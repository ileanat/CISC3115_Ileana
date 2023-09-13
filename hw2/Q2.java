public class Q2 {

	
	public static int m2(double[] a) {
		int largest=0;
		for (int i=0; i<a.length; i++)
			if (a[i]>a[largest])
				largest = i;
		return largest;
		}
	public static void main (String [] args){
        double [] arr = {1.6,2.1,3.6,6.8,8.1,9.1};
        System.out.println(m2(arr));
	}
}
