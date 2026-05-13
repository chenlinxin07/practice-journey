#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include <limits.h>
#include <stdlib.h>

typedef struct
{
	int weight;
	int parent, lch, rch;
}HTNode;


//寻找两个最小值
void select(HTNode* HT, int n, int* s1, int* s2)
{
	int min1 = INT_MAX;
	int min2 = INT_MAX;
	*s1 = *s2 = 0;
	for (int i = 1; i <= n; i++)
	{
		if (HT[i].parent == 0&& HT[i].weight<=min1)
		{
			min1 = i;
			*s1 = min1;
		}
	}
	for (int i = 1; i <= n; i++)
	{
		if (HT[i].parent == 0&& HT[i].weight<=min2 && i!=min1)
		{
			min2 = i;
			*s2 = min2;
		}
	}
}

//创建二叉树
HTNode* creatHTtree(HTNode* HT,int n) 
{
	if (n <= 1)
	{
		return NULL;
	}
	int m = 2 * n - 1;
	HT = (HTNode*)malloc(sizeof(HTNode)*(m+1));
	if (HT == NULL)
	{
		printf("内存分配失败！\n");
		exit(1);
	}


	for (int i = 1; i <= m ;i++)
	{
		HT[i].lch = 0;
		HT[i].parent = 0;
		HT[i].rch = 0;
		HT[i].weight = 0;
	}

	printf("请输入%d个叶子节点的权值（空格分隔）：\n", n);
	for (int i = 1;i <= n;i++)
	{
		scanf("%d", &HT[i].weight);
	}

	for (int i = n + 1; i <=  m;i++)
	{
		int s1 = 0, s2 = 0;
		select(HT, i - 1 , &s1, &s2);
		HT[i].weight = HT[s1].weight + HT[s2].weight;
		HT[i].lch = s1;
		HT[i].rch = s2;
		HT[s1].parent = HT[s2].parent = i;
	}
	return HT;
	
}

int main()
{
	HTNode* HT = NULL ;
	printf("请输入叶子节点个数\n");
	int n = 0;
	scanf("%d", &n);
	HT = creatHTtree(HT,n);
	if (HT == NULL)
	{
		printf("哈夫曼树构建失败！\n");
		return 0;
	}
	printf("\n哈夫曼树节点信息（下标: 权值 父节点 左孩子 右孩子）：\n");
	for (int i = 1; i <= 2 * n - 1; i++) {
		printf("%2d: %4d %4d %4d %4d\n", i, HT[i].weight, HT[i].parent, HT[i].lch, HT[i].rch);
	}
}
