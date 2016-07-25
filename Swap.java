
public class Swap 
{
	public static void main(String[] args)
	{
		// Instantiate variables to swap.
		int a = 0, b = 1; 
		// Begin swap...
		// Make variable 'a' equal the returned integer, place
		// 'b' as the first parameter so 'b' is swapped to 'a'
		// when the method returns.
		//
		// Using the second parameter as a placeholder, use the
		// assignment operator to make 'b' equal 'a' before swap
		// returns 'b' to be assigned to 'a'.
		// 
		// This is a compiler trick that wouldn't ordinarily come 
		// to mind even though it's so simple. While I don't think
		// it has any production value, it definitely is a nice 
		// brain tease. 
		a = swap( b, (b = a) );
		// Print results.
		System.out.println( "A:" + a + "\nB:" + b );
	}
	
	private static int swap(int int_to_return, int int_to_swap)
	{
		return int_to_return;
	}
}
