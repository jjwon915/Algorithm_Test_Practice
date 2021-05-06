#include <stdio.h>

int main(){
    int a, m, d, n;
    scanf("%d %d %d %d", &a, &m, &d, &n);

    long long int result = a;
    
    for(int i = 0; i < n - 1; i++){
        result = result * m + d;    
    }
    
    printf("%lld", result);
    
    return 0;
}

