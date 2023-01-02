package Aggregation;

public class ReverseConst {
	 static int rem, a, r=0;
	ReverseConst(int r, int a, int rem){
		this.r=r;
		this.a=a;
		this.rem=rem;
		while(a!=0) {
			rem=a%10;
			r=r*10+r;
			a=a/10;
			}
		System.out.println("Reverse="+r);
	}
			ReverseConst(){
				System.out.println("Finding Reverse");
			}
	
}
