package java_tut;

public class Rationaloperators {

	public static void main(String[] args) {
		/*int a,b,c;
       a=10;b=30;c=40;
       System.out.println(a==b);  //false
       System.out.println(a!=b);   //true
       System.out.println(a>b);     //false
       System.out.println(a<b);     //true
       System.out.println(a<=b);    //true
       System.out.println(a>=b);    //false
       
       
       
       System.out.println(b==c);    //false
       System.out.println(b!=c);    //true
       System.out.println(b>c);      //false
       System.out.println(b<c);      //true
       System.out.println(b<=c);     //true
       System.out.println(b>=c);     //false
       
       
       System.out.println(a==c);   //false
       System.out.println(a!=c);   //true
       System.out.println(a>c);    //false
       System.out.println(a<c);    //true
       System.out.println(a<=c);   //true
       System.out.println(a>=c);  */ //false
       
       Boolean k=true,p=false,q=true;   
       System.out.println(!k);     //false
       System.out.println(k&&p);    //false
       System.out.println(k||p);    //true
       System.out.println(!p);
       System.out.println(!q);
       System.out.println(!(p&&q));
       System.out.println(!(k&&p));
       System.out.println(!(k&&q));
       
       String x="selenium"; String y = "testing";
System.out.println(x+"  " +y+ " "+"prity");
       int r=10;int s=20;
       System.out.println("addition of r&s is:"+(r+s)+ " "+(x+" "+y));
       System.out.println("multiplication of r&s:"+(r*s)+ " "+(x+ " "+y)+ " "+(k&&p) );
       
	}

}
