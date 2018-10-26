//#include <stdio.h>

// 도전 1
/*
int main()
{
	int a = 0;

	printf("10진수 입력 : ");
	scanf_s("%d", &a);



	getchar();
	getchar();

	return 0;
}
*/

// 도전 2
/*
int main()
{
	int min, max;
	int i,j;

	for(i = 0; i < 10; i++)
	{
		for(j = min; min < max; j++)
		{
			
		}
	}

	getchar();
	getchar();

	return 0;
}
*/

// 도전 3
/*
int main()
{
	int num1, num2;
	int max = 0;
	int i = 1;
	int gcd;

	printf("숫자 입력 : ");
	scanf_s("%d", &num1);
	printf("숫자 입력 : ");
	scanf_s("%d", &num2);

	if (num1 > num2)
		max = num2;
	else
		max = num1;

	for (i=0;i < max + 1; i++)
	{
		if (num1 % i == 0 && num2 % i == 0)
		{
			gcd = i;
		}
	}

	printf("gcd = %d \n", gcd);

	getchar();
	getchar();

	return 0;
}
*/

// 문제 4
/*
int main()
{
	int a = a = 500, b = 700, c = 400;
	int tot = 3500 - (a + b + c);

	printf("현재 당신이 소유하고 있는 금액 : 3500 \n");

	for (int x = 0;x < 5;x++)
	{
		for (int y = 0;y < 4;y++)
		{
			for (int z = 0;z < 6;z++)
			{
				if(tot - ((a*x) + (b*y) + (c*z)) == 0)
					printf("크림빵 : %d 개, 새우깡 %d 개, 콜라 %d 개 \n", x+1, y+1, z+1);
			}
		}
	}

	printf("어떻게 구입하시겠습니까?");
	

	getchar();

	return 0;
}
*/