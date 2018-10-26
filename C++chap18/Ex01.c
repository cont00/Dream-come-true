#include <stdio.h>

/*
int main()
{
	int arr1[2][3];
	int arr2[3][2];

	printf("주소값 시작 \n\n");
	printf("arr1[0] = %d \narr1[1] = %d \n\n", arr1[0], arr1[1]);
	printf("arr2[0] = %d \narr2[1] = %d \narr2[2] = %d \n\n", arr2[0], arr2[1], arr2[2]);
	printf("주소값 끝 \n\n\n");

	printf("주소값 시작 \n\n");
	printf("arr1+0 = %d \narr1+1 = %d \n\n", arr1[0], arr1[1]);
	printf("arr2+0 = %d \narr2+1 = %d \narr2+2 = %d \n\n", arr2 + 0, arr2 + 1, arr2 + 2);
	printf("주소값 끝 \n");

	getchar();

	return 0;
}
*/

/*
int main()
{
int arr1[2][2] = { {1,2}, {3,4} };
int arr2[3][2] = { { 1,2 },{ 3,4 }, {5, 6} };
int arr3[4][3] = { { 1,2,3 },{ 4,5, 6 },{7,8,9},{10,11,12} };

int(*ptr1)[2];
int(*ptr2)[2];
int(*ptr3)[3];

ptr1 = arr1;
printf("arr1 번째 배열 출력 \n");
for (int i = 0;i < 2;i++)
printf("%3d %3d \n", ptr1[i][0], ptr1[i][1]);

printf("\n\n");

ptr2 = arr2;
printf("arr2 번째 배열 출력 \n");
for (int i = 0;i < 3;i++)
printf("%3d %3d \n", ptr2[i][0], ptr2[i][1]);

printf("\n\n");

ptr3 = arr3;
printf("arr3 번째 배열 출력 \n");
for (int i = 0;i < 4;i++)
printf("%3d %3d %3d \n", ptr3[i][0], ptr3[i][1], ptr3[i][2]);

getchar();

return 0;
}
*/

/*
int showArray(int(*pnum)[3])
{
	for (int i = 0;i < 2;i++)
		printf("%d %d %d \n", pnum[i][0], pnum[i][1], pnum[i][2]);
}

int main()
{
	int arr[2][3] = { {1,2,3},{4,5,6} };
	
	showArray(arr);

	getchar();

	return 0;
}
*/