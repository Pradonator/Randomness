
public class myRandom {

	public static void main(String[] args) 
	{
		// Trying milliseconds
		int count = 0;
		String nums = "Numbers Rolled: ";
		for(int i=0; i<10; i++)
		{
			long number = System.currentTimeMillis()%11;
			//number++;
			nums = nums + number + ", ";
			//System.out.println("Number: " + i + " is: " + System.currentTimeMillis()%10);
			//System.out.println("\n" + System.currentTimeMillis());
			System.out.println("Microseconds: " + number + "\n");
			if (number >= 7 && number < 10)
				count++;
			if (number == 10)
				count = count +2;
		}
		System.out.println(nums);
		System.out.println("There are " + count + " successes");
	}

}
