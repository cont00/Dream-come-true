/*
	지역변수	-	변수의 존재기간(사이클링)
	전역변수	-	프로그램 시작하고 종료할때까지 메모리에 상주 모든곳에서 접근 가능
	static 변수	-	프로그램 시작하고 종료할때까지 메모리에 상주 해당 함수내에서만 접근 가능
	
	함수호출
	4가지 유형
	1. 전달 값이 있고, 반환 값이 있다.
	2. 전달 값이 있고, 반환 값이 없다.
	3. 전달 값이 없고, 반환 값이 있다.
	4. 전달 값이 없고, 반환 값이 없다.
*/

//#include <stdio.h>
/*
int uni_num;	// 전역변수는 초기화 하지 않을 시 0 으로 초기화

int doA()
{
	int a = 10;	//지역변수는 초기화 하지 않을 시 쓰레기 값으로 초기화
	static int sta_num;	// statuc은 초기화 하지 않을 시 0 으로 초기화
	printf("전역변수 값 확인 %d \n", uni_num);
	printf("a = %d \n", a);
	printf("sta_num = %d \n", sta_num);
	uni_num++;
	sta_num++;
	a++;
}

int doB()
{
	int b = 20;
	printf("b = %d \n", b);
	printf("전역변수 값 확인 %d \n", uni_num);
}

int main()
{
	doA();
	doA();
	doA();
	doB();

	getchar();
	getchar();

	return 0;
}
*/