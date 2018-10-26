//#include <stdio.h>

/*
	cosnt 예문
	const int *a 값의 변경 불가
	int const *a 주소값의 변경 X
	개발자가 혹시 값을 변경하지 말아야 하는 상황에서 실수로 변경을 하는것을 미연에 방지하기위해
	(주로 팀별로 움직일때)
*/
/*
int main()
{
	int num1 = 10;
	int num2 = 20;
	int const *pnum = &num1;	// 값의 변경이 불가능, 주소의 변경은 가능
	int * const pnum = &num1;	// 값의 변경은 가능, 주소의 변경은 불가능

	*pnum = 20;		// 값의 변경이 불가능하기 때문에 이곳에서 에러가 발생.
	pnum = &num2;	// 값의 변경은 불가능하지만 주소를 변경하는건 가능.

	printf("num1 = %d", num1);
	printf("num2 = %d", num2);

	getchar();

	return 0;
}
*/

