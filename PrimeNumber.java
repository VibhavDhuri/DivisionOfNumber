
public class PrimeNumber {

	public static void main(String[] args)
	{
		int num=20;
		boolean isPrime=true;
		for(int i=2; i<num/2; i++)
		{	if(num % i == 0)
		{
			isPrime=false;
		}		
		}
		if(isPrime==true)
			System.out.println(num + " is prime.");
		else
			System.out.println(num + " is not prime.");
	}

}
