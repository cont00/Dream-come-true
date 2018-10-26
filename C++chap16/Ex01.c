//#include <stdio.h>

/*
int main()
{
	int a[2][2];
	a[0][0] = 1;
	a[0][1] = 2;
	a[1][0] = 3;
	a[1][1] = 4;
	
	for (int i = 0; i < 2;i++)
	{
		for (int j = 0;j < 2;j++)
		{
			printf("%d\t", a[i][j]);	
		}
		
		printf("\n");
	}
	getchar();

	return 0;
}
*/

/*
int main()
{
	int a[3][3][3] = { { {1,2,3},{4,5,6},{7,8,9} },
					 { {10,11,12},{13,14,15},{16,17,18} },
					 { {19,20,21},{22,23,24},{25,26,27} } };
	
	//0, 0, 0;	0, 0, 1;	0, 0, 2;
	//0, 1, 0;	0, 1, 1;	0, 1, 2;
	//0, 2, 0;	0, 2, 1;	0, 2, 2;

	//1, 0, 0;	1, 0, 1;	1, 0, 2;
	//1, 1, 0;	1, 1, 1;	1, 1, 2;
	//1, 2, 0;	1, 2, 1;	1, 2, 2;

	//2, 0, 0;	2, 0, 1;	2, 0, 2;
	//2, 1, 0;	2, 1, 1;	2, 1, 2;
	//2, 2, 0;	2, 2, 1;	2, 2, 2;
	
	for (int i = 0; i < 3;i++)
	{
		for (int j = 0;j < 3;j++)
		{
			for (int k = 0;k < 3;k++)
			{
				printf("%d\t", a[i][j][k]);
			}
			printf("\n");
		}
		printf("\n");
	}

	getchar();

	return 0;
}
*/


// 문제 16-1 (1)
/*
int main()
{
	int a[3][9];
	int num = 2;
	
	for (int i = 0;i < 3;i++)
	{
		for (int j = 0;j < 9;j++)
		{
			printf("%d ", a[i][j]);
		}
		printf("\n");
	}

	for (int i = 0;i < 3;i++)
	{
		for (int j = 0;j < 9;j++)
		{
			a[i][j] = num * (j+1);
		}
		num++;
		printf("\n");
	}

	for (int i = 0;i < 3;i++)
	{
		for (int j = 0;j < 9;j++)
		{
			printf("%d ", a[i][j]);
		}
		printf("\n");
	}

	getchar();

	return 0;
}
*/

// 문제 16-1 (2)
/*
int main()
{
	int a[2][4] = { {1,2,3,4},{5,6,7,8} };
	int b[4][2];

	for (int i = 0;i < 2;i++)
	{
		for (int j = 0;j < 4;j++)
		{
			printf("%d ", a[i][j]);
		}
		printf("\n");
	}

	printf("\n");

	for (int i = 0;i < 2;i++)
	{	
		for (int j = 0;j < 4;j++)
		{
			b[j][i] = a[i][j];
		}
	}

	

	for (int i = 0;i < 4;i++)
	{
		for (int j = 0;j < 2;j++)
		{
			printf("%d ", b[i][j]);
		}
		printf("\n");
	}

	getchar();

	return 0;
}
*/

// 문제 16-1 (3)
/*
int main()
{
	int a[5][5];
	char *names[5] = { "철희","철수","영희","영수","과목별 총점" };

	for (int i = 0;i < 5;i++)
	{
		for (int j = 0;j < 5;j++)
		{
			a[i][j] = 0;
		}
	}

	for (int i = 0;i < 4;i++)
	{	
		printf("%d 번째 학생의 성적 입력\n", i+1);
		for (int j = 0;j < 4;j++)
		{
			printf("과목 %d : ", j + 1);
			scanf_s("%d", &a[i][j]);
		}
	}
	
	for (int i = 0;i < 4;i++)
	{
		for (int j = 0;j < 4;j++)
		{
			a[i][4] += a[i][j];
			a[4][j] += a[i][j];
			a[4][4] += a[i][j];
		}
	}

	printf("\n");
	printf("\t\t국어\t영어\t수학\t국사\t총점\n");

	for (int i = 0;i < 5;i++)
	{
		if (i != 4)
			printf("\t%s\t", names[i]);
		else
			printf(" %s\t", names[i]);

		for (int j = 0;j < 5;j++)
		{
			printf("%d\t", a[i][j]);
		}
		printf("\n");
	}

	getchar();
	getchar();

	return 0;
}
*/