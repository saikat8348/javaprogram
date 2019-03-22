package frist;

public class fibonaci {

	public static void main(String[] args) {
		int n=20;
		int a=0;
		int b=1;
		for(n=1;n<=20;n++)
		{
			System.out.print(a +" ");
		int c= a+b;
		a=b;
		b=c;
		}
	}
}