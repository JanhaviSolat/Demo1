class Demo
{
	public static void main(String ar[])
	{
		int i,j,k=1,s=0;
		int x[]={10,20,10,30,40,40,50,60,70,80};
		for(i=1;i<x.length;i++)
		{
			for(j=i;j>0;j--)
			{
				if(x[i]==x[j-1])
					break;
			}
			if(j==0)
				x[k++]=x[i];
		}
		for(i=0;i<k;i++)
			System.out.println(x[i]);
	}
}