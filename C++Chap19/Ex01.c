//#include <stdio.h>

/*
void doA(int a, int b)
{
	printf("doA 입니다.");
	printf("%d + %d = %d \n", a, b, a + b);
}

void doB(char *cp)
{
	printf("%s \n", cp);
}

void doC(int a, int b)
{
	printf("doA 입니다.");
	printf("%d + %d = %d \n", a, b, a * b);
}

int main()
{
	char *ch = "shape of you";
	int a = 10, b = 20;

	void (*fp1)(int, int) = doA;
	void (*fp2)(char *) = doB;
	void(*fp3)(int, int) = doC;

	fp1(a, b);
	doA(a, b);

	fp2(ch);
	doB(ch);

	fp3(a, b);
	doC(a, b);

	printf("printf = %d \n", printf);
	printf("scanf_s = %d \n", scanf_s);
	printf("getchar = %d \n", getchar);

	getchar();

	return 0;
}
*/

/*
int doA(int a, int b)
{
	printf("%d + %d = %d \n", a, b, a + b);
}

int main()
{
	int num = 20;
	void *vnum = &num;

	printf("&num = %d \n", &num);
	printf("vnum = %d \n", vnum);
	printf("vnum = %d \n", *((int*)vnum));

	vnum = doA;
	printf("doA 주소값 = %d \n", doA);
	printf("vnum 주소값 = %d \n", vnum);

	getchar();

	return 0;
}
*/

/*
int main(int a, char *cstr[])
{
	for (int i = 0;i < a;i++)
		printf("%d 번째 문자열 : %s \n", i, cstr[i]);

	getchar();

	return 0;
}
*/