package week1.day2assignments;
//fibanocci series
public class FibanocciSeries {
	public static void main(String[] args) {
	int firstnum=0,secnum=1,sum,range=8;	
System.out.println("Fibanocci series :");
for(int i=1;i<=range;i++)
{
	System.out.println(firstnum);
	sum=firstnum+secnum;
	firstnum=secnum;
	secnum=sum;
	
}
	}

}
