//#include <stdio.h>
/*
int main()
{
	int num1 = 3, num2 = 4;
	double divresult1, divresult2;

	divresult1 = num1 / num2;
	divresult2 = (double)num1 / num2;

	printf("divresult1 = %f\n", divresult1);
	printf("divresult2 = %f\n", divresult2);

	getchar();

	return 0;
}
*/

// ���� 05-1 (1)
/*
int main()
{
	int x1, y1;
	int x2, y2;
	int sum;

	printf("�� ����� x, y ��ǥ : ");
	scanf_s("%d %d", &x1, &y1);
	printf("�� �ϴ��� x, y ��ǥ : ");
	scanf_s("%d %d", &x2, &y2);

	sum = (x2 - x1)*(y2 - y1);

	printf("�� ���� �̷�� ���簢���� ���̴� %d�Դϴ�.", sum);

	getchar();
	getchar();

	return 0;
}
*/

// ���� 05-1 (2)
/*
int main()
{
	double num1;
	double num2;

	printf("ù ��° �Ǽ� �Է� : ");
	scanf_s("%lf", &num1);
	printf("�� ��° �Ǽ� �Է� : ");
	scanf_s("%lf", &num2);

	printf("%lf   %lf", num1, num2);
	printf("%lf + %lf", num1, num2, num1 + num2);
	printf("%lf - %lf", num1, num2, num1 - num2);
	printf("%lf * %lf", num1, num2, num1 * num2);
	printf("%lf / %lf", num1, num2, num1 / num2);

	getchar();
	getchar();

	return 0;
}
*/

// ���� 05-1 (4)
/*
int main()
{
	int a;

	printf("���� �Է� : ");
	scanf_s("%d", &a);

	printf("�Է¹��� ������ �ƽ�Ű�ڵ�� ������ ��� : %c", a);

	getchar();
	getchar();

	return 0;
}
*/

// ���� 05-1 (5)
/*
int main()
{
	char c;

	printf("���� �Է� : ");
	scanf_s("%c", &c, sizeof(char));

	printf("�Է¹��� �ƽ�Ű�ڵ带 ������ ������ ��� : %d", c);

	getchar();
	getchar();

	return 0;
}
*/