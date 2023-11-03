public class Rational extends Number implements Comparable{
	private long numerator;
	private long denominator;

	public Rational(){
		numerator=0;
		denominator=1;
	}

	public Rational(long numerator, long denominator){
	long gcd = gcd(numerator, denominator);
	if(denominator > 0)
		this.numerator = numerator/gcd;
	else
		this.numerator = -numerator / gcd;
	this.denominator = Math.abs(denominator) / gcd;
	}
	
	private static long gcd(long a, long b){
	if(b==0)
		return a;
	else
		return gcd(b, a%b);
	}

	public long getNumerator(){
		return numerator;
	}

	public long getDenominator(){
		return denominator;
	}

	public Rational add(Rational r){
	long n = numerator * r.denominator + denominator * r.numerator;
	long d = denominator * r.denominator;
	return new Rational(n,d);
	}
	
	public Rational subtract(Rational r){
		long n = numerator * r.denominator - denominator * 
r.numerator;
	long d = denominator * r.denominator;
	return new Rational(n,d);
	}

	public Rational multiply (Rational r){
		long n = numerator * r.denominator;
		long d = denominator * r.numerator;
		return new Rational(n, d);
	}
	
	public String toString(){
		if(denominator ==1)
			return numerator + "";
		else
			return numerator + "/"+denominator;
	}

	

}
