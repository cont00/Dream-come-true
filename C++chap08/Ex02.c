//#include <stdio.h>

// 삼항연산자 int _main()
/*
int main()
{
	int sum = 0, num = 0;
	
	while (1)
	{
		printf("정수 입력 : ");
		scanf_s("%d", &num);
		sum += num;
		printf("sum : %d \n", sum);

		if (sum > 5000)
			break;

		num++;
	}

	printf("num : %d \n", num);

	getchar();
	getchar();

	return 0;
}
*/

/*
int main()
{
	int num;
	printf("Start ! \n");

	for (num = 1;num < 20;num++)
	{
		if (num == 9 || num == 14)
			continue;
		printf("%d \n", num);
	}

	printf("End ! \n");

	getchar();
	getchar();

	return 0;
}
*/

// 문제 08-2 (1)
/*
int main()
{
	int dansu, is;

	for (dansu = 2;dansu < 10;dansu++)
	{
		if (dansu % 2 != 0)
			continue;

		for (is = 1;is < 10;is++)
		{
			if (dansu < is)
				break;
			printf("%d X %d = %d \n", dansu, is, dansu*is);
		}
	}

	getchar();
	getchar();

	return 0;
}
*/

// 문제 08-2 (2)
/*
int main()
{
	int A, Z, sum;

	for (A = 0;A < 10;A++)
	{
		for (Z = 0;Z < 10;Z++)
		{
			if (A == Z)
				continue;
			sum = (A * 10 + Z) + (Z * 10 + A);

			if (sum == 99)
				printf("AZ(%d%d) ZA(%d%d) = %d \n", A, Z, Z, A, sum);
		}
	}

	getchar();
	getchar();

	return 0;
}
*/