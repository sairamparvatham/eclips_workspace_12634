import java.util.Scanner;

public class comparigenOf3Num {

	public static void main(String[] args) {
		int m;
		int l;
		int z;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter l value");
		m=sc.nextInt();
		l=sc.nextInt();
		z=sc.nextInt();
		int max=(m>l) ? m : l;
		max=(max > z) ? max : z;
		
		int min=(m<l) ? m : l;
	    min=(min < z) ? min : z;
		System.out.println(max);
		System.out.println(min);
		
		//-----------------------------------------------------------------------------------------------
		int maxs=((m>l)&&(m>z)) ? m : (l>z) ? l : z;
		int mins =((m<l)&&(m<z)) ? m : (l<z) ? l : z;
		System.out.println("-------------------------------------");
		System.out.println(maxs);
		System.out.println(mins);

	}

}
