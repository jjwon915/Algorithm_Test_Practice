#include <stdio.h>

int main(){
    int a, b, c;
    scanf("%d %d %d", &a, &b, &c);
    long long int result = a;
    
    for(int i = 0; i < c - 1; i++){
        result = result * b;
    }
    
    printf("%lld", result);
    
    return 0;
}
