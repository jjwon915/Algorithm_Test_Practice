﻿#include <stdio.h>

int main(){
    int n;
    
    while(1){
        scanf("%d", &n);
        if(n != 0)
            printf("%d\n", n);
        else
            break;
    }
    
    return 0;
}
