import java.util.Scanner;

public class uppgift15 
{


	public static void main(String[] args) 
	{
		Scanner inkommande = new Scanner(System.in);
		int tal, big, biggest, small, smallest, counter, sum;
		counter = 0;
		sum = 0;
		big = 0;
		biggest = 0;
		small = 0;
		smallest = 0;
		do{
			System.out.println("Skriv in ett heltal, avsluta med 0!");
			tal = inkommande.nextInt();

			if(tal != 0)
			{
				if(counter == 0)//noll värde
				{
					biggest = tal;
				}
				else if(counter == 1)//ett värden
				{
					if(tal > biggest)
					{
						smallest = biggest;
						small = smallest;
						biggest = tal;
						big = biggest;
					}
					else
					{
						smallest = tal;
						small = smallest;
						big = biggest;
					}
				}
				else if(counter == 2)//två värden
				{
					if(tal > biggest)
					{
						big = biggest;
						small = big;
						biggest = tal;
					}
					else if(tal < smallest)
					{
						small = smallest;
						big = small;
						smallest = tal;
					}
					else
					{
						big = tal;
						small = tal;
					}
				}
				else if(counter > 2)//alla övriga kombinationer
				{
					if(tal > biggest)
					{
						big = biggest;
						biggest = tal;
					}
					else if(tal < smallest)
					{
						small = smallest;
						smallest = tal;
					}
					else
					{
						if((biggest - tal) > (tal - smallest))
						{
							//om sant då är talet närmare det minsta värdet
							small = tal;
						}
						else if((biggest - tal) < (tal - smallest))
						{
							//tvärt om
							big = tal;
						}
					}
					
				}
				counter++;
				sum = sum + tal;
			}

		}while(tal != 0);
		
//visa resultatet
		if(counter == 0)
		{
			System.out.println("Inga värden inlästa!");
		}
		else if(counter == 1)
		{
			System.out.println("Bara läst in ett värde; " + sum);
		}
		else if(counter >= 2)
		{
			System.out.println("Störst talet är " + biggest + " näst störst är " + big);
			System.out.println("Minsta talet är " + smallest + " näst minst är " + small);
			System.out.println("Medel " + ((double)sum/(double)counter));
		}
	}
}