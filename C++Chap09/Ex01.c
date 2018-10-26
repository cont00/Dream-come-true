//#include <stdio.h>

/*
	1. 전달 값이 있고, 반환 값이 있다.
	2. 전달 값이 있고, 반환 값이 없다.
	3. 전달 값이 없고, 반환 값이 있다.
	4. 전달 값이 없고, 반환 값이 없다.
*/

//1
/*
int doA(int a)
{
	a = a + 10;
	return a;
}

double doB(int a)
{
	double b = a + 2.2;
	return b;
}

int doC(int a, int b)
{
	int c = a + b;
	return c;
}

int main()
{
	int returnValue;
	double returnValue1;
	int returnValue2;

	returnValue = doA(2);
	returnValue1 = doB(10);
	returnValue2 = doC(10, 6);

	printf("returnValue = %d \n", returnValue);
	printf("returnValue1 = %.2lf \n", returnValue1);
	printf("returnValue2 = %d \n", returnValue2);

	getchar();

	return 0;
}
*/


//2
/*
void doA(int a)
{
	printf("doA 함수 전달값 %d \n", a);
	return doA;
}

void doB(double b)
{
	printf("doB 함수 전달값 %.2lf \n", b);
	return;
}

void main()
{
	doA(10);
	doB(2.2);

	printf("main 함수가 반환값이 없습니다. \n");

	getchar();
	
	return 0;
}
*/

/*
int add(int num1, int num2)
{
	return num1 + num2;
}

int main()
{
	int result;

	result = add(3, 4);
	printf("덧셈결과1 : %d\n", result);
	result = add(5, 8);
	printf("덧셈결과2 : %d\n", result);

	getchar();
	getchar();

	return 0;
}
*/