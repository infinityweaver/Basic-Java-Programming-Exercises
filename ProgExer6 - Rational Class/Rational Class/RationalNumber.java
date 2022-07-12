class RationalNumber
{
	private int numerator;
	private int denominator;

	public RationalNumber(int numerator,int denominator)
	{
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public RationalNumber(int wholeNumber)
	{
		this.numerator = wholeNumber;
		this.denominator = 1;
	}

	public RationalNumber()
	{
		this.numerator = 0;
		this.denominator = 1;
	}

	public int getNumerator()
	{
		return this.numerator;
	}

	public void setNumerator(int numerator)
	{
		this.numerator = numerator;
	}

	public int getDenominator()
	{
		return this.denominator;
	}

	public void setDenominator(int denominator)
	{
		this.denominator = denominator;
	}

	@Override
	public String toString()
	{
		//setting the numerator and denominator with their correct value and sign
		if (this.denominator == 0)//denominator cannot be equal to zero
			this.denominator = 1;
		else if (this.denominator < 0) //if the denominator is negative,transfer it to the numerator; I think it's part of the rule in rational number
		{
			this.numerator = -this.numerator;
			this.denominator = -(this.denominator);
		}
		else if ((this.denominator < 0) && (this.numerator < 0))//if both numerator and denominator are negative simply make it positive
		{
			this.numerator = -(this.numerator);
			this.denominator = -(this.denominator);
		}

		return this.numerator + "/" + this.denominator;

	}

	private void normalization(int tempNum,int tempDen)//helper function that's why set as private; this will simplify the rational numbers to its simplest form
	{
		// I know this is not necessary but some errors might encounter if I will not include this conditional statement especially in division operation
		if ((tempDen < 0) && (tempNum < 0))
		{
			tempNum = -(tempNum);
			tempDen = -(tempDen);
		}
		else if(tempDen < 0)
		{
			tempNum = -tempNum;
			tempDen = -(tempDen);
		}
		

		for(int i = 1; i <= tempNum;i++)
		{
			if((tempNum % i == 0) && (tempDen % i == 0))
			{
				tempNum /= i;
				tempDen /=  i;
			}
			
		}
		
		for(int j = 1; j <= tempNum;j++)//kani nga loop is only for those values where numerator and denominator have the same value.It's just important for me to include this because there are some numbers that will not convert to it's simplest forms.
		{
			if((tempNum % j == 0) && (tempDen % j == 0))
			{
				tempNum /= j;
				tempDen /=  j;
			}
		}
		
		System.out.println(tempNum + "/" + tempDen);
		
	}

	public void add(RationalNumber other)
	{
		int tempNum = 0,tempDen = 0,firstProd = 0,secondProd = 0,size;
		boolean flag =  false;// in able to get only the least common multiple

		if(this.denominator == other.denominator)
		{
			tempNum = this.numerator + other.numerator ;
			tempDen = this.denominator;
			System.out.print("Original Form: " + tempNum + "/" + tempDen);
			System.out.print("\nSimplest Form: ");
			normalization(tempNum,tempDen);//using the helper function
		}
		else 
		{
			if(this.denominator > other.denominator)
			{
				size = this.denominator;
			}
			else 
			{
				size = other.denominator;
			}
			//System.out.println(size);
			for(int i = 1 ; i <= size;i++ )
			{
				firstProd = this.denominator * i;
				for (int j = 1; j <= size ; j++)
				{
					secondProd = other.denominator * j;
					
					if (firstProd == secondProd)
					{
						flag = true;
						tempNum = ((firstProd / this.denominator) * this.numerator) + ((secondProd / other.denominator) * other.numerator) ;
						tempDen = firstProd;//second product will do
						
						if ((tempDen < 0) && (tempNum < 0))
						{
							this.numerator = -(this.numerator);
							this.denominator = -(this.denominator);
						}
						
						System.out.println("Original Form: "+ tempNum + "/" + tempDen);
						System.out.print("Simplest Form: ");
						normalization(tempNum,tempDen);//using the helper function
					}
					
				}
				if(flag == true)
				{
					break;
				}
			}
		} 

	}

	public void subtract(RationalNumber other)
	{
		int tempNum = 0,tempDen = 0,firstProd = 0,secondProd = 0,size;
		boolean flag =  false;// in able to get only the least common multiple

		if(this.denominator == other.denominator)
		{
			tempNum = this.numerator - other.numerator ;
			tempDen = this.denominator;
			System.out.print("Original Form: " + tempNum + "/" + tempDen);
			System.out.print("\nSimplest Form: ");
			normalization(tempNum,tempDen);//using the helper function
		}
		else 
		{
			if(this.denominator > other.denominator)
			{
				size = this.denominator;
			}
			else 
			{
				size = other.denominator;
			}
			//System.out.println(size);
			for(int i = 1 ; i <= size;i++ )
			{
				firstProd = this.denominator * i;
				for (int j = 1; j <= size ; j++)
				{
					secondProd = other.denominator * j;
					
					if (firstProd == secondProd)
					{
						flag = true;
						tempNum = ((firstProd / this.denominator) * this.numerator) - ((secondProd / other.denominator) * other.numerator) ;
						tempDen = firstProd;//second product will do
						System.out.print("Original Form: "+ tempNum + "/" + tempDen);
						System.out.print("\nSimplest Form: ");
						normalization(tempNum,tempDen);//using the helper function
					}
					
				}
				if(flag == true)
				{
					break;
				}
			}
		} 

	}

	public void multiply(RationalNumber other)
	{
		int tempNum = 0,tempDen = 0;

		tempNum = this.numerator * other.numerator;
		tempDen = this.denominator * other.denominator;
		System.out.print("Original Form: "+ tempNum + "/" + tempDen);
		System.out.print("\nSimplest Form: ");
		normalization(tempNum,tempDen);//using the helper function
	}

	public void divide(RationalNumber other)
	{
		int tempNum = 0,tempDen = 0;

		tempNum = this.numerator * other.denominator;
		tempDen = this.denominator * other.numerator;
		//System.out.println(other.numerator);
		System.out.print("Original Form: "+ tempNum + "/" + tempDen);
		System.out.print("\nSimplest Form: ");
		normalization(tempNum,tempDen);//using the helper function
	}

	public boolean isLessThan(RationalNumber other)
	{
		int firstNum,secondNum;
		boolean flag = false;

		firstNum = this.numerator * other.denominator;
		secondNum =  this.denominator * other.numerator;

		if(firstNum < secondNum)
		{
			flag = true;
		}

		return flag;

	}

	public boolean isLessThanOrEqualTo(RationalNumber other)
	{
		int firstNum,secondNum;
		boolean flag = false;

		firstNum = this.numerator * other.denominator;
		secondNum =  this.denominator * other.numerator;

		if(firstNum <= secondNum)
		{
			flag = true;
		}

		return flag;

	}

	public boolean isGreaterThan(RationalNumber other)
	{
		int firstNum,secondNum;
		boolean flag = false;

		firstNum = this.numerator * other.denominator;
		secondNum =  this.denominator * other.numerator;

		if(firstNum > secondNum)
		{
			flag = true;
		}

		return flag;

	}

	public boolean isGreaterThanOrEqualTo(RationalNumber other)
	{
		int firstNum,secondNum;
		boolean flag = false;

		firstNum = this.numerator * other.denominator;
		secondNum =  this.denominator * other.numerator;

		if(firstNum >= secondNum)
		{
			flag = true;
		}

		return flag;

	}

}

