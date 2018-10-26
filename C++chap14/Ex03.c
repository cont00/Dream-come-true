//#include <stdio.h>

// 문제 14-1 (1)
/*
// 값을 전달 받아가지고 값을 반환하는 함수
int SquareByValue(int num)
{
	return num * num;
}

// 주소값을 전달 받아가지고 그 해당되는 주소값에 제곱을 저장하는 함수
void SquareByReference(int *num)
{
	*num *= *num;
}

int main()
{
	int num = 2, temp = num;

	printf("SquareByValue(%d) = %d \n", num, SquareByValue(num));
	SquareByReference(&num);
	printf("num = %d \n", num);

	getchar();
	
	return 0;
}
*/

// 문제 14-1 (2)
/*
int swap3(int *ap1, int *ap2, int *ap3)
{
	int temp = *ap1;
	*ap1 = *ap2;
	*ap2 = *ap3;
	*ap3 = temp;
}

int main()
{
	int  num1 = 10, num2 = 20, num3 = 30;

	printf("num1 = %d, num2 = %d, num3 = %d \n", num1, num2, num3);
	
	swap3(&num1, &num2, &num3);
	
	printf("num1 = %d, num2 = %d, num3 = %d \n", num1, num2, num3);

	getchar();

	return 0;
}
*/

/*
int doA(int a, int *p)
{
	*p *=  *p;

	return a * a;
}

int main()
{
	int value_num = 2;
	int ref_num = 4;

	printf("value_num = %d, ref_num = %d \n", value_num, ref_num);
	value_num = doA(value_num, &ref_num);
	printf("value_num = %d, ref_num = %d \n", value_num, ref_num);

	getchar();

	return 0;
}
*/