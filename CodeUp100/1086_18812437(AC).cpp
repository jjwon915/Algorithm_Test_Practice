#include <stdio.h>

int main(){
    int a, b, c;
    
    scanf("%d %d %d", &a, &b, &c);
    
    float sum = a * b * c;
    
    printf("%.2f MB", sum / (8 * 1024 * 1024));
    
    return 0;
}
