//#include <stdio.h>

/*
int main()
{
	int num, total = 0;

	do
	{
		printf("num �� �Է� �ϼ��� : ");
		scanf_s("%d", &num);

		total += num;
	}
	while (num != 0);

	printf("�հ� : %d\n", total);

	getchar();
	getchar();

	return 0;
}
*/

/*
int main()
{
	int i = 0;

	
	for (i = 0; i < 10; i++)
	{
		printf("i = %d\n", i);
	}
	
	i = 0;

	while (i < 10)
	{
		printf("i = %d \n", i);
		i++;
	}

	getchar();
	getchar();

	return 0;
}
*/
/*
int main()
{
	int dansu = 2, num = 0;

	
	while (dansu < 10)
	{
		num = 1;

		while (num < 10)
		{
			printf("%d X %d = %d\n", dansu, num, dansu*num);
			num++;
		}

		dansu++;
	}
	
	dansu = 2, num = 0;

	do
	{
		num = 1;

		do
		{
			printf("%d X %d = %d\n", dansu, num, dansu*num);
			num++;
		} while (num < 10);
		
		dansu++;
	
	} while (dansu < 10);

	getchar();
	getchar();

	return 0;
}
*/

/*
int main()
{
	int a, b, c, sum = 0;

	printf("������ �Է��ϼ��� : ");
	scanf_s("%d", &a);
	
	printf("������ �Է��ϼ��� : ");
	scanf_s("%d", &b);

	c = a;

	for (;a < b;a++)
	{
		sum = sum + a;
	}

	printf("%d���� %d������ ���� : %d",c, b, sum);

	getchar();
	getchar();

	return 0;
}
*/

/*
int main()
{
	int num, i, sum = 1;

	printf("��µ� n�� �� : ");
	scanf_s("%d", &num);

	for (i = 1;i <= num;i++)
	{
		sum = sum * i;
	}

	printf("%d�� %d!�� �� : %d", num, num, sum);

	getchar();
	getchar();

	return 0;
}
*/

/*
int main()
{
	int dansu, num;

	for (dansu = 2;dansu < 10;dansu++)
	{
		num = 1;
		for (num = 1;num < 10;num++)
		{
			printf("%d X %d = %d \n", dansu, num, dansu*num);
		}
	}

	getchar();
	getchar();

	return 0;
}
*/

/*
int main()
{
	int dansu, num;

	for (dansu = 2;dansu < 10;dansu++)
	{
		for (num = 1;num < 10;num ++)
		{
			printf("%d X %d = %d \n", dansu, num, dansu*num);
			num++;
		}
	}

	getchar();
	getchar();

	return 0;
}
*/