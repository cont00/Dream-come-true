//#include <stdio.h>

/*
int main()
{
	int num;

	printf("정수 입력 : ");
	scanf_s("%d", &num);

	if (num < 0)
		printf("입력 값은 0 보다 작다. \n");
	if (num > 0)
		printf("입력 값은 0 보다 크다. \n");
	if (num == 0)
		printf("입력 값은 0 이다. \n");
	if (num != 0)
		printf("입력 값은 0과 다릅니다.\n");
	
	getchar();
	getchar();

	return 0;
}
*/

/*
int main()
{
	int a;
	double num1, num2, sum = 0;

	printf("1. 덧셈		2. 뺄셈		3. 곱셈		4. 나눗셈\n");
	printf("선택 : ");
	scanf_s("%d", &a);
	printf("두 개의 실수를 입력세요 : ");
	scanf_s("%lf %lf", &num1, &num2);

	if (a == 1)		// 덧셈출력
		sum = num1 + num2;
	if (a == 2)		// 뺄셈출력
		sum = num1 - num2;
	if (a == 3)		// 곱셈출력
		sum = num1 * num2;
	if (a == 4)		// 나눗셈출력
		sum = num1 / num2;

	printf("결과 값 : %f \n", sum);

	getchar();
	getchar();

	return 0;
}
*/

/*
int main()
{
	int num;

	for (num = 1; num < 100; num++)
	{
		if (num % 3 == 0 || num % 4 == 0)
			printf("3 또는 4의 배수 : %d\n", num);
	}

	getchar();
	getchar();

	return 0;
}
*/

/*
int main()
{
	int num;

	printf("정수 입력 : ");
	scanf_s("%d", &num);

	if (num < 0)
		printf("입력 값은 0보다 작다. \n");
	else
		printf("입력 값은 0보다 크다. \n");

	getchar();
	getchar();

	return 0;
	}
	*/

/*
int main()
{
	int a;
	double num1, num2, sum = 0;

	printf("1. 덧셈		2. 뺄셈		3. 곱셈		4. 나눗셈\n");
	printf("선택 : ");
	scanf_s("%d", &a);
	printf("두 개의 실수를 입력세요 : ");
	scanf_s("%lf %lf", &num1, &num2);

	if (a == 1)
		sum = num1 + num2;
	else if (a == 2)
		sum = num1 - num2;
	else if (a == 3)
		sum = num1 * num2;
	else
		sum = num1 / num2;

	printf("결과 값 : %.2f \n", sum);

	getchar();
	getchar();

	return 0;
}
*/

/*
int main()
{
	int num, a;

	printf("정수 입력 : ");
	scanf_s("%d", &num);

	a = num > 0 ? num : num * (-1);

	printf("절대값 : %d \n", a);

	getchar();
	getchar();

	return 0;
}
*/

// 문제 08-1 (1)
/*
int main()
{
	int num;

	for (num = 1;num < 100;num++)
	{
		if (num % 7 == 0 || num % 9 == 0)
			printf("7또는 9의 배수 : %d \n", num);
	}

	getchar();
	getchar();

	return 0;
}
*/

// 문제 08-1 (2) (4)
/*
int main()
{
	int a, b, sum = 0;

	printf("첫 번째 정수 입력 : ");
	scanf_s("%d", &a);
	printf("첫 번째 정수 입력 : ");
	scanf_s("%d", &b);

	if (a > b)
	{
		sum = a - b;
		printf("두 정수의 차 : %d", sum);
	}
	else
	{
		sum = b - a;
		printf("두 정수의 차 : %d", sum);
	}

	// (a > b) ? printf("두 정수의 차 : %d", a-b) : printf("두 정수의 차 : %d", b-a);

	getchar();
	getchar();

	return 0;
}
*/

// 문제 08-1 (3)
/*
int main()
{
	int a, b, c, sum = 0;
	char h;
	
	printf("국어, 영어, 수학 순서로 점수를 입력해주세요 : ");
	scanf_s("%d %d %d", &a, &b, &c);

	sum = (a + b + c) / 3;

	if (sum >= 90)
	{
		h = 'A';
		printf("학점 : %c", h);
	}
	else if (sum >= 80)
	{
		h = 'B';
		printf("학점 : %c", h);
	}
	else if (sum >= 70)
	{
		h = 'C';
		printf("학점 : %c", h);
	}
	else if (sum >= 50)
	{
		h = 'D';
		printf("학점 : %c", h);
	}
	else
	{
		h = 'F';
		printf("학점 : %c", h);
	}

	getchar();
	getchar();

	return 0;
}
*/