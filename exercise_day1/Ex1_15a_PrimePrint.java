package exercise_day1;

public class Ex1_15a_PrimePrint {
	public static void main(String[] args) {
		System.out.println("prime numbers between 1 and 100 are " );
		for(int i=1;i<=100;i++)
		{
		 prime(i);
		}
		
		
	}
	public static void prime(int n){
		
		int i,m=0,flag=0;      
		  m=n/2;      
		  if(n<2){      
		  }else{  
		   for(i=2;i<=m;i++){      
		    if(n%i==0){         
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  { System.out.print(n+" "); }  
		  } 
		}
		
	}