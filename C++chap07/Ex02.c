//#include <stdio.h>

/*
int main()
{
	int d = 2, g = 1;

	while (d < 10)
	{
		g = 1;

		while (g < 10)
		{
			printf("%d X %d = %d \n", d, g, d*g);
			g++;
		}
		
		d++;
	}
	getchar();
	getchar();

	return 0;
}
*/

// ���� 07-2 (1)
/*
int main()
{
	int a = 0, sum = 0, i = 0 ;

	while (i++ < 5)
	{
		printf("%d��° ������ �Է��ϼ��� : ", i);
		scanf_s("%d", &a);

		while (a <= 1)
		{
			printf("������ �ٽ� �Է��ϼ��� : ");
			scanf_s("%d", &a);
		}
		
		sum += a;
	}
	
	printf("�Է��� ������ ���� : %d", sum);

	getchar();
	getchar();

	return 0;
}
*/

// ���� 07-2 (2)
/*
int main()
{
	int i = 0, j = 0;

	while (i < 5)
	{
		while (j < i)
		{
			printf("o ");
			j++;
		}
		j = 0;
		printf("* \n");
		i++;
	}

	getchar();
	getchar();

	return 0;
}
*/