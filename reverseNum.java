package frist;

public class reverseNum {

	public static void main(String[] args) {
		int num =1242;
		int temp;
		int rev=0;
		while(num!=0){
			temp = num%10;
			num=num/10;
			rev=10*rev +temp;
		}
			System.out.println(rev);
			
		}

	}
