#include <stdio.h>

int main(){
    int a, b, c;
    scanf("%d %d %d", &a, &b, &c);
    
    int result = a + (b * (c-1));
    printf("%d", result);
    
    return 0;
}
