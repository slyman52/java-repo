package practices;
public class Exercise1_7April {
	
	public static void main(String[] args) {
	java.util.Random num = new java.util.Random();
	StopWatch stopwatch = new StopWatch();
	
	
	int[] numbers = new int [100000];
	
	for(int i=0;i<100000;i++) {
		numbers[i]=num.nextInt(100000);
	}
	
	stopwatch.start();
	
	//insert code for array selection sorting here //
	
	stopwatch.stop();
		
		System.out.println("The total time taken to sort the number is " + System.currentTimeMillis() + " milliseconds.");
}
	

public static void currentTimeMillis() {
	
}

//class SelectionSort - copied from Internet
class SelectionSort
{
    void sort(int arr[])
    {
        int n = arr.length;
  
        // One by one move boundary of unsorted sub array
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
  
            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
}

//creating a static class StopWatch
static class StopWatch{
	
	//private Start Time and end time
	private long startTime = System.currentTimeMillis();
	private long endTime = startTime;
	
	//start - taken from start time
	public long start(){
	this.startTime= System.currentTimeMillis();
	return startTime;
	}
	//start - taken from end time
	public long stop(){
	this.endTime = System.currentTimeMillis();
	return endTime;
	}
	public long getElapsedTime(){
	return endTime-startTime ;
	}
}}