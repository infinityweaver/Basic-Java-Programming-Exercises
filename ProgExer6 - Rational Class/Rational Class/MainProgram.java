public class MainProgram
{
	public static void main(String[] args)
	{
		RationalNumber rational1 = new RationalNumber(2,4);//main object
		RationalNumber rational2 = new RationalNumber(3,6);
		//rational.setNumerator(6);
		System.out.println("\nFirst Rational Number: " + rational1);
		System.out.println("Second Rational Number: " + rational2);
		System.out.println("\nOPERATIONS\n");
		System.out.println("\tADDITION\t");
		rational1.add(rational2);
		System.out.print("\n");
		System.out.println("\tSUBTRACTION\t");
		rational1.subtract(rational2);
		System.out.print("\n");
		System.out.println("\tMULTIPLICATION\t");
		rational1.multiply(rational2);
		System.out.print("\n");
		System.out.println("\tDIVISION\t");
		rational1.divide(rational2);
		System.out.println("\n\tCOMPARISON OF TWO RATIONAL NUMBERS\t\n");
		if(rational1.isLessThan(rational2) == true)
			System.out.println(rational1 + " is less than " + rational2);
		else
			System.out.println(rational1 + " is greater than or equal to " + rational2);
		System.out.print("\n");
		if(rational1.isGreaterThan(rational2) == true)
			System.out.println(rational1 + " is greater than " + rational2);
		else
			System.out.println(rational1 + " is less than or equal to " + rational2);
		System.out.print("\n");
		if(rational1.isLessThanOrEqualTo(rational2) == true)
			System.out.println(rational1 + " is less than or equal to " + rational2);
		else
			System.out.println(rational1 + " is greater than " + rational2);
		System.out.print("\n");
		if(rational1.isGreaterThanOrEqualTo(rational2) == true)
			System.out.println(rational1 + " is greater than or equal to " + rational2);
		else
			System.out.println(rational1 + " is less than " + rational2);
	}
}