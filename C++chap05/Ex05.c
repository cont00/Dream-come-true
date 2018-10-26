//#include <stdio.h>
/*
int main()
{
	int num1 = 3, num2 = 4;
	double divresult1, divresult2;

	divresult1 = num1 / num2;
	divresult2 = (double)num1 / num2;

	printf("divresult1 = %f\n", divresult1);
	printf("divresult2 = %f\n", divresult2);

	getchar();

	return 0;
}
*/

// 문제 05-1 (1)
/*
int main()
{
	int x1, y1;
	int x2, y2;
	int sum;

	printf("좌 상단의 x, y 좌표 : ");
	scanf_s("%d %d", &x1, &y1);
	printf("우 하단의 x, y 좌표 : ");
	scanf_s("%d %d", &x2, &y2);

	sum = (x2 - x1)*(y2 - y1);

	printf("두 점이 이루는 직사각형의 넓이는 %d입니다.", sum);

	getchar();
	getchar();

	return 0;
}
*/

// 문제 05-1 (2)
/*
int main()
{
	double num1;
	double num2;

	printf("첫 번째 실수 입력 : ");
	scanf_s("%lf", &num1);
	printf("두 번째 실수 입력 : ");
	scanf_s("%lf", &num2);

	printf("%lf   %lf", num1, num2);
	printf("%lf + %lf", num1, num2, num1 + num2);
	printf("%lf - %lf", num1, num2, num1 - num2);
	printf("%lf * %lf", num1, num2, num1 * num2);
	printf("%lf / %lf", num1, num2, num1 / num2);

	getchar();
	getchar();

	return 0;
}
*/

// 문제 05-1 (4)
/*
int main()
{
	int a;

	printf("정수 입력 : ");
	scanf_s("%d", &a);

	printf("입력받은 정수를 아스키코드로 변경한 결과 : %c", a);

	getchar();
	getchar();

	return 0;
}
*/

// 문제 05-1 (5)
/*
int main()
{
	char c;

	printf("문자 입력 : ");
	scanf_s("%c", &c, sizeof(char));

	printf("입력받은 아스키코드를 정수로 변경한 결과 : %d", c);

	getchar();
	getchar();

	return 0;
}
*/