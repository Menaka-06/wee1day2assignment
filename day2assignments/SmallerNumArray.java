package week1.day2assignments;

import java.util.Arrays;

//second smallest number in an array
public class SmallerNumArray 
{

	public static void main(String[] args) 
	{
		int[] arrval= {23,45,67,32,89,22};
		Arrays.sort(arrval);
		for(int i=0; i<arrval.length;i++)
		{
		System.out.println(arrval[i]);
		}
System.out.println("second smallest number= "+arrval[1]);
	}

}
