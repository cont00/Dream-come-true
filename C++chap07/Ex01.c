#include <stdio.h>

/*	디버깅 모드 단축키설명

코드 한 단계 실행 F11
코드 줄 단위 실행 F10
다음 멈추는 위치까지 실행 F5
멈추는 위치 지정 F9
*/

/*
int main()
{
	int i = 0;

	while (i<20)  // i가 20보다 작은 경우 동안에
	{	
		i++; // i를 1씩 증가
		printf("i = %d \n",i); // * 출력

	}

	getchar();

	return 0;
}
*/

/*
int main()
{
	int a = 0, c = 1;

	printf("몇 단? ");
	scanf_s("%d", &a);

	while (c < 10)
	{
		printf("%d X %d = %d \n", a, c, a*c);
		c++;
	}

	getchar();
	getchar();

	return 0;
}
*/


// 문제 07-1 (1)
/*
int main()
{
	int a = 0;

	while (a < 5)
	{
		printf("Hello world !\n");
		a++;
	}
	
	getchar();
	getchar();
	
	return 0;

}
*/

// 문제 07-1 (2)
/*
int main()
{
	int a = 3, c = 1;

	while (c < 6)
	{
		printf("%d \n", a*c);
		c++;
	}

	getchar();
	getchar();

	return 0;
}
*/

// 문제 07-1 (3)
/*
int main()
{
	int a = 1, sum = 0;

	while (a != 0)
	{
		printf("정수 : ");
		scanf_s("%d", &a);
		sum += a;
	}

	printf("입력한 정수의 총합 : %d", sum);

	getchar();
	getchar();

	return 0;
}
*/

// 문제 07-1 (4)
/*
int main()
{
	int a, c = 9;
	
	printf("몇 단? ");
	scanf_s("%d", &a);

	while (c>0)
	{
		printf("%d * %d = %d \n", a, c, a*c);
		c--;
	}

	getchar();
	getchar();

	return 0;
}
*/

// 문제 07-1 (5)
/*
int main()
{
	int a, b, i = 0, sum = 0;

	printf("몇 개의 정수를 입력하겠습니까?  ");
	scanf_s("%d", &a);

	while (i++ < a)
	{
		printf("정수를 입력하세요 : ");
		scanf_s("%d", &b);

		sum += b;
	}

	printf("입력한 정수의 평균 : %.2f", (double)sum/a);

	getchar();
	getchar();

	return 0;
}
*/

/*
int main()
{
	int num = 0;

	while (num != 4)	//num의 숫자가 4가 아닌 경우 참, 숫자가 4인 경우 거짓
	{
		printf("num = %d\n", num);

		num++;
	}

	getchar();

	return 0;
}
*/