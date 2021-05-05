#include <stdio.h>

int main(){
    int num,sum = 0;
    scanf("%d",&num);
    int i = 0;
    
    while(1){
        i++;
        sum+=i;
        if(sum>=num){
            break;
        }
    }
    printf("%d",i);
    return 0;
}
