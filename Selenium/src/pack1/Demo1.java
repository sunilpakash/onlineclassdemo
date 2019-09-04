package pack1;

public class Demo1 {

	public static void main(String[] args) {
		int arr[]={2,2,2,3,3};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<=i;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(j);
					break;
				}
			}
		}
		
		
		

	}

}
