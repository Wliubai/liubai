#define _CRT_SECURE_NO_WARNINGS  

#include<stdio.h>
#include<stdlib.h>
#include"game.h"

void menu()
{
	printf("********************************\n");
	printf("***1 paly      0 exit  *********\n");
	printf("********************************\n");
}
void game()
{
	char ret = 0;
	char board[ROW][COL] = { 0 };
	//��ʼ������
	initboard(board, ROW, COL);
	//��ӡ����
	dispalyBoard(board, ROW, COL);
	//����
	while (1)
	{
		//�������
		PalyerMove(board, ROW, COL);
		dispalyBoard(board, ROW, COL);
		//�ж�����Ƿ�Ӯ
		ret = IsWin(board, ROW, COL);
		if (ret != 'C')
		{
			break;
		}
		if (ret == '#')
		{
			printf("���Ӯ\n");
		}
		else if (ret == '*')
		{
			printf("����Ӯ\n");
		}
		else
		{
			printf("ƽ��\n");
		}

			//��������
		ComputerMove(board, ROW, COL);
		dispalyBoard(board, ROW, COL);
	}
	
}
void test()
{
	int input = 0;
	srand((unsigned int)time(NULL));
	do
	{
		menu();
			printf("��ѡ��>:");
		scanf("%d", &input);
		switch (input)
		{
		case 1:
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
}
int main()
{
	test();
	return 0;
}