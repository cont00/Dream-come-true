//#include <stdio.h>

/*
int main()
{
	int arr[] = { 5,10,12,4,2 };

	for (int i = 0;i < 5;i++)
	{
		for (int j = i + 1;j < 5;j++)
		{
			if (arr[i] > arr[j])
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;

			}				
		}
	}

	printf("arr[5] = ");

	for (int i = 0;i < 5;i++)
		printf("%d  ", arr[i]);

	getchar();

	return 0;
}
*/

/*
int main()
{
	int num = 10;
	int *pnum;
	pnum = &num;

	int **ppnum;
	ppnum = &pnum;

	printf("num = %d \n", num);
	printf("*pnum = %d \n", *pnum);
	printf("**ppnum = %d \n", **ppnum);

	// num �ּҰ� ���
	printf("num �ּҰ� = %p \n", &num);
	printf("num �ּҰ� = %p \n", pnum);
	printf("num �ּҰ� = %p \n", *ppnum);
	printf("\n");

	// pnum �ּҰ� ���
	printf("pnum �ּҰ� = %p \n", &pnum);
	printf("pnum �ּҰ� = %p \n", ppnum);
	printf("\n");

	// ppnum �ּҰ� ���
	printf("ppnum �ּҰ� = %p \n", &ppnum);

	getchar();

	return 0;
}
*/

/*
int swap(int *p1, int *p2)
{
	int *temp = p1;
	p1 = p2;
	p2 = temp;

	printf("*p1 = %d, *p2 = %d\n", *p1, *p2);
}

int main(){
	int a = 10, b = 20;
	int *pa;
	pa = &a;
	int *pb = &b;

	printf("&pa = %d, pb = %d \n", *pa, *pb);
	swap(pa, pb);
	printf("&pa = %d, pb = %d \n", *pa, *pb);

	getchar();

	return 0;
}
*/

/*
int swap(int **p1, int **p2)
{
	int *temp = *p1;
	*p1 = *p2;
	*p2 = temp;
}

int main()
{
	int num1 = 10, num2 = 20;
	int *pnum1 = &num1;
	int *pnum2 = &num2;

	printf("*pnum1 = %d, *pnum2 = %d \n", *pnum1, *pnum2);
	swap(&pnum1, &pnum2);
	printf("*pnum1 = %d, *pnum2 = %d \n", *pnum1, *pnum2);

	getchar();

	return 0;
}
*/

/*
int main()
{
	int a = 10;
	int *pa = &a;
	int **ppa = &pa;
	int ***pppa = &ppa;
	int ****ppppa = &pppa;
	ppppa = &pppa;
	
	printf("a = %d \n", a);
	printf("*pa = %d \n", &a);
	printf("**ppa = %d \n", *pa);
	printf("***pppa = %d \n", **pppa);
	printf("****ppppa = %d \n", ***ppppa);

	getchar();

	return 0;
}
*/