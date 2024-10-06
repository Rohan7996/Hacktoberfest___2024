import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int[] arr={0,1,4,2,12,6,9};
	   // Arrays.parallelSort(arr);//all sort
	   Arrays.parallelSort(arr,0,4);//0 to 3 sort
	    for(int i:arr){
	       System.out.print(i+" ");
	   }
	}
}
