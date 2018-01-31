
public class Exercise4_25 
{

	public static void main(String[] args) 
	{
		int num = 0;
		
		System.out.print(" Your Liscense Plate is : ");
		for(int i = 0; i < 7; i++)
		{
			if(i < 3)
			{
				num = 65 + (int)( Math.random() * 26);
				System.out.print( (char) num );
			} else
			{
				num = (int) (Math.random() * 10);
				System.out.print(num);
			}
		}
		System.out.println("");

	}

}
