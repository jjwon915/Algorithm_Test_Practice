#include <stdio.h>

int main(){
    int a[1000][1000] = {0,};
    int w, h;
    scanf("%d %d", &w, &h);
    int n;
    scanf("%d", &n);
    
    int l, d, x, y;
    for(int i = 0; i < n; i++){
        scanf("%d %d %d %d", &l, &d, &x, &y);
        if(d == 0){
            for(int j = 0; j < l; j++){
                a[x][y] = 1;
                y += 1;
            }
        }
        else if(d == 1){
            for(int j = 0; j < l; j++){
                a[x][y] = 1;
                x += 1;
            }
        }
    }
    
    for(int i = 1; i <= w; i++){
        for(int j = 1; j <= h; j++){
            printf("%d ", a[i][j]);
        }
        printf("\n");
    }
    
    return 0;
}
