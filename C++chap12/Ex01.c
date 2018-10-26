//#include <stdio.h>

/*
int main()
{
	int num = 3;
	int *pnum = &num;

	printf("num = %d \n", num);
	printf("&num = %d \n", &num);
	printf("pnum = %d \n", pnum);
	printf("*pnum = %d \n", *pnum);
	printf("&pnum = %d \n", &pnum);

	getchar();
	getchar();

	return 0;
}
*/

// 문제 12-1 (1)
/*
int main()
{
	int num = 10;
	int *ptr1 = &num;
	int *ptr2 = ptr1;

	(*ptr1)++;
	(*ptr2)++;

	printf("%d \n", num);

	getchar();
	getchar();

	return 0;
}
*/

// 문제 12-1 (2)
/*
int main()
{
	int num1 = 10, num2 = 20;
	int *ptr1 = &num1, *ptr2 = &num2;

	*ptr1 = *ptr1 + 10;
	*ptr2 = *ptr2 - 10;

	printf("*ptr1 = %d \n", *ptr1);
	printf("*ptr2 = %d \n", *ptr2);

	ptr1 = &num2;
	ptr2 = &num1;
	
	printf("*ptr1 = %d \n", *ptr1);
	printf("*ptr2 = %d \n", *ptr2);

	getchar();
	getchar();

	return 0;
}
*/