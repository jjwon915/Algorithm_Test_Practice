#include <stdio.h>

int main(){
    int numbers[10];
    int result = 0;
    
    for(int i = 0; i < 10; i++){
        scanf("%d", &numbers[i]);
        numbers[i] = numbers[i] % 42;
    }
    
    for(int i = 0; i < 10; i++){
        int cnt = 0;
        for(int j = i + 1; j < 10; j++){
            if(numbers[i] == numbers[j])
                cnt++;
        }
        if(cnt == 0)
            result++;
    }
    
    printf("%d", result);
    
    return 0;
}