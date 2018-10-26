//#include <stdio.h>

/*
int main()
{
	int a[5] = { 10,20,30,40,50 };
	
	printf("a[0] = %d\n", a[0]);
	printf("a[1] = %d\n", a[1]);
	printf("a[2] = %d\n", a[2]);
	printf("a[3] = %d\n", a[3]);
	printf("a[4] = %d\n", a[4]);

	getchar();
	getchar();

	return 0;
}
*/

/*
int main()
{
	int a[7] = { 10,20,30,40,50,60,70 };
	int i = 0;

	for (i = 0;i < 7;i++)
		printf("a[%d] = %d\n", i, a[i]);

	printf("sizeof(a) = %d\n", sizeof(a));
	printf("sizeof(int) = %d\n", sizeof(int));
	printf("배열의 길이는 = %d\n", sizeof(a)/sizeof(int));

	getchar();
	getchar();

	return 0;
}
*/

// 문제 11-1 (1)
/*
int main()
{
	int a[5], i, max = 0, min = 0, sum = 0;

	for (i = 0;i < sizeof(a)/sizeof(int);i++)
	{
		printf("%d 번째 정수 입력 : ", i);
		scanf_s("%d", &a[i]);
		sum = sum + a[i];
	}
	for (i = 0;i < sizeof(a) / sizeof(int);i++)
	{
		printf("a[%d] = %d\n", i, a[i]);
	}
	for (i = 0;i < 5;i++)
	{
		if (a[0] > a[i])
			min = a[0] = a[i];
	}
	for (i=1;i<5;i++)
	{
		if (a[0] < a[i])
			max = a[0] = a[i];
	}

	printf("입력된 정수 중에서 최대값 : %d\n", max);
	printf("입력된 정수 중에서 최소값 : %d\n", min);
	printf("입력된 정수의 총 합 : %d\n", sum);

	getchar();
	getchar();

	return 0;
}
*/

// 문제 11-1 (2)
/*
int main()
{
	int i;
	char a[] = { 'G', 'o', 'o', 'd', ' ', 't', 'i', 'm', 'e' };
	int size = sizeof(a) / sizeof(char);

	for (i = 0;i < size;i++)
		printf("%c", a[i]);
	
	getchar();
	getchar();

	return 0;
}
*/