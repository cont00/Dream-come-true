//#include <stdio.h>
/*
// 프로그램 사용방법 출력 함수
void howToUseThusProg()
{
	printf("계산기 입니다. \n");
	printf("1. 덧셈	 2. 뺄셈  3. 곱셈  4. 나눗셈  5.나머지  6. 종료 \n");
}

// 숫자 입력 받는 반환 해주는 함수
int inputNum()
{
	int num = 0;
	printf("번호 입력 : ");
	scanf_s("%d", &num);
	
	return num;
}

int main()
{
	int num1 = 0, num2 = 0;
	int select = 0;
	
	while (select != 6)
	{
		howToUseThusProg();
		select = inputNum();

		if (select == 1)
		{
			printf("덧셈 입니다. \n ");
			num1 = inputNum();
			num2 = inputNum();
			printf("%d + %d = %d", num1, num2, num1 + num2);
		}
		else if (select == 2)
		{
			printf("뺄셈 입니다. \n ");
			num1 = inputNum();
			num2 = inputNum();
			printf("%d - %d = %d", num1, num2, num1 - num2);
		}
		else if (select == 3)
		{
			printf("곱셈 입니다. \n ");
			num1 = inputNum();
			num2 = inputNum();
			printf("%d * %d = %d", num1, num2, num1 * num2);
		}
		else if (select == 4)
		{
			printf("나눗셈 입니다. \n ");
			num1 = inputNum();
			num2 = inputNum();
			printf("%d / %d = %d", num1, num2, num1 / num2);
		}
		else if (select == 5)
		{
			printf("나머지 입니다. \n ");
			num1 = inputNum();
			num2 = inputNum();
			printf("%d %% %d = %d", num1, num2, num1 % num2);
		}
		else
		{
			printf("종료 합니다. \n ");
		}
	}
	getchar();
	getchar();

	return 0;
}
*/