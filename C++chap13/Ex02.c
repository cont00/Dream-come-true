#include <stdio.h>

// 巩力 13-1 (1)
/*
int main()
{
	int arr[] = { 1,2,3,4,5 };
	int *p = arr[0];
	int i;

	for (i = 0;i < sizeof(arr) / sizeof(int);i++)
	{
		*p += 2;
		p++;
	}

	for (i = 0;i < sizeof(arr) / sizeof(int);i++)
		printf("%d ", arr[i]);

	getchar();

	return 0;
}
*/

// 巩力 13-1 (2)
/*
int main()
{
	int arr[] = { 1,2,3,4,5 };
	int *p = arr;
	int i;

	for (i = 0;i < 5;i++)
		*(arr + i) += 2;

	for (i = 0;i < sizeof(arr) / sizeof(int);i++)
		printf("%d ", arr[i]);

	getchar();

	return 0;
}
*/

// 巩力 13-1 (3)
/*
int main()
{
	int arr[5] = { 1,2,3,4,5 };
	int *p = &arr[4];
	int i, sum = 0;

	for (i = 0;i < sizeof(arr) / sizeof(int);i++)
	{
		sum += *(p--);
	}
	
	printf("%d", sum);

	getchar();

	return 0;
}
*/

// 巩力 13-1 (4)
/*
int main()
{
	int arr[] = { 1,2,3,4,5,6 };
	int i = 0, j = (sizeof(arr) / sizeof(int)) - 1;
	int *p1 = &arr[i];
	int *p2 = &arr[j];
	

	printf("*p1 = %d \n", *p1);
	printf("*p2 = %d \n", *p2);

	for (i = 0;i < (sizeof(arr) / sizeof(int)) / 2;)
	{
		
		p1 = &arr[i++];
		p2 = &arr[j--];
		

		int temp = *p2;

		*p2 = *p1;
		*p1 = temp;

		
		//p1 = p1++;
		//p2 = p2--;
		
	}
	for (i = 0; i < (sizeof(arr) / sizeof(int));i++)
		printf("%d  ", arr[i]);

	getchar();

	return 0;
}
*/