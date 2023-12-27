package java_Test01;

import java.util.Scanner;

public class test_tree {
	
	public static void main(String[] args) {
		int num;
		
		
		

		
		while(true)
		{
			System.out.println("<트리 출력 프로그램>");
			System.out.print("수를 입력하세요(홀수): ");
			
			Scanner inPut= new Scanner(System.in);
			
			num=inPut.nextInt();			
			
			if(num%2==0)
			{
				System.out.println("다시 입력해주세요.");
			}
			else
			{
				num=((num/2)+1);
				
				for(int i=1;i<=num;i++)
				{
					for(int j=0;j<num+i;j++)
					{
						if((num-i)<j&& j<(num+i))
						{
							System.out.print("*");
						}
						else
							System.out.print(" ");
					}
					System.out.println();
				}
				break;
			}
		}		

	}

}
