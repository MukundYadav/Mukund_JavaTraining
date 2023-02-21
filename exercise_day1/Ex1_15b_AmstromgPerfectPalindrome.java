package exercise_day1;

public class Ex1_15b_AmstromgPerfectPalindrome {
	public static void main(String[] args) {
		System.out.println(Amstrong(145));
		System.out.println(Amstrong(153));
		System.out.println(perfect(153));
		System.out.println(perfect(6));
		System.out.println(palindrome(122));
		System.out.println(palindrome(121));
		
	}
	 public static boolean Amstrong(int n){
		 int digit,sum=0,count=0;
		 
		 int g=n;
		 while(g!=0)
		 {
			 g=g/10;
			 count++;
		 }
		 
		 g=n;
		 
		 while(g!=0) {
			 digit=g%10;
			 sum+=(Math.pow(digit, count));
			 g=g/10;
		 }
		 
		 if(sum==n)
		 {return true;}
		 else {
			 return false;
		 }
	 }
	 
	 
	 
	 public static boolean perfect(int n) {
		 int sum=0;
		 
			 
		 for(int i=1;i<n;i++) {
			 if(n%i==0)
			 {
				 sum+=i;
			 }
		 }
		 if(sum==n) {
			 return true;
		 }
		 else {
			 return false;
		 }
	 }
	 
	 public static boolean palindrome(int k ) {
		 int d,sum=0;
		 int n=k;
		 while(n!=0) {
			 d=n%10;
			 sum=(sum*10)+d;
			 n=n/10;
		 }
		 if(sum==k)
		 {
			 return true;
		 }
		 else {
			 return false;
		 }
	 }
}
