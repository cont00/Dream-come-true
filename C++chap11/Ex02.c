//#include <stdio.h>

/*
int main()
{
	char a[] = "Good morning!";

	printf("sizeof(a) = %d \n", sizeof(a));
	printf("a[13] ������� = %c \n", a[13]);
	printf("a[13] ������� = %d \n", a[13]);
	printf("a[14] ������� = %c \n", a[14]);
	printf("a[14] ������� = %d \n", a[14]);
	
	a[12] = '?';
	printf("���ڿ� ��� ���Ĺ��� %s \n", a);

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

	printf("���ڿ��� �Է� : ");
	scanf_s("%[^\n]s", arr, sizeof(arr));
	
	printf("�Է� ���� ���ڿ� : %s \n", arr);

	printf("���� ���� ��� : ");
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

// ���� 11-2 (1)
/*
int main()
{
	char a[50];
	int i = 0;

	printf("���ܾ �Է��ϼ��� : ");
	scanf_s("%[^\n]s", a, sizeof(a));

	printf("�Է� ���� ���ܾ� : %s \n", a);

	while (a[i] != '\0')
		i++;

	printf("�Է� ���� ���ܾ��� ���� = %d \n", i);

	getchar();
	getchar();

	return 0;
}
*/

// ���� 11-2 (2)
/*
int main()
{
	char a[50], b[50];
	int i, j = 0;
	char reverse;

	printf("���ڿ��� �Է� : ");
	scanf_s("%[^\n]s", a, sizeof(a));

	printf("�Է� ���� ���ڿ�(�������) : %s \n", a);

	
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

	printf("�Է� ���� ���ڿ�(�������) : %s \n", b);

	getchar();
	getchar();

	return 0;
}
*/

// ���� 11-2 (3)
/*
int main()
{
	char a[50];
	int i = 0, j;
	char max = 0;

	printf("���ڿ��� �Է� : ");
	scanf_s("%[^\n]s", a, sizeof(a));

	while (a[i] != '\0')
		i++;

	for (j = 0;j < i;j++)
	{
		if (max < a[j])
			max = a[j];
	}

	printf("�ƽ�Ű �ڵ尪�� ���� ū ���ܾ� : %c", max);

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
	char a[] = "�ȳ��ϼ���? �������Դϴ�.";

	printf("%s \n", a);

	doPrintReverse(a);

	getchar();
	getchar();

	return 0;
}
*/