//#include <stdio.h>

/*
void showAryElement(int *ap)
{
	printf("showAryElement %d \n", ap);
	printf("showAryElement %d \n", &ap);
}

int main()
{
	int arr[] = { 1,2,3 };
	int *ap = arr;

	showAryElement(arr);

	printf("\n");
	printf("main 함수의 %d \n", ap);
	printf("main 함수의 %d \n", &ap);

	getchar();

	return 0;
}
*/

/*
void ShowArayElem(int *param, int len)
{
	int i;
	for (i = 0;i < len;i++)
		printf("%d ", param[i]);
	printf("\n");
}

void AddArayElem(int *param, int len, int add)
{
	int i;
	
	for (i = 0;i < len;i++)
		param[i] += add;
}

int main()
{
	int arr[] = { 1,2,3 };

	AddArayElem(arr, sizeof(arr) / sizeof(int), 1);
	ShowArayElem(arr, sizeof(arr) / sizeof(int));

	AddArayElem(arr, sizeof(arr) / sizeof(int), 2);
	ShowArayElem(arr, sizeof(arr) / sizeof(int));

	AddArayElem(arr, sizeof(arr) / sizeof(int), 3);
	ShowArayElem(arr, sizeof(arr) / sizeof(int));

	getchar();

	return 0;
}
*/

