//#include <stdio.h>

// ���� 1
/*
int main()
{
	int a = 0;

	printf("10���� �Է� : ");
	scanf_s("%d", &a);



	getchar();
	getchar();

	return 0;
}
*/

// ���� 2
/*
int main()
{
	int min, max;
	int i,j;

	for(i = 0; i < 10; i++)
	{
		for(j = min; min < max; j++)
		{
			
		}
	}

	getchar();
	getchar();

	return 0;
}
*/

// ���� 3
/*
int main()
{
	int num1, num2;
	int max = 0;
	int i = 1;
	int gcd;

	printf("���� �Է� : ");
	scanf_s("%d", &num1);
	printf("���� �Է� : ");
	scanf_s("%d", &num2);

	if (num1 > num2)
		max = num2;
	else
		max = num1;

	for (i=0;i < max + 1; i++)
	{
		if (num1 % i == 0 && num2 % i == 0)
		{
			gcd = i;
		}
	}

	printf("gcd = %d \n", gcd);

	getchar();
	getchar();

	return 0;
}
*/

// ���� 4
/*
int main()
{
	int a = a = 500, b = 700, c = 400;
	int tot = 3500 - (a + b + c);

	printf("���� ����� �����ϰ� �ִ� �ݾ� : 3500 \n");

	for (int x = 0;x < 5;x++)
	{
		for (int y = 0;y < 4;y++)
		{
			for (int z = 0;z < 6;z++)
			{
				if(tot - ((a*x) + (b*y) + (c*z)) == 0)
					printf("ũ���� : %d ��, ����� %d ��, �ݶ� %d �� \n", x+1, y+1, z+1);
			}
		}
	}

	printf("��� �����Ͻðڽ��ϱ�?");
	

	getchar();

	return 0;
}
*/