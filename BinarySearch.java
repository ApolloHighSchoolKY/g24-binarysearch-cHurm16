import java.util.Arrays;

public class BinarySearch
{
	public static int binarySearch(int[] ray, int item)
	{
		//return -1 if it is not there 
		int start = ray[0];
		int end= ray.length-1;
		

		while(start<=end){
			//find the middle value 
			//int mid = (start+end)

			int mid = start+((end-start)/2);

			if(item<ray[mid]){
				end = mid-1;
			}
			else if (item>ray[mid]){
				start = mid+1;
			}
			else {
				//answer was found 
				return mid; 
			}
		}
			return -1;
	}
}
