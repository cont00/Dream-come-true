//#include <stdio.h>

/*
int main()
{
	int a;		//4byte 공간에 정수를 담을 수 있음
	double b;	//8byte 공간에 실수를 담을 수 있음

	a = 20;
	printf("a = %d\n", a);
	a = 30;
	printf("a = %d\n", a);

	getchar();

	return 0;
}
*/

/*
int main()
{
	int a = 9, b = 2;

	printf("%d + %d = %d \n", a, b, a + b);
	printf("%d - %d = %d \n", a, b, a - b);
	printf("%d * %d = %d \n", a, b, a * b);
	printf("%d / %d의 몫 = %d \n", a, b, a / b);
	printf("%d %% %d의 나머지 = %d \n", a, b, a % b);

	a = a + b;
	printf("a = %d \n", a);

	a += b;
	printf("a = %d \n", a);

	getchar();
	
	return 0;
}
*/

/*
int main()
{
	int a = 2, b = 4, c = 6;
	a += 3;
	b *= 4;
	c %= 5;

	printf("result : %d, %d, %d \n", a, b, c);

	getchar();

	return 0;
}
*/

/*
int main()
{
	int a = +2;
	int b = -4;

	a = -a;
	printf("a = %d\n", a);
	b = -b;
	printf("b = %d\n", b);

	getchar();

	return 0;
}
*/

/*
int main()
{
	int a = 12;
	int b = 12;

	printf("a : %d \n", a);
	printf("a++ : %d \n", a++);
	printf("a : %d \n\n", a);

	printf("b : %d \n", b);
	printf("++b : %d \n", ++b);
	printf("b : %d \n", b);

	getchar();

	return 0;
}
*/

/*
int main()
{
	int a = 10;
	int b = (a--) + 2;

	printf("a : %d\n", a);
	printf("b : %d\n", b);

	getchar();

	return 0;
}
*/

/*
int main()
{
	int a = 10;
	int b = 12;
	int c1, c2, c3;

	c1 = (a == b);
	c2 = (a <= b);
	c3 = (a >= b);

	printf("c1 : %d\n", c1);
	printf("c2 : %d\n", c2);
	printf("c3 : %d\n", c3);

	getchar();

	return 0;
}
*/

/*
int main()
{
	int a = 10, b = 12;
	int c1, c2, c3;

	c1 = (a == 10 && b == 12);
	c2 = (a < 12 || b > 12);
	c3 = (!a);
	
	printf("c1 : %d\n", c1);
	printf("c2 : %d\n", c2);
	printf("c3 : %d\n", c3);

	getchar();

	return 0;
}
*/