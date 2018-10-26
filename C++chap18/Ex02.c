//#include <stdio.h>

// 巩力 18-1 (1)
/*
int main()
{
	int *arr1[5];
	int *arr2[3][5];

	int *ptr1;
	int *ptr2;

	int *ptr1 = arr1;
	int (*ptr2)[5] = arr2;

	getchar();

	return 0;
}
*/

// 巩力 18-1 (2)
/*
void SimpleFuncOne(int *ptr1, int *ptr2)
{
	
}

void SimpleFuncTwo(int (*ptr3)[4], int (*ptr4)[4])
{

}

int main()
{
	int arr1[3];
	int arr2[4];
	int arr3[3][4];
	int arr4[2][4];

	SimpleFuncOne(arr1, arr2);
	SimpleFuncTwo(arr3, arr4);

	getchar();

	return 0;
}
*/

// 巩力 18-1 (3)
/*
void ComplexFuncOne(int **ptr1, int *(*ptr2)[5])
{

}

void ComplexFuncTwo(int ***ptr3, int ***(*ptr4)[5])
{

}

int main()
{
	int *arr1[3];
	int *arr2[3][5];
	int **arr3[5];
	int ***arr4[3][5];

	ComplexFuncOne(arr1, arr2);
	ComplexFuncTwo(arr3, arr4);

	getchar();

	return 0;
}
*/

// 巩力 18-1 (4)
/*
int main()
{
	int arr[3][2] = { {1,2}, {3,4},{5,6,} };

	printf("%3d %3d \n", arr[1][0], arr[0][1]);
	printf("%3d %3d \n", *(arr[2] + 1), *(arr[1] + 1));
	printf("%3d %3d \n", (*(arr + 2))[0], (*(arr + 0))[1]);
	printf("%3d %3d \n", **arr, *(*(arr + 0) + 0));

	getchar();

	return 0;
}
*/

// 巩力 18-1 (5)
/*
int main()
{
	int arr[2][2][2] = { 1,2,3,4,5,6,7,8 };

	for (int i = 0;i < 2;i++)
	{
		for (int j = 0;j < 2;j++)
		{
			for (int k = 0;k < 2;k++)
			{
				printf("%4d ", arr[i][j][k]);
			}
		}
	}

	printf("\n\n\n");
	
	printf("%d \n", arr[1][0][1]);

	printf("%d \n", *(*(*(arr + 1) + 0) + 1));

	printf("%d \n", (*(*(arr + 1) + 0))[1]);

	printf("%d \n", (*arr + 2)[0][1]);

	printf("%d \n", *(*(arr[1]) + 0 + 1));
	
	printf("%d \n", *(arr[1][0]) + 1);


	getchar();

	return 0;
}
*/