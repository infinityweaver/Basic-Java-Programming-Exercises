public class Main
{
	public static void main(String[] args)
	{
		Rational f1 = new Rational(2);
		Rational f2 = new Rational(16,8);

		System.out.println(f1.getNumerator());
		System.out.println(f1.getDenominator());
		
		System.out.println(f2.getNumerator());
		System.out.println(f2.getDenominator());
	
		//returns true, since in the equal method it normalize both rational so that its simplest form is being compared
		System.out.println(f1.equals(f2));	
		
		f2.setNumerator(-4);
		f2.setDenominator(8);
	
		System.out.println(f1.isGreaterThan(f2)); //true
		System.out.println(f1.isGreaterThanOrEqualTo(f2)); //true
		System.out.println(f1.isLessThan(f2)); //false
		System.out.println(f1.isLessThanOrEqualTo(f2)); //false

		//Arithmetic operations
		f1.add(f2);
		System.out.println(f1); //f1's value is changed to 3/2

		f2.setNumerator(16);
		f2.setDenominator(8);

		f1.subtract(f2);
		System.out.println(f1); // -1/2

		f1.multiply(f2);
		System.out.println(f1); // -1/1

		f1.divide(f2); 
		System.out.println(f1); // -1/2

		f2.setNumerator(16);
		f2.setDenominator(8);

		f2.normalize();
		System.out.println(f2); // 2/1
		
	}
}