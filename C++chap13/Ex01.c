//#include <stdio.h>

/*
int main()
{
	int a[] = { 1,2,3 };
	double b[] = { 1.1,2.2,3.3 };
	
	int  *ptr1 = a;
	double *ptr2 = b;

	printf("%d \n%g \n\n", *ptr1, *ptr2);

	printf("%d \n%g \n\n", ptr1, ptr2);
	
	printf("%d \n%g \n", a, b);

	getchar();
	getchar();

	return 0;
}
*/

/*
int doA()
{
	printf("doA 함수 호출입니다. \n");
	return 1;
}

int doB(int a)
{
	for (int i = 0;i < a;i++)
		printf("보내진 수 만큼 반복해서 출력\n");

	return 2;
}

int main()
{
	int a = doA();

	printf("a = %d \n", a);

	a = doB(3);

	printf("a = %d \n", a);

	getchar();

	return 0;
}
*/

/*
int main()
{
	int a = 10;
	int *b = &a;

	printf("*b = %d \n", *b);

	printf("a의 주소 값 = %d \n", &a);
	printf("b의 값 = %d \n", b);

	*b = 20;

	printf("*b = %d \n", *b);
	printf("a의 값 = %d \n", a);

	getchar();

	return 0;
}
*/

/*
int main()
{
	int arr[] = { 1,2,3 };

	printf("arr = %d \n", arr);
	printf("arr[0] = %d \n", &arr[0]);
	printf("arr[1] = %d \n", &arr[1]);
	printf("arr[2] = %d \n", &arr[2]);

	printf("\n");

	char crr[] = { '1', '2','3' };

	printf("crr = %d \n", crr);
	printf("crr[0] = %d \n", &crr[0]);
	printf("crr[1] = %d \n", &crr[1]);
	printf("crr[2] = %d \n\n", &crr[2]);

	printf("*arr = %d \n", *arr);
	printf("arr[0] = %d \n\n", arr[0]);
	printf("*crr = %c \n", *crr);
	printf("crr[0] = %c \n", crr[0]);

	getchar();

	return 0;
}
*/

/*
int main()
{
	int arr = 10;
	int *parr = &arr;

	double darr = 10;
	double *pdarr = &darr;

	printf("parr = %d \n", parr);
	printf("parr+1 = %d \n", parr + 1);
	printf("parr+2 = %d \n", parr + 2);

	printf("pdarr = %d \n", pdarr);
	printf("pdarr+1 = %d \n", pdarr + 1);
	printf("pdarr+2 = %d \n", pdarr + 2);
	
	getchar();
	
	return 0;
}
*/

/*
int main()
{
	int arr[] = { 11,22,33,44 };
	int *p = arr;

	printf("*p = %d \n", *p);
	printf("*(p+1) = %d \n", *(p + 1));
	printf("*(p+2) = %d \n", *(p + 2));
	printf("*(p+3) = %d \n", *(p + 3));

	getchar();
	
	return 0;
}
*/