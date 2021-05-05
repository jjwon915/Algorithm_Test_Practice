#include <stdio.h>

int main(){
    char a, x = 'a';
    scanf("%c", &a);
    
    do{
        printf("%c ", x);
        x++;
    } while(x <= a);
    
    return 0;
}
