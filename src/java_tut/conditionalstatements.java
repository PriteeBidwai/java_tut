package java_tut;

public class conditionalstatements {

	public static void main(String[] args) {
		/*int a,b,c;
		a=6;b=8;c=6;
		if ((a>b)&&(a>c)){
			System.out.println("a is big number");
		}
		else if((b>a)&&(b>c)){
			System.out.println("b is big number");
		}	
		else if ((c>a)&&(c>b)){
		System.out.println("c is big number");
		
		}*/
		
		int x=68766;
		if ((x>=1)&&(x<=100))
		{
			System.out.println("x is small number");
		}
	 else if((x>=101)&&(x<=1000))
			{
				System.out.println("x is medium number");
			}
	   else if((x>=1001)&&(x<=10000))
				{
				System.out.println("x is big number");
			    }
	   else if((x>10000))
				{
					System.out.println("x is higher number");
				}
		else 
				{
					System.out.println("x is either zero or negative number");
				}
			
		}
		
		
	}

	






