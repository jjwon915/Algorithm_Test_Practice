#include <stdio.h>

int main(){
    char c;
    while(1){
        scanf("%c", &c);
        if(c == 'q'){
            printf("%c", c);
            break;
        }
        else
            printf("%c", c);
    }
    
    return 0;
}
