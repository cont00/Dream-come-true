//#include <stdio.h>

/*
	1. ���� ���� �ְ�, ��ȯ ���� �ִ�.
	2. ���� ���� �ְ�, ��ȯ ���� ����.
	3. ���� ���� ����, ��ȯ ���� �ִ�.
	4. ���� ���� ����, ��ȯ ���� ����.
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
	printf("doA �Լ� ���ް� %d \n", a);
	return doA;
}

void doB(double b)
{
	printf("doB �Լ� ���ް� %.2lf \n", b);
	return;
}

void main()
{
	doA(10);
	doB(2.2);

	printf("main �Լ��� ��ȯ���� �����ϴ�. \n");

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
	printf("�������1 : %d\n", result);
	result = add(5, 8);
	printf("�������2 : %d\n", result);

	getchar();
	getchar();

	return 0;
}
*/