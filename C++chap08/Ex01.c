//#include <stdio.h>

/*
int main()
{
	int num;

	printf("���� �Է� : ");
	scanf_s("%d", &num);

	if (num < 0)
		printf("�Է� ���� 0 ���� �۴�. \n");
	if (num > 0)
		printf("�Է� ���� 0 ���� ũ��. \n");
	if (num == 0)
		printf("�Է� ���� 0 �̴�. \n");
	if (num != 0)
		printf("�Է� ���� 0�� �ٸ��ϴ�.\n");
	
	getchar();
	getchar();

	return 0;
}
*/

/*
int main()
{
	int a;
	double num1, num2, sum = 0;

	printf("1. ����		2. ����		3. ����		4. ������\n");
	printf("���� : ");
	scanf_s("%d", &a);
	printf("�� ���� �Ǽ��� �Է¼��� : ");
	scanf_s("%lf %lf", &num1, &num2);

	if (a == 1)		// �������
		sum = num1 + num2;
	if (a == 2)		// �������
		sum = num1 - num2;
	if (a == 3)		// �������
		sum = num1 * num2;
	if (a == 4)		// ���������
		sum = num1 / num2;

	printf("��� �� : %f \n", sum);

	getchar();
	getchar();

	return 0;
}
*/

/*
int main()
{
	int num;

	for (num = 1; num < 100; num++)
	{
		if (num % 3 == 0 || num % 4 == 0)
			printf("3 �Ǵ� 4�� ��� : %d\n", num);
	}

	getchar();
	getchar();

	return 0;
}
*/

/*
int main()
{
	int num;

	printf("���� �Է� : ");
	scanf_s("%d", &num);

	if (num < 0)
		printf("�Է� ���� 0���� �۴�. \n");
	else
		printf("�Է� ���� 0���� ũ��. \n");

	getchar();
	getchar();

	return 0;
	}
	*/

/*
int main()
{
	int a;
	double num1, num2, sum = 0;

	printf("1. ����		2. ����		3. ����		4. ������\n");
	printf("���� : ");
	scanf_s("%d", &a);
	printf("�� ���� �Ǽ��� �Է¼��� : ");
	scanf_s("%lf %lf", &num1, &num2);

	if (a == 1)
		sum = num1 + num2;
	else if (a == 2)
		sum = num1 - num2;
	else if (a == 3)
		sum = num1 * num2;
	else
		sum = num1 / num2;

	printf("��� �� : %.2f \n", sum);

	getchar();
	getchar();

	return 0;
}
*/

/*
int main()
{
	int num, a;

	printf("���� �Է� : ");
	scanf_s("%d", &num);

	a = num > 0 ? num : num * (-1);

	printf("���밪 : %d \n", a);

	getchar();
	getchar();

	return 0;
}
*/

// ���� 08-1 (1)
/*
int main()
{
	int num;

	for (num = 1;num < 100;num++)
	{
		if (num % 7 == 0 || num % 9 == 0)
			printf("7�Ǵ� 9�� ��� : %d \n", num);
	}

	getchar();
	getchar();

	return 0;
}
*/

// ���� 08-1 (2) (4)
/*
int main()
{
	int a, b, sum = 0;

	printf("ù ��° ���� �Է� : ");
	scanf_s("%d", &a);
	printf("ù ��° ���� �Է� : ");
	scanf_s("%d", &b);

	if (a > b)
	{
		sum = a - b;
		printf("�� ������ �� : %d", sum);
	}
	else
	{
		sum = b - a;
		printf("�� ������ �� : %d", sum);
	}

	// (a > b) ? printf("�� ������ �� : %d", a-b) : printf("�� ������ �� : %d", b-a);

	getchar();
	getchar();

	return 0;
}
*/

// ���� 08-1 (3)
/*
int main()
{
	int a, b, c, sum = 0;
	char h;
	
	printf("����, ����, ���� ������ ������ �Է����ּ��� : ");
	scanf_s("%d %d %d", &a, &b, &c);

	sum = (a + b + c) / 3;

	if (sum >= 90)
	{
		h = 'A';
		printf("���� : %c", h);
	}
	else if (sum >= 80)
	{
		h = 'B';
		printf("���� : %c", h);
	}
	else if (sum >= 70)
	{
		h = 'C';
		printf("���� : %c", h);
	}
	else if (sum >= 50)
	{
		h = 'D';
		printf("���� : %c", h);
	}
	else
	{
		h = 'F';
		printf("���� : %c", h);
	}

	getchar();
	getchar();

	return 0;
}
*/