#include <stdio.h>

int main(){
    long long int h, b, c, s;
    scanf("%lld %lld %lld %lld", &h, &b, &c, &s);
    long long int sum = h * b * c * s;
    float result = sum / 8;
    printf("%.1f MB", result / (1024 * 1024));
    
    return 0;
}
