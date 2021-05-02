#include <stdio.h>

int main(){
    int a, b, c, d, e;
    scanf("%1d%1d%1d%1d%1d", &a, &b, &c, &d, &e);
    
    printf("[%d]\n", 10000 * a);
    printf("[%d]\n", 1000 * b);
    printf("[%d]\n", 100 * c);
    printf("[%d]\n", 10 * d);
    printf("[%d]\n", e);
    
    return 0;
}
