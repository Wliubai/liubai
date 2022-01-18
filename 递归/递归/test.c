#define _CRT_SECURE_NO_WARNINGS  

#include<stdio.h>

//递归方法
int Numways(int n)
{
	if (n <= 2)
	{
		return n;
	}
	else
	{
		return Numways(n - 1) + Numways(n - 2);
	}
}
//非递归
int numways(int n)
{
	int a = 1;//一个台阶的跳法
	int b = 2;//两个台阶的跳法
	int c = a;
	while (n > 2)
	{
		c = a + b;
		a = b;
		b = c;
		n--;
	}
	return c;

}
int main()
{
	int n = 0;
	printf("请输入台阶数\n");
	scanf("%d", &n);
	int ret1 = Numways(n);
	int ret2 = numways(n);
	printf("%d\n", ret1);
	printf("%d\n", ret2);
	return 0;
}