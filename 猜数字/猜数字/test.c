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
	ret = rand() % 100 + 1;//����1-100֮��������
	for (i = 0; i<10; i++)
	{
		printf("������֣�");
		scanf("%d", &guess);
		if (guess > ret)
		{
			printf("�´��ˣ������²�");
		}
		else if (guess < ret)
		{
			printf("��С�ˣ������²�");
		}
		else
		{
			printf("��ϲ�㣬�¶���");
			break;
		}
	}
	if (i == 10)
	{
		printf("ʮ�ξ��´���Ϸʧ��\n");
	}

}


int main()
{
	int input = 0;
	do
	{
		menu();
		printf("��ѡ��");
		srand((unsigned)time(NULL));//��ʱ��������������������λ��
		scanf("%d", &input);
		switch (input)
		{
		case 1:
			printf("������Ϸ\n");
			game();
			break;
		case 0:
			printf("�˳���Ϸ\n");
			break;
		default:
			printf("ѡ�����������ѡ��\n");
			break;
		}

	} while (input);

	return 0;
}