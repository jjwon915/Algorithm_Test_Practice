// 연속된 자연수의 합
#include <stdio.h>
#include <algorithm>
#include <vector>
using namespace std;
#pragma warning(disable: 4996)

int main() {
	//freopen("input.txt", "rt", stdin);
	
	int n, a = 1, cnt = 0, tmp, i;
	scanf("%d", &n);

	tmp = n;
	n--;
	while (n > 0) {
		a++;
		n = n - a;

		if (n % a == 0) {
			for (i = 1; i < a; i++) {
				printf("%d + ", (n / a) + i);
			}
			printf("%d = %d\n", (n / a) + i, tmp);
			cnt++;
		}
	}
	printf("%d\n", cnt);
	
	return 0;
}