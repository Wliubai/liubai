#define _CRT_SECURE_NO_WARNINGS  
#include<stdlib.h>
#include"game.h"

void menu()
{
	printf("*************************\n");
	printf("****** 1 paly    ********\n");
	printf("****** 0 exit     *******\n");
	printf("*************************\n");
}
void game()
{
	//�׵Ĵ洢��Ϣ
	//�����׵���Ϣ
	char mine[ROWS][COLS] = { 0 };
	//�Ų��׵���Ϣ
	char show[ROWS][COLS] = { 0 };
	//��ʼ��
	InitBoard(mine, ROWS, COLS, '0');
	InitBoard(show, ROWS, COLS, '*');
	//��ӡ����
	//DispalyBoard(mine, ROW, COL);
	DispalyBoard(show, ROW, COL);
	//������
	SetMine(mine, ROW, COL);
	//DispalyBoard(mine, ROW, COL);
	//ɨ��
	FindMine(mine, show, ROW, COL);
}

void test()
{
	int input = 0;
	srand((unsigned int)time(NULL));
	do
	{
		menu();
		printf("��ѡ��:>");
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