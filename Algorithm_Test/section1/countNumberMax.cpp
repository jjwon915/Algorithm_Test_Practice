// 가장 많이 사용된 자릿수
#include <stdio.h>
using namespace std;
#pragma warning(disable: 4996)

int cnt[10];
int main() {
	//freopen("input.txt", "rt", stdin);

	int digit, max = -2147000000, res;
	char a[101];
	scanf("%s", &a);

	for(int i = 0; a[i] != '\0'; i++){
		digit = a[i] - 48;
		cnt[digit]++;
	}
	
	for (int i = 0; i < 10; i++) {
		if (cnt[i] > max) {
			max = cnt[i];
			res = i;
		}
		
		if (cnt[i] == max && i > res) {
			res = i;
		}
	}

	printf("%d", res);

	return 0;
}