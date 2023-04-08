public class Rational
{
	private int numerator;
	private int denominator;

	public Rational(int numerator, int denominator)
	{
		this.numerator = numerator;
		if(denominator != 0)
			this.denominator = denominator;
		else 
			this.denominator = 1;
	}

	public Rational(int wholeNumber)
	{
		this.numerator = wholeNumber;
		this.denominator = 1;
	}

	public Rational()
	{
		this.numerator = 0;
		this.denominator = 1;
	}

	public int getNumerator()
	{
		return this.numerator;
	}

	public int getDenominator()
	{
		return this.denominator;
	}

	public void setNumerator(int numerator)
	{
		this.numerator = numerator;
	}

	public void setDenominator(int denominator)
	{
		if(denominator != 0)
			this.denominator = denominator;
		else 
			this.denominator = 1;
	}

	public boolean isLessThan(Rational fraction)
	{
		if((this.numerator*fraction.getDenominator()) < (fraction.getNumerator()*this.denominator))
			return true;
		else 
			return false;
	}

	public boolean isLessThanOrEqualTo(Rational fraction)
	{
		if((this.numerator*fraction.getDenominator()) <= (fraction.getNumerator()*this.denominator))
			return true;
		else 
			return false;
	}

	public boolean isGreaterThan(Rational fraction)
	{
		if((this.numerator*fraction.getDenominator()) > (fraction.getNumerator()*this.denominator))
			return true;
		else 
			return false;
	}

	public boolean isGreaterThanOrEqualTo(Rational fraction)
	{
		if((this.numerator*fraction.getDenominator()) >= (fraction.getNumerator()*this.denominator))
			return true;
		else 
			return false;
	}

	public void add(Rational fraction)
	{
		int addDenominator = this.denominator * fraction.getDenominator();
		int addNumerator = (((addDenominator/this.denominator)*this.numerator)+(((addDenominator/fraction.getDenominator())*fraction.getNumerator())));
		this.denominator = addDenominator;
		this.numerator = addNumerator;
		this.normalize();

	}

	public void subtract(Rational fraction)
	{
		int subDenominator = this.denominator * fraction.getDenominator();
		int subNumerator = (((subDenominator/this.denominator)*this.numerator)-(((subDenominator/fraction.getDenominator())*fraction.getNumerator())));
		this.denominator = subDenominator;
		this.numerator = subNumerator;
		this.normalize();
	}

	public void multiply(Rational fraction)
	{
		int multDenominator = this.denominator * fraction.getDenominator();
		int multNumerator = this.numerator * fraction.getNumerator();
		this.denominator = multDenominator;
		this.numerator = multNumerator;
		this.normalize();
	}

	public void divide(Rational fraction)
	{
		int divDenominator = this.denominator * fraction.getNumerator();
		int divNumerator = this.numerator * fraction.getDenominator();
		this.denominator = divDenominator;
		this.numerator = divNumerator;
		this.normalize();
	}

	public void normalize()
	{
		boolean isNumNegative = false, isDenomNegative = false;

		if(this.numerator < 0)
		{
			this.numerator *= -1;
			isNumNegative = true;
		}

		if(this.denominator < 0)
		{
			this.denominator *= -1;
			isDenomNegative = true;
		}

		int smallNum = (this.numerator<this.denominator)? this.numerator: this.denominator;

		for(int i=2; i<=smallNum; )
		{
			if(this.numerator%i==0 && this.denominator%i==0)
			{
				this.numerator/=i;
				this.denominator/=i;
			}
			else 
				i++;
		}

		if(isNumNegative)
		{
			this.numerator *= -1;
			isNumNegative = false;
		}

		if(isDenomNegative)
		{
			this.denominator *= -1;
			isDenomNegative = false;
		}


		if(this.denominator < 0 && this.numerator < 0)
		{
			this.denominator*=-1;
			this.numerator*=-1;
		}
	}

	@Override
	public String toString()
	{
		return this.numerator + "/" + this.denominator;
	}

	@Override
	public boolean equals(Object obj)
	{
		Rational other = (Rational) obj;
		this.normalize();
		other.normalize();
		if((this == obj) || (this.numerator == other.getNumerator() && this.denominator == other.getDenominator()))
			return true;
		else 
			return false;
	}


}