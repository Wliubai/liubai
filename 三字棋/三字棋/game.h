#define ROW 3
#define COL 3
#include<stdio.h>
#include<time.h>
#include<stdlib.h>

void initboard(char board[ROW][COL], int row, int col);
void dispalyBoard(char board[ROW][COL],int row, int col);
void PalyerMove(char board[ROW][COL], int row, int col);
void ComputerMove(char board[ROW][COL], int row, int col);
 
char IsWin(char board[ROW][COL], int row, int col);
