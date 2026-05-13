#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>

struct TreeNode {
    int val;
    struct TreeNode* left;
    struct TreeNode* right;
};

int** res;
int row, col;

//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

int** levelOrder(struct TreeNode* root, int* returnSize, int** returnColumnSizes) {
    // write code here
    *returnSize = 0;
    if (root == NULL) {
        *returnColumnSizes = NULL;
        return NULL;
    }

    // 1. 先给结果分配内存（最大1500层）
    res = (int**)malloc(sizeof(int*) * 1500);
    // 2. 给「每层节点数」分配内存
    *returnColumnSizes = (int*)malloc(sizeof(int) * 1500);

    //创建队列
    struct TreeNode* queue[1500];
    int head = 0, rear = 0;
    queue[rear++] = root;

    row = 0;
    col = 0;

    // 4. 外层循环：按层遍历，每一轮处理「一整层」
    while (head != rear)
    {
        // 🔑 关键1：记录当前层的队尾，圈定当前层的节点范围：head ~ preRear-1
        int preRear = rear;
        // 🔑 关键2：每一层的列从0开始，重置col
        col = 0;
        //给当前行分配列空间！！！
        res[row] = (int*)malloc(sizeof(int) * 1500);

        // 内层循环：遍历当前层的所有节点
        while (head < preRear) {
            // 出队：取出队头节点
            struct TreeNode* cur = queue[head++];

            // 存到当前层的当前列
            res[row][col++] = cur->val;

            // 左右孩子入队，放到下一层
            if (cur->left != NULL) {
                queue[rear++] = cur->left;
            }
            if (cur->right != NULL) {
                queue[rear++] = cur->right;
            }
        }
        (*returnColumnSizes)[row] = col;
        row++;
    }
    *returnSize = row;
    return res;
}

// 创建树节点
struct TreeNode* createNode(int val) {
    struct TreeNode* node = (struct TreeNode*)malloc(sizeof(struct TreeNode));
    node->val = val;
    node->left = NULL;
    node->right = NULL;
    return node;
}

// 主函数 程序入口
int main() {
    // 构建测试二叉树
    struct TreeNode* root = createNode(1);
    root->right = createNode(2);
    root->right->left = createNode(3);

    int returnSize;
    int* returnColumnSizes;
    int** result = levelOrder(root, &returnSize, &returnColumnSizes);

    // 打印层序遍历结果
    printf("层序遍历结果：\n");
    for (int i = 0; i < returnSize; i++) {
        for (int j = 0; j < returnColumnSizes[i]; j++) {
            printf("%d ", result[i][j]);
        }
        printf("\n");
    }

    // 释放内存
    for (int i = 0; i < returnSize; i++) {
        free(result[i]);
    }
    free(result);
    free(returnColumnSizes);

    return 0;
}
