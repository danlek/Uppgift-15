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
				if(counter == 0)//noll v�rde
				{
					biggest = tal;
				}
				else if(counter == 1)//ett v�rden
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
				else if(counter == 2)//tv� v�rden
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
				else if(counter > 2)//alla �vriga kombinationer
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
							//om sant d� �r talet n�rmare det minsta v�rdet
							small = tal;
						}
						else if((biggest - tal) < (tal - smallest))
						{
							//tv�rt om
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
			System.out.println("Inga v�rden inl�sta!");
		}
		else if(counter == 1)
		{
			System.out.println("Bara l�st in ett v�rde; " + sum);
		}
		else if(counter >= 2)
		{
			System.out.println("St�rst talet �r " + biggest + " n�st st�rst �r " + big);
			System.out.println("Minsta talet �r " + smallest + " n�st minst �r " + small);
			System.out.println("Medel " + ((double)sum/(double)counter));
		}
	}
}