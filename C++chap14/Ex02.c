//#include <stdio.h>

/*
int swap(int num1, int num2)
{
	printf("swap 함수 내의 변경전\n");
	printf("num1 = %d\tnum2 = %d \n\n", num1, num2);

	int temp = num1;
	
	num1 = num2;
	num2 = temp;

	printf("swap 함수 내의 변경후\n");
	printf("num1 = %d\tnum2 = %d \n\n", num1, num2);
}

int main()
{
	int a = 10, b = 20;

	printf("main 함수 내의 변경전\n");
	printf("a = %d\tb = %d\n\n", a, b);
	swap(a, b);
	printf("main 함수 내의 변경후\n");
	printf("a = %d\tb = %d\n\n", a, b);

	getchar();

	return 0;
}
*/

/*
int swapRef(int *num1, int *num2)
{
	int temp = *num1;
	*num1 = *num2;
	*num2 = temp;
}

int main()
{
	int num1 = 10, num2 = 20;

	printf("main 함수내의 변경전 num1 = %d, num2 = %d \n", num1, num2);
	swapRef(&num1, &num2);
	printf("main 함수내의 변경후 num1 = %d, num2 = %d \n", num1, num2);

	getchar();

	return 0;
}
*/