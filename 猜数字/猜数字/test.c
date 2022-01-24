#define _CRT_SECURE_NO_WARNINGS  
 


#include<stdio.h>
#include<stdlib.h>
#include<time.h>


void menu()
{
	printf("***********************************\n");
	printf("********1.play      0.exit ********\n");
	printf("***********************************\n");
}
void game()
{
	int i = 0;
	int ret = 0;
	int guess = 0;
	ret = rand() % 100 + 1;//生成1-100之间的随机数
	for (i = 0; i<10; i++)
	{
		printf("请猜数字：");
		scanf("%d", &guess);
		if (guess > ret)
		{
			printf("猜大了，请重新猜");
		}
		else if (guess < ret)
		{
			printf("猜小了，请重新猜");
		}
		else
		{
			printf("恭喜你，猜对了");
			break;
		}
	}
	if (i == 10)
	{
		printf("十次均猜错，游戏失败\n");
	}

}


int main()
{
	int input = 0;
	do
	{
		menu();
		printf("请选择：");
		srand((unsigned)time(NULL));//用时间戳来设置随机数的生成位置
		scanf("%d", &input);
		switch (input)
		{
		case 1:
			printf("进入游戏\n");
			game();
			break;
		case 0:
			printf("退出游戏\n");
			break;
		default:
			printf("选择错误，请重新选择\n");
			break;
		}

	} while (input);

	return 0;
}