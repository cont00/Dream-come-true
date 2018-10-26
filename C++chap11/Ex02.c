//#include <stdio.h>

/*
int main()
{
	char a[] = "Good morning!";

	printf("sizeof(a) = %d \n", sizeof(a));
	printf("a[13] 문자출력 = %c \n", a[13]);
	printf("a[13] 숫자출력 = %d \n", a[13]);
	printf("a[14] 문자출력 = %c \n", a[14]);
	printf("a[14] 숫자출력 = %d \n", a[14]);
	
	a[12] = '?';
	printf("문자열 출력 서식문자 %s \n", a);

	getchar();
	getchar();

	return 0;
}
*/

/*
int main()
{
	char arr[50];
	int idx = 0;

	printf("문자열를 입력 : ");
	scanf_s("%[^\n]s", arr, sizeof(arr));
	
	printf("입력 받은 문자열 : %s \n", arr);

	printf("문자 단위 출력 : ");
	while (arr[idx] != '\0')
	{
		printf("%c", arr[idx]);
		idx++;
	}

	getchar();
	getchar();

	return 0;
}
*/

// 문제 11-2 (1)
/*
int main()
{
	char a[50];
	int i = 0;

	printf("영단어를 입력하세요 : ");
	scanf_s("%[^\n]s", a, sizeof(a));

	printf("입력 받은 영단어 : %s \n", a);

	while (a[i] != '\0')
		i++;

	printf("입력 받은 영단어의 길이 = %d \n", i);

	getchar();
	getchar();

	return 0;
}
*/

// 문제 11-2 (2)
/*
int main()
{
	char a[50], b[50];
	int i, j = 0;
	char reverse;

	printf("문자열을 입력 : ");
	scanf_s("%[^\n]s", a, sizeof(a));

	printf("입력 받은 문자열(정상출력) : %s \n", a);

	
	while (a[j] != '\0')
		j++;

	for (i = 0;i < j / 2;i++)
	{
		reverse = a[i];
		a[i] = a[(j - i) - 1];
		a[(j - i) - 1] = reverse;
	}
	

	for (i = 0;i < a[i] != '\0';i++);
	i--;

	for (j = 0; a[j] != '\0';j++)
	{
		b[j] = a[i];
		i--;
	}
	b[j] = '\0';

	printf("입력 받은 문자열(역순출력) : %s \n", b);

	getchar();
	getchar();

	return 0;
}
*/

// 문제 11-2 (3)
/*
int main()
{
	char a[50];
	int i = 0, j;
	char max = 0;

	printf("문자열을 입력 : ");
	scanf_s("%[^\n]s", a, sizeof(a));

	while (a[i] != '\0')
		i++;

	for (j = 0;j < i;j++)
	{
		if (max < a[j])
			max = a[j];
	}

	printf("아스키 코드값이 가장 큰 영단어 : %c", max);

	getchar();
	getchar();
		
	return 0;
}
*/

/*
void doPrintReverse(char str[])
{
	int i = sizeof(str);

	for (;i > 0;i--)
	{
		printf("%c", str[i]);
	}
}

int main()
{
	char a[] = "안녕하세요? 김현노입니다.";

	printf("%s \n", a);

	doPrintReverse(a);

	getchar();
	getchar();

	return 0;
}
*/