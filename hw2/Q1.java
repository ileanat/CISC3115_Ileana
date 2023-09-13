public class Q1{
public static int m1(int[] a) {
	int sum=0;
	for (int i=0; i<a.length; i++)
		if (a[i]>i && a[i]%9==0)
			sum += a[i];
	return sum;
}
public static void main (String [] args){
	int [] arr = {1,2,3,6,8,9};
	System.out.println(m1(arr));
}
}
