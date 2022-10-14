package veera;

public class Arithmetic {
	void add(int a,int b) //-->this is called local variable
	{
		int c=a+b;
		System.out.println("a+b="+c);
	}
	void sub(int a,int b)
	{
		int c=a-b;
		System.out.println("a-b="+c);
		
	}
	void mul(int a,int b)
	{
		int c=a*b;
		System.out.println("a*b="+c);
	}
	void div(int a,int b)
	{
		int c=a/b;
		System.out.println("a/b="+c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithmetic a=new Arithmetic();
		a.add(4, 5);
		a.add(3, 4);
		a.sub(11, 5);
		a.sub(9, 1);
		a.mul(2, 3);
		a.div(6, 3);

	}

}
