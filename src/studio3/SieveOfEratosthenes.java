package studio3;

import java.util.Scanner;

public class SieveOfEratosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("What is upper range of numbers (?) you want?");
		int n = in.nextInt();
		int coef = 2;

		boolean[] arrayN = new boolean [n];
		int prime = 2;

		//while (prime<n) {
			for (int i = 2; i < Math.sqrt(arrayN.length); i++)
			{
				if (arrayN[i]==false)
				{
					for (double j = Math.pow(i, 2); j < arrayN.length; j+=i)
					{
						arrayN[(int)j] = true;
					}

					
					
				}



			
			}
			for (int i = 2; i < Math.sqrt(arrayN.length); i++)
			{
				if (arrayN[i] == true)
				{
					System.out.println(i);
				}
			}
			//	while (coef < n/coef) 
			//	{
			//	if (i == coef*prime)
			//	{
			//		arrayN[i] = true;
			//	}
			//	coef++;
			//}
			//	prime++;
			//	}


			//	}
			//	for (int i=0; i<n; i++) {
			//		if (arrayN[i]==true) {
			//		System.out.println(i);
		//}
		//	i = i(i+1)
	}

}
