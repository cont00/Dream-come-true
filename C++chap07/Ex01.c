#include <stdio.h>

/*	����� ��� ����Ű����

�ڵ� �� �ܰ� ���� F11
�ڵ� �� ���� ���� F10
���� ���ߴ� ��ġ���� ���� F5
���ߴ� ��ġ ���� F9
*/

/*
int main()
{
	int i = 0;

	while (i<20)  // i�� 20���� ���� ��� ���ȿ�
	{	
		i++; // i�� 1�� ����
		printf("i = %d \n",i); // * ���

	}

	getchar();

	return 0;
}
*/

/*
int main()
{
	int a = 0, c = 1;

	printf("�� ��? ");
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


// ���� 07-1 (1)
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

// ���� 07-1 (2)
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

// ���� 07-1 (3)
/*
int main()
{
	int a = 1, sum = 0;

	while (a != 0)
	{
		printf("���� : ");
		scanf_s("%d", &a);
		sum += a;
	}

	printf("�Է��� ������ ���� : %d", sum);

	getchar();
	getchar();

	return 0;
}
*/

// ���� 07-1 (4)
/*
int main()
{
	int a, c = 9;
	
	printf("�� ��? ");
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

// ���� 07-1 (5)
/*
int main()
{
	int a, b, i = 0, sum = 0;

	printf("�� ���� ������ �Է��ϰڽ��ϱ�?  ");
	scanf_s("%d", &a);

	while (i++ < a)
	{
		printf("������ �Է��ϼ��� : ");
		scanf_s("%d", &b);

		sum += b;
	}

	printf("�Է��� ������ ��� : %.2f", (double)sum/a);

	getchar();
	getchar();

	return 0;
}
*/

/*
int main()
{
	int num = 0;

	while (num != 4)	//num�� ���ڰ� 4�� �ƴ� ��� ��, ���ڰ� 4�� ��� ����
	{
		printf("num = %d\n", num);

		num++;
	}

	getchar();

	return 0;
}
*/