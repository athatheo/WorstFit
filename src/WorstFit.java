import java.util.ArrayList;

public class WorstFit 
{ 
	/*
	 * Method to allocate memory to blocks according to the worst fit 
	 * algorithm. It should return an ArrayList of Integers, where the
	 * index is the process ID (zero-indexed) and the value is the block
	 * number (also zero-indexed).
	 */
	static ArrayList<Integer> worstFit(int sizeOfBlocks[], int sizeOfProcesses[])
	{
		/*
		 * Put your code in here!
		 */
		
	} 
	
	// Method to print the memory allocation
	public static void printMemoryAllocation(ArrayList<Integer> memAllocation) {
		System.out.println("Process No.\tBlock No.");
		System.out.println("===========\t=========");
		for (int i = 0; i < memAllocation.size(); i++) 
		{ 
			System.out.print(" " + i + "\t\t");
			// if a process has been allocated position -255, it means that it
			// has not been actually allocated
			if (memAllocation.get(i) != -255) 
				System.out.print(memAllocation.get(i)); 
			else
				System.out.print("Not Allocated"); 
			System.out.println(); 
		} 
	}
	
	// Driver Method to test your algorithm with a simple example
	public static void main(String[] args) 
	{
		/* There are 5 available blocks in this example. The block ID
		 * is the array index and the available block size is the value.
		 * So we have the following blocks and sizes:
		 * 
		 *   BlockID    Size
		 *   =======    ====
		 *      0        200
		 *      1        500
		 *      2        100
		 *      3        300
		 *      4        600
		 * 
		 */
		int sizeOfBlocks[] = {200, 500, 100, 300, 600}; 
		/* And there are 4 processes. The process ID is the array
		 * index. So we have these processes and sizes:
		 *
		 *   ProcessID     Size
		 *   =========     ====
		 *       0          214
		 *       1          415
		 *       2          112
		 *       3          425
		 */
		int sizeOfProcesses[] = {214, 415, 112, 425}; 
		
		ArrayList<Integer> memAlloc = worstFit(sizeOfBlocks, sizeOfProcesses);
		printMemoryAllocation(memAlloc);	
	} 
} 
