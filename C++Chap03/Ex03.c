#include <stdio.h>

/*
int main()
{
	int a, b, c;

	printf("정수 one : ");
	scanf_s("%d", &a);

	printf("정수 two : ");
	scanf_s("%d", &b);

	c = a + b;
	printf("%d + %d = %d \n", a, b, c);

	return 0;
}
*/

/*
int main()
{
	int a, b, c, sum;
	printf("세 개의 정수 입력 : ");
	scanf_s("%d %d %d", &a, &b, &c);

	sum = a + b + c;
	printf("%d + %d + %d = %d", a, b, c, sum);

	getchar();

	return 0;
}
*/


//문제 03-1 (1)
/*
int main()
{
	int a, b;

	printf("첫 번째 정수 : ");
	scanf_s("%d", &a);
	printf("두 번째 정수 : ");
	scanf_s("%d", &b);

	printf("%d - %d = %d\n", a, b, a - b);
	printf("%d * %d = %d\n", a, b, a * b);

	getchar();
	getchar();

	return 0;
}
*/


//문제 03-1 (2)
/*
int main()
{
	int a, b, c, sum;

	printf("세 개의 정수 입력 : ");
	scanf_s("%d %d %d", &a, &b, &c);

	sum = a * b + c;

	printf("%d * %d + %d = %d", a, b, c, sum);

	getchar();
	getchar();

	return 0;
}
*/

// 문제 03-1 (3)
/*
int main()
{
	int a;

	printf("정수 : ");
	scanf_s("%d", &a);

	
	printf("%d의 제곱 = %d \n", a, a * a);

	getchar();
	getchar();

	return 0;
}
*/

// 문제 03-1 (4)
/*
int main()
{
	int a, b;

	printf("첫 번째 정수 : ");
	scanf_s("%d", &a);
	printf("두 번째 정수 : ");
	scanf_s("%d", &b);

	printf("%d / %d = %d \n", a, b, a / b);
	printf("%d %% %d = %d \n", a, b, a % b);

	getchar();
	getchar();

	return 0;
}
*/

// 문제 03-1 (5)
/*
int main()
{
	int a, b, c, sum;

	printf("세 개의 정수 : ");
	scanf_s("%d %d %d", &a, &b, &c);

	sum = (a - b) * (b + c) * (c % a);
	printf("(%d - %d) * (%d + %d) * (%d %% %d) = %d \n", a,b,b,c,c,a,sum);

	getchar();
	getchar();

	return 0;
}
*/