#include <stdio.h>

int main(){
    int year;
    int month;
    int day;
    
    scanf("%d.%d.%d", &year, &month, &day);
    printf("%0004d.%02d.%02d", year, month, day);
    
    return 0;
}
