//#include <stdio.h>

/*
void MaxAndMin(int **mxptr, int **mnptr, int *arr)
{
	*mxptr = &arr[0];
	*mnptr = &arr[0];

	for (int i = 0;i < 5;i++)
	{
		if (**mxptr < arr[i])
			*mxptr = &arr[i];
		if (**mnptr > arr[i])
			*mnptr = &arr[i];
	}

	printf("\nMaxAndMin ��½��� \n");
	printf("**mxptr = %d \n", **mxptr);
	printf("**mnptr = %d \n", **mnptr);
	printf("\nMaxAndMin �� �� �� \n");
}

int main()
{
	int *maxptr;
	int *minptr;
	int arr[5];

	for (int i = 0;i < 5;i++)
	{
		printf("%d ��° ���� �Է� : ", i + 1);
		scanf_s("%d", &arr[i]);
	}

	for (int i = 0;i < 5;i++)
		printf("%4d", arr[i]);

	MaxAndMin(&maxptr, &minptr, arr);

	printf("�ִ밪 = *maxptr = %d \n", *maxptr);
	printf("�ּҰ� = *maxptr = %d \n", *minptr);

	getchar();
	getchar();

	return 0;
}
*/

/*
int doA(int **ppnum)
{
	**ppnum = 30;
}

int main()
{
	int num = 10;
	int *pnum = &num;

	printf("*pnum = %d \n", *pnum);
	doA(&pnum);
	printf("*pnum = %d \n", *pnum);
	
	getchar();

	return 0;
}
*/