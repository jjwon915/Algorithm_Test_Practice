#include <stdio.h>

int main(){
    int n, c;
    scanf("%d", &n);
    
    int a[10000];
    for(int i = 0; i < n; i++){
        scanf("%d", &c);
        a[i] = c;
    }
    
    for(int i = n - 1; i >= 0; i--){
        printf("%d ", a[i]);
    }
    return 0;
}
