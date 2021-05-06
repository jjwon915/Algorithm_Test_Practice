#include <stdio.h>

int main() {
    int A[20][20] = {0,};
    int n, x, y;
    scanf("%d", &n);
    
    for (int i = 1; i <= n; i++){
        scanf("%d %d", &x, &y);
        A[x][y] = 1;
    }
    
    for (int i = 1; i <= 19; i++){
        for (int j = 1; j <= 19; j++){
            printf("%d ", A[i][j]);
        }
        printf("\n");
    }
    return 0;
}

