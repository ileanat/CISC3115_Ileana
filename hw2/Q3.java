public class Q3 {

	static int m3(double[] a, double x) {
		int count=0;
		for (int i=0; i<a.length; i++)
			if (a[i]==x)
				count++;
		return count;
		}
	public static void main (String [] args){
        double [] arr = {1.6,7.8,3.6,6.8,7.8,9.1};
        double z =7.8;
        System.out.println(m3(arr,z));
	}
}

