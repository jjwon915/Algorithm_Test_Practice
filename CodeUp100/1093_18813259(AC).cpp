#include <stdio.h>

int main(){
    int a[24] = {0,};
    int n, c;
    scanf("%d", &n);
    
    for(int i = 0; i < n; i++){
        scanf("%d", &c);
        a[c]++;
    }
    
    for(int i = 1; i < 24; i++){
        printf("%d ", a[i]);
    }
    
    return 0;
}
