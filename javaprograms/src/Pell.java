class  Pell
{
	public static void main(String[] args) 
	{
		int a=0,b=1,count=10;
		System.out.print(a+"  "+b+" ");
		for (int i=2;i<=count ;i++ )
		{
			int c=a+2*b;
            System.out.print(c + " ");
			a=b;
			b=c;
		}
	}
}
